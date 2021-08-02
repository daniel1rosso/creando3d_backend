package com.andorialabs.creando_3d.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cliente {
	@Id
	@GeneratedValue
	private long id;
	
	private String nombre;
	private String apellido;
	private String contacto;
	
	
}
