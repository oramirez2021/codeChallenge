package com.codechallenge.application.repository;

import com.codechallenge.application.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepo extends JpaRepository<Rol,Long> {
    Rol findByName(String nombreRol);
}
