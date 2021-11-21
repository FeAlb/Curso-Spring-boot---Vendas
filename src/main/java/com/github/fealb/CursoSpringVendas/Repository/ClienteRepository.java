package com.github.fealb.CursoSpringVendas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.fealb.CursoSpringVendas.Entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
