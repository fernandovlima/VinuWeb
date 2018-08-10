package br.com.vinu.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	private static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vinu_vinhos");
	
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}
	
}
