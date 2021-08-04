package com.andorialabs.creando_3d.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andorialabs.creando_3d.modelo.Estado;
import com.andorialabs.creando_3d.persistencia.EstadoRepositorio;

@Service
public class EstadoServicio {

	@Autowired
	private EstadoRepositorio repositorioEstado;

	public List<Estado> listarEstados() {
		return repositorioEstado.findAll();
	}

	public Estado getEstado(Integer idEstado) {
		return repositorioEstado.findById(idEstado).get();
	}

	public Estado guardar(Estado e) {
		return repositorioEstado.save(e);
	}

	public Estado actualizar(Estado e) {
		return repositorioEstado.save(e);
	}

	public void eliminar(Integer idEstado) {
		repositorioEstado.deleteById(idEstado);
	}
	
}
