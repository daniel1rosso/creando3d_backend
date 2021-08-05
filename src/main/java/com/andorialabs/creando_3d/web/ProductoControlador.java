package com.andorialabs.creando_3d.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andorialabs.creando_3d.logica.ProductoServicio;
import com.andorialabs.creando_3d.modelo.Producto;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,  RequestMethod.PUT })
@RequestMapping("/producto")
public class ProductoControlador {

	@Autowired
	private ProductoServicio servicio;

	@GetMapping
	public List<Producto> listarProductos(){
		return servicio.listarProductos();
	}

	@GetMapping(value="/{idProducto}")
	public Producto getProducto(@PathVariable(name="idProducto") Long idProducto) {
		return servicio.getProducto(idProducto);
	}

	@PostMapping
	public Producto guardar(@RequestBody Producto p) {
		return servicio.guardar(p);
	}

	
    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable(name="id")Long id, @RequestBody Producto p){
    	System.out.print(p.getId());
       
        return servicio.actualizar(p);
    }
	

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void eliminar(@PathVariable(name="id") Long id) {
		servicio.eliminar(id);
	}

}
