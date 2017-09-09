package controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import entidade.Produto;

@ManagedBean(name="produtoMB")
public class ProdutoMB implements Serializable {

	private static final long serialVersionUID = 3475173918392220300L;

	private Produto produto;
	
	private List<Produto> produtos;
	
	@PostConstruct
	public void init() {
		
	}
	
	public void salvar() {
		if (validaCampos()) {
			if (produto.getCodigo() != null) {
				salvarInclusao(produto);
			} else {
				salvarEdição(produto);
			}
		}
	}

	private void salvarEdição(Produto prod) {
		// TODO Auto-generated method stub
		
	}

	private void salvarInclusao(Produto prod) {
		// TODO Auto-generated method stub
		
	}

	private boolean validaCampos() {
		if (produto.getNome() != null && produto.getValor() != null) {
			return true;
		} else {
			return false;
		}
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
