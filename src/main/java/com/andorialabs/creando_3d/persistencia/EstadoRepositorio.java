package com.andorialabs.creando_3d.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.andorialabs.creando_3d.modelo.Estado;

@Repository
public interface EstadoRepositorio extends  JpaRepository<Estado, Integer>{

}
