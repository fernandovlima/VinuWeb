package br.com.vinu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.vinu.entidades.Usuario;


public class UsuarioDao implements Dao<Usuario>{
	
	EntityManagerFactory emf = Conexao.getInstance();


	@Override
	public void adicionar(Usuario usuario) {
		EntityManager em = emf.createEntityManager();		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
	}

	@Override
	public void editar(Usuario usuario) {
		EntityManager em = emf.createEntityManager();		
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
	}
 
	@Override
	public void excluir(Usuario usuario) {
		EntityManager em = emf.createEntityManager();		
		em.getTransaction().begin();
		em.remove(em.merge(usuario));
		em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Usuario a");
		return q.getResultList();
	}

	@Override
	public Usuario buscarPorId(Long id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Usuario.class, id);
	}

	

	
	
}
