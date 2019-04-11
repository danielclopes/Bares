package br.pucrs.fds.entity;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = -3318413689012395434L;

	private String nome;
	private String cpf;
	private int idade;
	private String genero;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, int idade, String genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
