package com.generation.ecommerce_informatica.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.generation.ecommerce_informatica.entities.Pedido;
import com.generation.ecommerce_informatica.services.PedidoService;


@RestController
@RequestMapping("/pedidos")
@CrossOrigin("*")
public class PedidoController {


    private final PedidoService service;


    public PedidoController(PedidoService service) {
        this.service = service;
    }



    // LISTAR TODOS OS PEDIDOS
    @GetMapping
    public ResponseEntity<List<Pedido>> listarTodos(){

        return ResponseEntity.ok(service.listarTodos());
    }



    // BUSCAR PEDIDO POR ID
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id){

        return ResponseEntity.ok(service.buscarPorId(id));
    }



    // CADASTRAR PEDIDO
    @PostMapping
    public ResponseEntity<Pedido> cadastrar(@RequestBody Pedido pedido){

        return ResponseEntity.ok(service.cadastrar(pedido));
    }



    // ATUALIZAR PEDIDO
    @PutMapping
    public ResponseEntity<Pedido> atualizar(@RequestBody Pedido pedido){

        return ResponseEntity.ok(service.atualizar(pedido));
    }



    // DELETAR PEDIDO
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id){

        service.deletar(id);

        return ResponseEntity.ok().build();
    }



    // PESQUISA PERSONALIZADA
    // Exemplo:
    // GET /pedidos/pesquisa?cliente=Patrick
    @GetMapping("/pesquisa")
    public ResponseEntity<List<Pedido>> pesquisarCliente(
            @RequestParam String cliente){

        return ResponseEntity.ok(service.pesquisarCliente(cliente));
    }


}