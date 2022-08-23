package com.codechallenge.application.service;

import com.codechallenge.application.model.Cliente;
import com.codechallenge.application.model.Cuenta;
import com.codechallenge.application.model.Persona;
import com.codechallenge.application.repository.ClienteRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class ClienteServicioImplement implements ClienteServicio{
    private final ClienteRepo clienteRepo;
    @Override
    public Cliente getCliente(Long clienteId) {
        Optional<Cliente> cliente = clienteRepo.findById(clienteId);
        log.info("Se obtiene cliente {}",cliente);
        return cliente.get();
    }


    @Override
    public Cliente crearCliente(Cliente cliente) {
        log.info("Creando un nuevo cliente llamado {} en base de datos");
        return clienteRepo.save(cliente);
    }

    @Override
    public void eliminarCliente(Long clienteId) {
        Cliente cliente = clienteRepo.getById(clienteId);
        log.info("Eliminando cliente {}",cliente);
        clienteRepo.delete(cliente);
    }
}
