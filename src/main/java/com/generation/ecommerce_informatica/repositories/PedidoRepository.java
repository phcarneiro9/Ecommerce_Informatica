package com.generation.ecommerce_informatica.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.ecommerce_informatica.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

    List<Pedido> findByClienteNomeContainingIgnoreCase(String nome);

}