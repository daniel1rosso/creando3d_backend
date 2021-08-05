package com.andorialabs.creando_3d.persistencia;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.andorialabs.creando_3d.modelo.Pedido;

@Repository
public interface PedidoRepositorio extends PagingAndSortingRepository<Pedido, Long>{
	
    public Iterable<Pedido> findByColorContainingIgnoreCase(String color);
    
    public Page<Pedido> findByColorContainingIgnoreCase(String color, Pageable pagina);

}
