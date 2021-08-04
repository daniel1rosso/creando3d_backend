package com.andorialabs.creando_3d.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andorialabs.creando_3d.modelo.Color;
import com.andorialabs.creando_3d.persistencia.ColorRepositorio;

@Service
public class ColorServicio {

	@Autowired
	private ColorRepositorio repositorioColor;

	public List<Color> listarColores() {
		return repositorioColor.findAll();
	}

	public Color getColor(Integer idColor) {
		return repositorioColor.findById(idColor).get();
	}

	public Color guardar(Color e) {
		return repositorioColor.save(e);
	}

	public Color actualizar(Color e) {
		return repositorioColor.save(e);
	}

	public void eliminar(Integer idColor) {
		repositorioColor.deleteById(idColor);
	}

}
