package com.andorialabs.creando_3d.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
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
