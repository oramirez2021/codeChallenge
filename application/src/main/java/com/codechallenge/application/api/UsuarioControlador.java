package com.codechallenge.application.api;

import com.codechallenge.application.model.Usuario;
import com.codechallenge.application.service.UsuarioServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/api") @RequiredArgsConstructor
public class UsuarioControlador {
    private final UsuarioServicio usuarioServicio;
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getUsuarios(){
        return ResponseEntity.ok().body(usuarioServicio.getUsuarios());
    }
}
