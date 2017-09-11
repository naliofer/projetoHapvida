package br.com.rodrigo.visao;

import java.io.Serializable;

import br.com.rodrigo.model.Produto;

public class ProdutoVisao implements Serializable {

	private static final long serialVersionUID = -748028659659769879L;

	private Produto produto;
	
	public ProdutoVisao() {
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
