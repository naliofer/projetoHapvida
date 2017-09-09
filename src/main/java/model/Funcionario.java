package model;

import java.io.Serializable;

public class Funcionario implements Serializable {

	private static final long serialVersionUID = 7106801829663849989L;

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
