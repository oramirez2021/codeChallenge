package com.codechallenge.application.api;

import com.codechallenge.application.model.Rol;
import com.codechallenge.application.model.Usuario;
import com.codechallenge.application.service.UsuarioServicio;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController @RequestMapping("/api") @RequiredArgsConstructor
public class UsuarioControlador {
    private final UsuarioServicio usuarioServicio;
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getUsuarios(){
        return ResponseEntity.ok().body(usuarioServicio.getUsuarios());
    }

    @PostMapping("usuario/guardar")
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/usuario/guardar").toUriString());
        return ResponseEntity.created(uri).body(usuarioServicio.guardarUsuario(usuario));
    }
    @PostMapping("rol/guardar")
    public ResponseEntity<Rol> guardarRol(@RequestBody Rol rol){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/rol/guardar").toUriString());
        return ResponseEntity.created(uri).body(usuarioServicio.guardarRol(rol));
    }

    @PostMapping("rol/agregarAUsuario")
    public ResponseEntity<?> adicionarRolAUsuario(@RequestBody RolAUsuario form){
        usuarioServicio.adicionarRolAUsuario(form.getNombreUsuario(),form.getNombreRol());
        return ResponseEntity.ok().build();
    }
}
@Data
class RolAUsuario{
    private String nombreUsuario;
    private String nombreRol;
}
