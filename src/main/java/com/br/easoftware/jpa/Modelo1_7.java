package com.br.easoftware.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.br.easoftware.modelo.Livro;

public class Modelo1_7 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createQuery("SELECT l FROM Livro l ORDER BY l.preco DESC",
				Livro.class);

		List<Livro> livros = q.getResultList();
		for (Livro livro : livros) {
			System.out.println(livro.getNome() + " - " + livro.getPreco());
		}
	}
}
