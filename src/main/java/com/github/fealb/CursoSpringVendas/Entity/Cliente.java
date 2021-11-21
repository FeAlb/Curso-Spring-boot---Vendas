package com.github.fealb.CursoSpringVendas.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "TB_CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CLIE")
	private Integer id;
	
	@Column(name = "NUM_DOCM_CLIE", length = 11)
	private String cpf;
	
	@Column(name = "NOM_CLIE", length = 50)
	private String nome;
	
	@Column(name = "DAT_CAD_CLIE")
	private LocalDateTime dataCadastro;
	
	//mapped by sempre o nome do atributo
	//Por padrão, FETCH TYPE é SEMPRE LAZY
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Pedido> listaDePedidos = new ArrayList<Pedido>();
		
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<Pedido> getListaDePedidos() {
		return listaDePedidos;
	}
	public void setListaDePedidos(List<Pedido> listaDePedidos) {
		this.listaDePedidos = listaDePedidos;
	}
	
	

	
	
}
