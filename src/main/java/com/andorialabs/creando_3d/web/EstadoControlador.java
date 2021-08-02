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

import com.andorialabs.creando_3d.logica.EstadoServicio;
import com.andorialabs.creando_3d.modelo.Estado;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,  RequestMethod.PUT })
@RequestMapping("/estado")
public class EstadoControlador {

	@Autowired
	private EstadoServicio servicioEstado;

	@GetMapping
	public List<Estado> listarEstados(){
		return servicioEstado.listarEstados();
	}

	@GetMapping(value="/{idEstado}")
	public Estado getEstado(@PathVariable(name="idEstado") Integer idEstado) {
		return servicioEstado.getEstado(idEstado);
	}

	@PostMapping
	public Estado guardar(@RequestBody Estado e) {
		return servicioEstado.guardar(e);
	}

	@RequestMapping(value="/{idEstado}", method=RequestMethod.PUT)
	public Estado actualizar(@RequestBody Estado e, @PathVariable(name="idEstado") Integer idEstado) {
		return servicioEstado.actualizar(e);
	}

	@RequestMapping(value="/{idEstado}", method=RequestMethod.DELETE)
	public void eliminar(@PathVariable(name="idEstado") Integer idEstado) {
		servicioEstado.eliminar(idEstado);
	}

}
