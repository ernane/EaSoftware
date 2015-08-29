package com.br.easoftware.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@NamedQuery(name = "Funcionario.Departamento", query = "select new Funcionario(f) from Funcionario f where f.nome like :nome")
@Entity
public class Funcionario {

	@Id
	@GeneratedValue
	private long id;

	private String nome;

	@ManyToOne
	private Departamento departamento;
	
	public Funcionario() {

	}

	public Funcionario(Funcionario f) {
		this.setId(f.getId());
		this.setNome(f.getNome());
		this.setDepartamento(f.getDepartamento());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}
