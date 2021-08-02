package com.andorialabs.creando_3d.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andorialabs.creando_3d.modelo.Cliente;
import com.andorialabs.creando_3d.persistencia.ClienteRepositorio;

@Service
public class ClienteServicio {

	@Autowired
	private ClienteRepositorio repositorio;

	public List<Cliente> listarClientes() {
		return repositorio.findAll();
	}

	public Cliente getCliente(Integer idCliente) {
		return repositorio.findById(idCliente).get();
	}

	public Cliente guardar(Cliente c) {
		return repositorio.save(c);
	}

	public Cliente actualizar(Cliente c) {
		return repositorio.save(c);
	}

	public void eliminar(Integer idCliente) {
		repositorio.deleteById(idCliente);
	}
}
