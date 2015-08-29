package com.br.easoftware.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.br.easoftware.modelo.Funcionario;

public class Modelo2_2 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createNamedQuery("Funcionario.Departamento", Funcionario.class);
		q.setParameter("nome", "%Sousa%");

		List<Funcionario> funcionarios = q.getResultList();
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome());
		}
	}

}
