package br.com.vinu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.vinu.entidades.Vinho;

public class VinhoDao  implements Dao<Vinho>{
	
	EntityManager em = Conexao.getInstance().createEntityManager();


	@Override
	public void adicionar(Vinho t) {
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
	public void editar(Vinho t) {
		
	}

	@Override
	public void excluir(Vinho t) {

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
	public List<Vinho> listar() {
		Query q = em.createQuery("select a from Vinho a");
		return q.getResultList();
	}

	@Override
	public Vinho buscarPorId(Long id) {
		
		return em.find(Vinho.class, id);
	}

}
