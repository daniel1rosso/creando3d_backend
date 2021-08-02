package com.andorialabs.creando_3d.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andorialabs.creando_3d.logica.ClienteServicio;
import com.andorialabs.creando_3d.modelo.Cliente;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,  RequestMethod.PUT })
@RequestMapping("/cliente")
public class ClienteControlador {
	@Autowired
	private ClienteServicio servicio;

	@GetMapping
	public List<Cliente> listarClasificaciones(){
		return servicio.listarClientes();
	}

	@GetMapping(value="/{idCliente}")
	public Cliente getCliente(@PathVariable(name="idCliente") Integer idCliente) {
		return servicio.getCliente(idCliente);
	}
	
	@PostMapping
	public Cliente guardar(@RequestBody Cliente c) {
		return servicio.guardar(c);
	}

	@RequestMapping(value="/{idCliente}", method=RequestMethod.PUT)
	public Cliente actualizar(@RequestBody Cliente c, @PathVariable(name="idCliente") Integer idCliente) {
		return servicio.actualizar(c);
	}

	@RequestMapping(value="/{idCliente}", method=RequestMethod.DELETE)
	public void eliminar(@PathVariable(name="idCliente") Integer idCliente) {
		servicio.eliminar(idCliente);
	}
}
