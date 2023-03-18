package com.balsani.loja.records;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroDepartamentoDTO(
        @NotBlank
        String nome) {
}
