package com.br.easoftware.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.br.easoftware.modelo.Livro;

public class Modelo1_4 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createNamedQuery("Livro.Minimo", Livro.class);
		q.setParameter("preco", 70.0);

		List<Livro> livros = q.getResultList();
		for (Livro livro : livros) {
			System.out.println(livro.getNome() + " - " + livro.getPreco());
		}
	}
	
	
}
