package com.codechallenge.application.repository;

import com.codechallenge.application.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    Usuario findByUserName(String nombreUsuario);
}
