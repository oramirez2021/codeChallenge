package com.codechallenge.application.service;

import com.codechallenge.application.model.Cliente;
import com.codechallenge.application.model.Cuenta;

public interface ClienteServicio {
    Cliente crearCliente(Cliente cliente);
    Cliente getCliente(Long clienteId);
    void eliminarCliente(Long clienteId);
}
