package com.andorialabs.creando_3d.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andorialabs.creando_3d.modelo.Pedido;
import com.andorialabs.creando_3d.persistencia.PedidoRepositorio;

@Service
public class PedidoServicio {

	@Autowired
	private PedidoRepositorio repositorio;

	public List<Pedido> listarPedidos() {
		return repositorio.findAll();
	}

	public Pedido getPedido(Integer idPedido) {
		return repositorio.findById(idPedido).get();
	}
	
	public Pedido guardar(Pedido p) {
		return repositorio.save(p);
	}

	public Pedido actualizar(Pedido p) {
		return repositorio.save(p);
	}

	public void eliminar(Integer idPedido) {
		repositorio.deleteById(idPedido);
	}
}