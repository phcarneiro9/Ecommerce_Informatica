package com.generation.ecommerce_informatica.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.generation.ecommerce_informatica.entities.Pedido;
import com.generation.ecommerce_informatica.repositories.PedidoRepository;


@Service
public class PedidoService {


    private final PedidoRepository repository;


    public PedidoService(PedidoRepository repository){

        this.repository=repository;
    }



    public List<Pedido> listarTodos(){

        return repository.findAll();
    }



    public Pedido buscarPorId(Long id){

        return repository.findById(id)
                .orElseThrow();
    }



    public Pedido cadastrar(Pedido pedido){

        return repository.save(pedido);
    }



    public Pedido atualizar(Pedido pedido){

        buscarPorId(pedido.getId());

        return repository.save(pedido);
    }



    public void deletar(Long id){

        buscarPorId(id);

        repository.deleteById(id);
    }



    public List<Pedido> pesquisarCliente(String cliente){

        return repository.findByClienteNomeContainingIgnoreCase(cliente);
    }


}