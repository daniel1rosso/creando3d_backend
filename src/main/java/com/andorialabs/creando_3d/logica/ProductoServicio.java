package com.andorialabs.creando_3d.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andorialabs.creando_3d.persistencia.ProductoRepositorio;
import com.andorialabs.creando_3d.modelo.Producto;

@Service
public class ProductoServicio {

	@Autowired
	private ProductoRepositorio repositorio;

	public List<Producto> listarProductos() {
		return repositorio.findAll();
	}

	public Producto getProducto(Integer idProducto) {
		return repositorio.findById(idProducto).get();
	}

	public Producto guardar(Producto p) {
		return repositorio.save(p);
	}

	public Producto actualizar(Producto p) {
		return repositorio.save(p);
	}

	public void eliminar(Integer idProducto) {
		repositorio.deleteById(idProducto);
	}
}