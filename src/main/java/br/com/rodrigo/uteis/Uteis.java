package br.com.rodrigo.uteis;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.rodrigo.model.Produto;

public class Uteis {
	
	public static List<Produto> produtos;
	
	public static void Mensagem(String mensagem){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		
		facesContext.addMessage(null, new FacesMessage("Alerta",mensagem));
	}

	public static void MensagemAtencao(String mensagem){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção:", mensagem));
	}
	
	public static void MensagemInfo(String mensagem){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", mensagem));
	}
	
}
