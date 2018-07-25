package br.com.vinu.dao;

import java.util.List;

import br.com.vinu.entidades.Usuario;


public class UsuarioDao implements Dao<Usuario>{

	@Override
	public void adicionar(Usuario t) {

		Usuario usuario = new Usuario();
		usuario.setId(1);
	}

	@Override
	public void editar(Usuario t) {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void excluir(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
