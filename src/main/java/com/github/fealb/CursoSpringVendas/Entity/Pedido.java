package com.github.fealb.CursoSpringVendas.Entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "TB_PEDIDO")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_PEDIDO")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE")
	private Cliente cliente;
	
	@Column(name = "DAT_CAD_PED")
	private LocalDateTime dataPedido;
	
	@OneToMany(mappedBy = "id.pedido")
	private List<ItemPedido> listaDeItens;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}

	public List<ItemPedido> getListaDeItens() {
		return listaDeItens;
	}

	public void setListaDeItens(List<ItemPedido> listaDeItens) {
		this.listaDeItens = listaDeItens;
	}
	
	
	
	
}
