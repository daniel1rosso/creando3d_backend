package com.andorialabs.creando_3d.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.andorialabs.creando_3d.modelo.Pedido;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{
	
	
}
