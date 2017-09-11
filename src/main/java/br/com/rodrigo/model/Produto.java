package br.com.rodrigo.model;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 8700075225808511651L;

	private Integer codigo;
	private String nome;
	private Double valor;
	private String acao;
	
	public Produto() {
	}

	public Produto(Integer codigo, String nome, Double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
}