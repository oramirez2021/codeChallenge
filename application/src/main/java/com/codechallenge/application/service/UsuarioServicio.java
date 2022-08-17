package com.codechallenge.application.service;

import com.codechallenge.application.model.Rol;
import com.codechallenge.application.model.Usuario;

import java.util.List;

public interface UsuarioServicio {
    Usuario guardarUsuario(Usuario usuario);
    Rol guardarRol(Rol rol);
    void adicionarRolAUsuario(String nombreUsuario, String nombreRol);
    Usuario getUsuario(String nombreUsuario);
    List<Usuario> getUsuarios();

}
