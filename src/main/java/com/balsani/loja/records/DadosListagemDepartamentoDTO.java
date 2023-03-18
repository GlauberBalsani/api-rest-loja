package com.balsani.loja.records;

import com.balsani.loja.model.Departamento;

public record DadosListagemDepartamentoDTO(Long id, String nome) {
    public DadosListagemDepartamentoDTO(Departamento departamento) {
        this(departamento.getId(), departamento.getNome());
    }
}
