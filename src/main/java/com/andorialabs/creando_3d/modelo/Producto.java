package com.andorialabs.creando_3d.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public float getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public float getLargo() {
		return largo;
	}
	public void setLargo(float largo) {
		this.largo = largo;
	}
	public float getGramos() {
		return gramos;
	}
	public void setGramos(float gramos) {
		this.gramos = gramos;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getPrecio_estimativo() {
		return precio_estimativo;
	}
	public void setPrecio_estimativo(double precio_estimativo) {
		this.precio_estimativo = precio_estimativo;
	}
	
	
}





