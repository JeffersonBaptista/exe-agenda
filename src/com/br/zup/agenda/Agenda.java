package com.br.zup.agenda;

public class Agenda {
	
	private String nome;
	private String telefone;
	
	public Agenda(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public String toString() {
		String modelo ="";
		modelo += "Nome -> "+ this.getNome()+" / Telefone -> "+ this.getTelefone();
		
		return modelo;
	}
	

}
