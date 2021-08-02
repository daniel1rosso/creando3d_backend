package com.andorialabs.creando_3d.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Pedido {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private Producto producto;

	@ManyToOne
	private Estado estado;
	
	private int cantidad;
	private String color;
	private Date fecha_entrega;
	private double precio;
}
