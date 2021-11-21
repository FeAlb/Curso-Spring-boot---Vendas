package com.github.fealb.CursoSpringVendas.Entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "TB_ITEM_PEDIDO")
public class ItemPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemPedidoID id;
	
	@Column(name = "QTD_PROD")
	private Integer quantidade;
	
	@Column(name="PREC_PROD")
	private BigDecimal preco;

	public ItemPedidoID getId() {
		return id;
	}

	public void setId(ItemPedidoID id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
	
}
