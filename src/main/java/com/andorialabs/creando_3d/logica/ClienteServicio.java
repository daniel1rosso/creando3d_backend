package com.andorialabs.creando_3d.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andorialabs.creando_3d.modelo.Cliente;
import com.andorialabs.creando_3d.persistencia.ClienteRepositorio;

@Service
public class ClienteServicio {

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	public List<Cliente> getClientes() {
		return clienteRepositorio.findAll();
	}
}
