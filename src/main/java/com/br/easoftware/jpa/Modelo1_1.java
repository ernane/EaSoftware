package com.br.easoftware.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.br.easoftware.modelo.Autor;
import com.br.easoftware.modelo.Livro;

public class Modelo1_1 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();

		Autor a1 = new Autor("Mauricio Aniche");
		Autor a2 = new Autor("Maurício Samy Silva");
		Autor a3 = new Autor("André Milani");

		Livro l1 = new Livro("Test-Driven Development com JAVA", 69.90);
		Livro l2 = new Livro("Test-Driven Development com .NET", 69.90);
		Livro l3 = new Livro("Test-Driven Development com PHP", 69.90);
		Livro l4 = new Livro("Test-Driven Development com RUBY", 69.90);

		Livro l5 = new Livro(
				"HTML5 - A Linguagem de Marcação que Revolucionou a Web", 75.00);
		Livro l6 = new Livro("Foundation for Sites", 45.00);
		Livro l7 = new Livro("Web Design Responsivo", 73.00);
		
		Livro l8 = new Livro("Programando para iPhone e iPad", 89.00);
		Livro l9 = new Livro("PostgreSQL - Guia do Programador", 72.00);

		a1.getLivros().add(l1);
		a1.getLivros().add(l2);
		a1.getLivros().add(l3);
		a1.getLivros().add(l4);

		a2.getLivros().add(l5);
		a2.getLivros().add(l6);
		a2.getLivros().add(l7);

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(a1);
		em.persist(l1);
		em.persist(l2);
		em.persist(l3);
		em.persist(l4);

		em.persist(a2);
		em.persist(l5);
		em.persist(l6);
		em.persist(l7);
		
		em.persist(a3);
		em.persist(l8);
		em.persist(l9);

		tx.commit();
		em.close();
	}

}
