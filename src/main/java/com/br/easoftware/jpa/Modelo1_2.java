package com.br.easoftware.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.br.easoftware.modelo.Autor;
import com.br.easoftware.modelo.Livro;

public class Modelo1_2 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createQuery("select p from Autor p join p.livros",
				Autor.class);

		List<Autor> autores = q.getResultList();
		for (Autor autor : autores) {
			System.out.println(autor.getNome());

			List<Livro> livros = (List<Livro>) autor.getLivros();
			for (Livro livro : livros) {
				System.out.println("Título: " + livro.getNome() + " "
						+ "Preço: " + livro.getPreco());
			}
		}

	}

}
