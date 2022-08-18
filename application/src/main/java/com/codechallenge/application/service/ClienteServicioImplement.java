package com.codechallenge.application.service;

import com.codechallenge.application.model.Cliente;
import com.codechallenge.application.repository.ClienteRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class ClienteServicioImplement implements ClienteServicio{
    private final ClienteRepo clienteRepo;
    @Override
    public Cliente crearCliente(Cliente cliente) {
        log.info("Creando un nuevo cliente llamado {} en base de datos");
        return clienteRepo.save(cliente);
    }
}
