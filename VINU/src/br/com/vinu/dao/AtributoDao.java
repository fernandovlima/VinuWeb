package br.com.vinu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.vinu.entidades.Atributo;

public class AtributoDao implements Dao<Atributo> {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetoVinu");

	@Override
	public void adicionar(Atributo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Atributo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Atributo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Atributo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atributo buscarPorId(Long id) {
		EntityManager em = emf.createEntityManager();
		
		return em.find(Atributo.class, id);
	}

}
