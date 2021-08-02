package com.andorialabs.creando_3d.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andorialabs.creando_3d.modelo.Pedido;
import com.andorialabs.creando_3d.modelo.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
	
}
