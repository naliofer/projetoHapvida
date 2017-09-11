 package br.com.rodrigo.controller;

import java.io.Serializable;
import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.rodrigo.model.Produto;
import br.com.rodrigo.uteis.Uteis;

@ViewScoped
@ManagedBean(name="produtoListMB")
public class ProdutoListMB extends Bean implements Serializable {

	private static final long serialVersionUID = -4951562662085759483L;
	
	private List<Produto> produtoList;
	
	@PostConstruct
	public void init() {
		if (Uteis.produtos == null || Uteis.produtos.isEmpty()) {
			Uteis.produtos = new ArrayList<Produto>();
		}
		produtoList = Uteis.produtos;
	}

	public void excluir(Produto produto){
		Uteis.produtos.remove(produto);
	}

	public List<Produto> getProdutoList() {
		return produtoList;
	}

	public void setProdutoList(List<Produto> produtoList) {
		this.produtoList = produtoList;
	}
	
	public String incluir() {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
		Produto produto = new Produto();
		produto.setAcao("incluir");
		
		putFlash("produto", produto);
		return "/sistema/cadastrarProduto.xhtml";
	}
	
	public String editar(Produto prod) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
		prod.setAcao("editar");
		
		putFlash("produto", prod);
		return "/sistema/cadastrarProduto.xhtml";
	}
}