package com.balsani.loja.model;

import com.balsani.loja.records.DadosCadastroDepartamentoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departamento")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Produto> produtos = new ArrayList<>();



    public Departamento(DadosCadastroDepartamentoDTO dadosDepartamento) {
        this.nome = dadosDepartamento.nome();
    }
}
