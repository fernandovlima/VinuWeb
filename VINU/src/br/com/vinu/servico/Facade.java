package br.com.vinu.servico;

import br.com.vinu.entidades.Usuario;

public class Facade {

	

		public void addUsuario(Usuario user) throws ServicoException  {
			new UsuarioServico().adicionar(user); 
		}
		
		public void editarUsuario(Usuario user) throws ServicoException {
			new UsuarioServico().editar(user);
		}
		
		public void deletarUsuario(Usuario user) throws ServicoException {
			new UsuarioServico().deletar(user);
		}
		
		public Usuario buscarPorId(Long id) throws ServicoException {
			return new UsuarioServico().buscaPorId(id);
		}
}
