package com.br.easoftware.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
		@NamedQuery(name = "Livro.Minimo", query = "SELECT l FROM Livro l WHERE l.preco > :preco"),
		@NamedQuery(name = "Livro.all", query = "SELECT l FROM Livro l") })
@Entity
public class Livro {

	@Id
	@GeneratedValue
	private long id;

	private String nome;
	private double preco;

	public Livro() {
	}

	public Livro(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
