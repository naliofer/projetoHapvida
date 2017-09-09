package entidade;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 7106801829663849989L;

	private Integer codigo;
	private String nome;
	private Double valor;

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
	
}
