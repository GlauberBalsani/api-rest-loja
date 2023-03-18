package com.balsani.loja.model;

import com.balsani.loja.model.Departamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;


    public Produto(String nome, String descricao, Departamento departamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.departamento = departamento;
    }

}
