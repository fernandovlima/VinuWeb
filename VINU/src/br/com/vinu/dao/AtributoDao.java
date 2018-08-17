package br.com.vinu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.vinu.entidades.Atributo;

public class AtributoDao implements Dao<Atributo> {
	
	static EntityManager em = Conexao.getInstance().createEntityManager();
	
	@Override
	public void adicionar(Atributo t) {

		try {
			em.getTransaction().begin();
			buscarPorId(t.getId());
			em.persist(t);
			em.getTransaction().commit();	
		} catch (Exception e) {
			e.getMessage().toString();
		}
		
	}

	@Override
	public void editar(Atributo t) {
		try {
			em.getTransaction().begin();
			buscarPorId(t.getId());
			em.merge(t);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage().toString();
		}
	}

	@Override
	public void excluir(Atributo t) {
		try {
			em.getTransaction().begin();
			buscarPorId(t.getId());
			em.remove(t);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage().toString();		}
	}

	@Override
	public List<Atributo> listar() {
		Query q = em.createQuery("select a from Atributo a");
		return q.getResultList();
	}

	@Override
	public Atributo buscarPorId(Long id) {
		
		return em.find(Atributo.class, id);
	}

}
