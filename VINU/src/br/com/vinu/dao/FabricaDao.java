package br.com.vinu.dao;

import br.com.vinu.entidades.Atributo;
import br.com.vinu.entidades.Usuario;
import br.com.vinu.entidades.Vinho;

public class FabricaDao {
	
	public static Dao<Usuario> createDaoUsuario() {
		return new UsuarioDao();
	}
	
	public static Dao<Atributo> createDaoAtributo(){
		return new AtributoDao();
	}

	public static Dao<Vinho> createDaoVinho(){
		return new VinhoDao();
	}
}
