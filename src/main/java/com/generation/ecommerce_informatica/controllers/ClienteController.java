package com.generation.ecommerce_informatica.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.generation.ecommerce_informatica.entities.Cliente;
import com.generation.ecommerce_informatica.services.ClienteService;


@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {


    private final ClienteService service;


    public ClienteController(ClienteService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodos(){

        return ResponseEntity.ok(service.listarTodos());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){

        return ResponseEntity.ok(service.buscarPorId(id));
    }


    @PostMapping
    public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente){

        return ResponseEntity.ok(service.cadastrar(cliente));
    }


    @PutMapping
    public ResponseEntity<Cliente> atualizar(@RequestBody Cliente cliente){

        return ResponseEntity.ok(service.atualizar(cliente));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id){

        service.deletar(id);

        return ResponseEntity.ok().build();
    }

}