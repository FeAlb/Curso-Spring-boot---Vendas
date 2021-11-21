package com.github.fealb.CursoSpringVendas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.fealb.CursoSpringVendas.Entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
