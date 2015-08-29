package com.br.easoftware.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeradorBD {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EaSoftware");
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();

	}

}
