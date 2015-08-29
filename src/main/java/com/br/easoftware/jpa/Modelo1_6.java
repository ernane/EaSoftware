package com.br.easoftware.jpa;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Modelo1_6 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createQuery("SELECT AVG(l.preco) FROM Livro l", Double.class);
		Double media = (Double) q.getSingleResult();

		System.out.println(media);
	}

}
