package br.com.rodrigo.controller;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

public abstract class Bean {
	
	public Flash getFlash() {
		return FacesContext.getCurrentInstance().getExternalContext().getFlash();
	}
	
	public void putFlash(String chave, Object object) {
		getFlash().put(chave, object);
	}
	
	public Object getFlash(String chave) {
		Object object = getFlash().get(chave);
		
		return object;
	}
}
