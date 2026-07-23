package com.generation.ecommerce_informatica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.ecommerce_informatica.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}