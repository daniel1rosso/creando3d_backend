package com.andorialabs.creando_3d.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
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





