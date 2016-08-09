package br.com.caelum.financas.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteJPA {

	public static void main(String[] args) {
		Conta conta = new Conta("Camilo", "Banco do Povo", "6579", "214565");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("financas");
	
	        EntityManager manager = entityManagerFactory.createEntityManager();
	        
	        manager.getTransaction().begin();
	        manager.persist(conta);
	        manager.getTransaction().commit();
	        
	        manager.close();
	}
}
