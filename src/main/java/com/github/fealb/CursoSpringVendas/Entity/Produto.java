package com.github.fealb.CursoSpringVendas.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TB_PRODUTO")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_PRODUTO")
	private Integer id;
	
	@Column(name="NOM_PROD", length = 100)
	private String nome;
	
	@Column(name="PREC_PROD", precision = 15, scale = 2)	
	private BigDecimal preco;
	
	@Column(name="DAT_CAD_PROD")
	private LocalDateTime dataCadastro;

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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	
}
