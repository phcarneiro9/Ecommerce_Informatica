package com.generation.ecommerce_informatica.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.generation.ecommerce_informatica.entities.Cliente;
import com.generation.ecommerce_informatica.repositories.ClienteRepository;

@Service
public class ClienteService {


    private final ClienteRepository repository;


    public ClienteService(ClienteRepository repository){
        this.repository=repository;
    }


    public List<Cliente> listarTodos(){

        return repository.findAll();
    }


    public Cliente buscarPorId(Long id){

        return repository.findById(id)
                .orElseThrow();
    }


    public Cliente cadastrar(Cliente cliente){

        return repository.save(cliente);
    }


    public Cliente atualizar(Cliente cliente){

        buscarPorId(cliente.getId());

        return repository.save(cliente);
    }


    public void deletar(Long id){

        buscarPorId(id);

        repository.deleteById(id);
    }

}