package com.br.easoftware.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Autor {

	@Id
	@GeneratedValue
	private long id;

	private String nome;

	@ManyToMany(cascade = CascadeType.ALL)
	private Collection<Livro> livros = new ArrayList<Livro>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
