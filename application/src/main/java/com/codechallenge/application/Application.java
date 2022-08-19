package com.codechallenge.application;

import com.codechallenge.application.model.*;
import com.codechallenge.application.service.ClienteServicio;
import com.codechallenge.application.service.CuentaServicio;
import com.codechallenge.application.service.MovimientoServicio;
import com.codechallenge.application.service.UsuarioServicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	CommandLineRunner run(UsuarioServicio usuarioServicio, ClienteServicio clienteServicio, CuentaServicio cuentaServicio, MovimientoServicio movimientoServicio){
		return args -> {
			usuarioServicio.guardarRol(new Rol(null,"ROL_USUARIO"));
			usuarioServicio.guardarUsuario(new Usuario(null,"Omar Ramirez","omar","1234",new ArrayList<>()));
			usuarioServicio.adicionarRolAUsuario("omar","ROL_USUARIO");
			//clienteServicio.crearCliente(new Cliente(null,"Omar","M",43,"0956485957","Guasmo Central","0998111883",null,"12345","True"));
			clienteServicio.crearCliente(new Cliente(null,"12345","True"));
			cuentaServicio.creaCuenta(new Cuenta(150,"Ahorro",500.00,"True", 3));
			movimientoServicio.crearMovimiento(new Movimiento(2L,4,"18-08-2022","Corriente",200.00,500.00,"Retiro de 200.00"));
			movimientoServicio.crearMovimiento(new Movimiento(2L,4,"15-08-2022","Athorro",200.00,500.00,"Retiro de 200.00"));
			movimientoServicio.crearMovimiento(new Movimiento(2L,4,"10-08-2022","Corriente",200.00,500.00,"Retiro de 200.00"));
		};
	}
}
