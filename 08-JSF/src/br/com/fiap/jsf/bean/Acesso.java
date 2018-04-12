package br.com.fiap.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Acesso {

	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void logar() {
		if(login.equals("FIAP") && senha.equals("FIAP2018")) {
			System.out.println("Logado");
		}else {
			System.out.println("Usuário e senha inválidos!");
		}
	}
}
