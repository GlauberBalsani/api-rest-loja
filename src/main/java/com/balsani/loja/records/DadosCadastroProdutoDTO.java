package com.balsani.loja.records;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProdutoDTO(
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotNull
        Long departamento_id ) {
}
