package com.codechallenge.application.service;

import com.codechallenge.application.model.Rol;
import com.codechallenge.application.model.Usuario;
import com.codechallenge.application.repository.RolRepo;
import com.codechallenge.application.repository.UsuarioRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UsuarioServicioImplement implements UsuarioServicio, UserDetailsService {
    private final UsuarioRepo usuarioRepo;
    private final RolRepo rolRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepo.findByUserName(username);
        if (usuario == null) {
            log.error("Usuario no encontrado");
            throw new UsernameNotFoundException("Usuario no encontrado");
        } else {
            log.info("Usuario encontrado en la base de datos: {} ", username);
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        usuario.getRoles().forEach(rol -> {
            authorities.add(new SimpleGrantedAuthority(rol.getName()));
        });
        return new org.springframework.security.core.userdetails.User(usuario.getUserName(), usuario.getPassword(), authorities);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        log.info("Guardando un nuevo usuario {} en la base de datos", usuario.getUserName());
        return usuarioRepo.save(usuario);
    }

    @Override
    public Rol guardarRol(Rol rol) {
        log.info("Guardando un nuevo rol {} en la base de datos", rol.getName());
        return rolRepo.save(rol);
    }

    @Override
    public void adicionarRolAUsuario(String nombreUsuario, String nombreRol) {
        log.info("Adicionando rol {} a usuario {}", nombreRol, nombreUsuario);
        Usuario usuario = usuarioRepo.findByUserName(nombreUsuario);
        Rol rol = rolRepo.findByName(nombreRol);
        usuario.getRoles().add(rol);
    }

    @Override
    public Usuario getUsuario(String nombreUsuario) {
        log.info("Buscando por nombre de usuario {}", nombreUsuario);
        return usuarioRepo.findByUserName(nombreUsuario);
    }

    @Override
    public List<Usuario> getUsuarios() {
        log.info("Buscando todos los usuarios");
        return usuarioRepo.findAll();
    }


}