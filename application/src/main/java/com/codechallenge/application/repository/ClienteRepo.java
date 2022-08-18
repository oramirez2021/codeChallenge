package com.codechallenge.application.repository;

import com.codechallenge.application.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente,Long> {
}
