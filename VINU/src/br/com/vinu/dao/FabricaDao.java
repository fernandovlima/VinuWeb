package br.com.vinu.dao;

import br.com.vinu.entidades.Usuario;

public class FabricaDao {
	
	public static Dao<Usuario> createDaoUsuario() {
		return new UsuarioDao();
	}

}
