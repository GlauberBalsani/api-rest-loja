package com.balsani.loja.repository;

import com.balsani.loja.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{
}