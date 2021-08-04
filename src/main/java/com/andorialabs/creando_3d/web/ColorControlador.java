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

import com.andorialabs.creando_3d.logica.ColorServicio;
import com.andorialabs.creando_3d.modelo.Color;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,  RequestMethod.PUT })
@RequestMapping("/color")
public class ColorControlador {

	@Autowired
	private ColorServicio servicioColor;

	@GetMapping
	public List<Color> listarColores(){
		return servicioColor.listarColores();
	}

	@GetMapping(value="/{idColor}")
	public Color getColor(@PathVariable(name="idColor") Integer idColor) {
		return servicioColor.getColor(idColor);
	}

	@PostMapping
	public Color guardar(@RequestBody Color c) {
		return servicioColor.guardar(c);
	}

	@RequestMapping(value="/{idColor}", method=RequestMethod.PUT)
	public Color actualizar(@RequestBody Color c, @PathVariable(name="idColor") Integer idColor) {
		return servicioColor.actualizar(c);
	}

	@RequestMapping(value="/{idColor}", method=RequestMethod.DELETE)
	public void eliminar(@PathVariable(name="idColor") Integer idColor) {
		servicioColor.eliminar(idColor);
	}

}
