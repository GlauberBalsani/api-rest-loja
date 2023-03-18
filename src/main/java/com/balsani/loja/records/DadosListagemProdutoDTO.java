package com.balsani.loja.records;

import com.balsani.loja.model.Produto;

public record DadosListagemProdutoDTO(
        Long id,
        String nome,
        String descricao,
        DadosListagemDepartamentoDTO dadosListagemDepartamentoDTO) {

    public DadosListagemProdutoDTO(Produto produto) {
        this(produto.getId(), produto.getNome(), produto.getDescricao(), new DadosListagemDepartamentoDTO(produto.getDepartamento()));
    }
}
