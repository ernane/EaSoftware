package com.br.easoftware.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.br.easoftware.modelo.Departamento;
import com.br.easoftware.modelo.Funcionario;

public class Modelo2_1 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Departamento d = new Departamento();
		d.setNome("Desenvolvimento");
		
		Funcionario f1 = new Funcionario();
		f1.setNome("João da Silva Junior");
		f1.setDepartamento(d);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Carlos Sousa");
		f2.setDepartamento(d);
		
		Funcionario f3 = new Funcionario();
		f3.setNome("Ana Clara Martins");
		f3.setDepartamento(d);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(d);
		em.persist(f1);
		em.persist(f2);
		em.persist(f3);
		
		tx.commit();
		em.close();
		
	}

}
