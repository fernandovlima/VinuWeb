package br.com.vinu.servico;

import br.com.vinu.dao.UsuarioDao;
import br.com.vinu.entidades.Usuario;

public class UsuarioServico {

	public void adicionar(Usuario u) {
		if (u.getNomeUsuario() == null){
			//erro
		}
		new UsuarioDao().adicionar(u);
	}
}
