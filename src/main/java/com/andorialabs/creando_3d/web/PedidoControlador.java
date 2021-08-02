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

import com.andorialabs.creando_3d.logica.PedidoServicio;
import com.andorialabs.creando_3d.modelo.Pedido;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,  RequestMethod.PUT })
@RequestMapping("/pedido")
public class PedidoControlador {

	@Autowired
	private PedidoServicio servicio;

	@GetMapping
	public List<Pedido> listarPedidos(){
		return servicio.listarPedidos();
	}

	@GetMapping(value="/{idPedido}")
	public Pedido getPedido(@PathVariable(name="idPedido") Integer idPedido) {
		return servicio.getPedido(idPedido);
	}

	@PostMapping
	public Pedido guardar(@RequestBody Pedido p) {
		return servicio.guardar(p);
	}

	@RequestMapping(value="/{idPedido}", method=RequestMethod.PUT)
	public Pedido actualizar(@RequestBody Pedido p, @PathVariable(name="idPedido") Integer idPedido) {
		return servicio.actualizar(p);
	}

	@RequestMapping(value="/{idPedido}", method=RequestMethod.DELETE)
	public void eliminar(@PathVariable(name="idPedido") Integer idPedido) {
		servicio.eliminar(idPedido);
	}

}
