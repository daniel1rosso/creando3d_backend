package com.andorialabs.creando_3d.logica;

import org.springframework.data.domain.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andorialabs.creando_3d.modelo.Pedido;
import com.andorialabs.creando_3d.persistencia.PedidoRepositorio;

@Service
public class PedidoServicio {

	@Autowired
	private PedidoRepositorio repositorioPeddo;

	public Iterable<Pedido> listarPedidos() {
		return repositorioPeddo.findAll();
	}

	public Pedido getPedido(Long idPedido) {
		return repositorioPeddo.findById(idPedido).get();
	}
	
	public Pedido guardar(Pedido p) {
		return repositorioPeddo.save(p);
	}

	public Pedido actualizar(Pedido p) {
		return repositorioPeddo.save(p);
	}

	public void eliminar(Long idPedido) {
		repositorioPeddo.deleteById(idPedido);
	}
	
    public Iterable<Pedido> listarFiltradoPorColor(String color) {
        return repositorioPeddo.findByColorContainingIgnoreCase(color);
    }
    
    public Iterable<Pedido> listarFiltradoPorColorPaginado(String color, Pageable pagina) {
        return repositorioPeddo.findByColorContainingIgnoreCase(color,pagina);
    }
}