package com.br.easoftware.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.br.easoftware.modelo.Autor;

public class Modelo1_3 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createNamedQuery("Autor.all", Autor.class);

		List<Autor> autores = q.getResultList();
		for (Autor autor : autores) {
			System.out.println(autor.getNome());
		}
	}
}
