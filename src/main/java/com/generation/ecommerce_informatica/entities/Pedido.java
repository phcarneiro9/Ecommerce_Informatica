package com.generation.ecommerce_informatica.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name="tb_pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String produto;

    private String descricao;

    private Double valor;

    private LocalDate data;


    @ManyToOne
    @JoinColumn(name="cliente_id")
    @JsonIgnoreProperties("pedidos")
    private Cliente cliente;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }


    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto=produto;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao=descricao;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor=valor;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data=data;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente=cliente;
    }

}