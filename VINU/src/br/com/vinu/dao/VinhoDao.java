package br.com.vinu.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.vinu.entidades.Vinho;

public class VinhoDao  implements Dao<Vinho>{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetoVinu");


	@Override
	public void adicionar(Vinho t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Vinho t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Vinho t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vinho> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vinho buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
