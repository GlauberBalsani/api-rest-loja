package com.balsani.loja.controller;

import com.balsani.loja.model.Departamento;
import com.balsani.loja.model.Produto;
import com.balsani.loja.records.DadosCadastroDepartamentoDTO;
import com.balsani.loja.records.DadosCadastroProdutoDTO;
import com.balsani.loja.records.DadosListagemProdutoDTO;
import com.balsani.loja.repository.DepartamentoRepository;
import com.balsani.loja.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class LojaController {
    @Autowired
    private DepartamentoRepository departamentoRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @PostMapping ("cadastro-departamento")
    @Transactional
    public void cadastroDepartamento(@RequestBody @Valid DadosCadastroDepartamentoDTO dadosDepartamento) {
        departamentoRepository.save(new Departamento(dadosDepartamento));

    }

    @PostMapping("cadastro-produto")
    @Transactional
    public void cadastrarProduto(@RequestBody @Valid DadosCadastroProdutoDTO dadosProduto) {
        Departamento departamento = departamentoRepository.findById(dadosProduto.departamento_id())
                .orElseThrow(() -> new RuntimeException("Departamento não encontrado"));
        produtoRepository.save(new Produto(dadosProduto.nome(), dadosProduto.descricao(), departamento));
    }

    @GetMapping
    public Page<DadosListagemProdutoDTO> produtos(@PageableDefault(size = 10, sort = {"nome"}) Pageable pageable) {
        return produtoRepository.findAll(pageable).map(DadosListagemProdutoDTO::new);
    }
}
