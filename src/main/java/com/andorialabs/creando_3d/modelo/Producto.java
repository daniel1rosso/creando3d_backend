package com.andorialabs.creando_3d.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Producto {
	@Id
	@GeneratedValue
	private long id;

	private String nombre;
	private float alto;
	private float ancho;
	private float largo;
	private float gramos;
	private double tiempo;
	private double costo;
	private double precio_estimativo;
}





