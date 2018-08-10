package br.com.vinu.servico;

import br.com.vinu.dao.Dao;
import br.com.vinu.dao.FabricaDao;
import br.com.vinu.entidades.Usuario;

public class UsuarioServico {

	Dao<Usuario> usuarioDao = FabricaDao.createDaoUsuario();
	
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
			
		
		usuarioDao.adicionar(usuario);
	}
	
	public void editar(Usuario usuario) throws ServicoException{
		
		if (usuario.getId() == null) {
			throw new ServicoException("Usuário inexistente.");
		}
		usuarioDao.editar(usuario);
	}

	public void deletar(Usuario usuario) throws ServicoException {
		if(usuario.getId() == null) {
			throw new ServicoException("Usuário inexistente.");
		}
		
		usuarioDao.excluir(usuario);		
	}

	public Usuario buscaPorId(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.buscarPorId(id);
	}
}
