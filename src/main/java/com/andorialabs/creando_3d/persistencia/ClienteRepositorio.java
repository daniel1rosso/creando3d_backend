package com.andorialabs.creando_3d.persistencia;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.andorialabs.creando_3d.modelo.Cliente;

@Repository
public interface ClienteRepositorio  extends JpaRepository<Cliente, Integer> {

}
