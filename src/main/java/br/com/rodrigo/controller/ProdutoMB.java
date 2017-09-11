package br.com.rodrigo.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import br.com.rodrigo.model.Produto;
import br.com.rodrigo.servico.ProdutoServico;
import br.com.rodrigo.uteis.Uteis;
import br.com.rodrigo.visao.ProdutoVisao;

@ViewScoped
@ManagedBean(name = "produtoMB")
public class ProdutoMB extends Bean implements Serializable {

	private static final long serialVersionUID = -2828691108692195837L;

	private Produto produto;

	@Inject
	private ProdutoVisao view;

	@PostConstruct
	public void init() {
		if (view == null) {
			view = new ProdutoVisao();
		}
		view.setProduto((Produto) getFlash("produto"));
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String gravar() {
		Produto prod = view.getProduto();

		if (prod.getAcao() != "incluir") {
			return gravarEdicao(prod);
		} else {
			return gravarInclusao(prod);
		}
	}

	private String gravarEdicao(Produto prod) {
		for (Produto produtoObj : Uteis.produtos) {
			if (produtoObj.getCodigo().equals(prod.getCodigo())) {

			}
		}
		return "/sistema/consultarProduto.xhtml";
	}

	private String gravarInclusao(Produto prod) {
		Uteis.produtos.add(prod);
		return "/sistema/consultarProduto.xhtml";
	}

	public ProdutoVisao getView() {
		return view;
	}

	public void setView(ProdutoVisao view) {
		this.view = view;
	}
}
