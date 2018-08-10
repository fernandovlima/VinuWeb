package br.com.vinu.servico;

import br.com.vinu.dao.Dao;
import br.com.vinu.dao.FabricaDao;
import br.com.vinu.entidades.Usuario;

public class UsuarioServico {

	public void adicionar(Usuario usuario) throws ServicoException {
		
		if ( usuario.getNomeUsuario().isEmpty()) {
			throw new ServicoException("O campo nome "
					+ " não pode ser vazio.");
		}else {
		
			if ( usuario.getEmailUsuario().isEmpty()) {
				throw new ServicoException("O campo e-mail "
					+ " não pode ser vazio.");
			}
		}
			
		Dao<Usuario> usuarioDao = FabricaDao.createDaoUsuario();
		usuarioDao.adicionar(usuario);
	}
	
	public void editar(Usuario usuario) throws ServicoException{
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void deletar(Usuario user) {
		// TODO Auto-generated method stub
		
	}

	public Usuario buscaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
