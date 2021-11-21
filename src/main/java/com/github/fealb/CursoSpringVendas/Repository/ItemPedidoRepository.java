package com.github.fealb.CursoSpringVendas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.fealb.CursoSpringVendas.Entity.ItemPedido;
import com.github.fealb.CursoSpringVendas.Entity.ItemPedidoID;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoID> {

}
