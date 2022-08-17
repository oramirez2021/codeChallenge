package com.codechallenge.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.*;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Usuario {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String nombre;
    private String userName;
    private String password;
    @ManyToMany(fetch = EAGER)
    private Collection<Rol> roles = new ArrayList<>();
}
