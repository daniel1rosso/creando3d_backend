package com.andorialabs.creando_3d.logica;

import java.util.List;
import java.util.Optional;

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

	public Producto getProducto(Long idProducto) {
		return repositorio.findById(idProducto).get();
	}

	public Producto guardar(Producto p) {
		return repositorio.save(p);
	}

	public Producto actualizar(Producto p) {
		Optional<Producto> prod=repositorio.findById(p.getId());
        if(!prod.isPresent()){
            throw new RuntimeException("No existe");
        }
        return repositorio.save(p);
	}

	public void eliminar(Long idProducto) {
		repositorio.deleteById(idProducto);
	}
}