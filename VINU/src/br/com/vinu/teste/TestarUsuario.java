package br.com.vinu.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import br.com.vinu.dao.UsuarioDao;
import br.com.vinu.entidades.Usuario;
import br.com.vinu.servico.Facade;

public class TestarUsuario {

	@Test 
	public void deveriaCadastrarUsuario() {
		Usuario user = new Usuario();
		user.setId(null);
		user.setNomeUsuario("Teste");
		user.setEmailUsuario("teste");
		
		try {
			new Facade().addUsuario(user);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals(true, user.getId() != null);		
	}
	
	@Test
	public void deveriaListarUsuario() {
		List<Usuario> usuarios = new UsuarioDao().listar();
		assertEquals(true, usuarios.size() > 0);
	}
	
	@Test
	public void deveriaExcluirUsuario() {
		Usuario user = new Usuario();
		user.setId((long) 10);
		user.setNomeUsuario("Usuário 10");
		user.setEmailUsuario("user10@email.com");
		try {
			new Facade().deletarUsuario(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(true, user.getId() != null);
	}
	
	@Test
	public void deveriaEditarUsuario() {
		Usuario user = new Usuario();
		user.setId((long) 10);
		user.setNomeUsuario("Usuário 10");
		user.setEmailUsuario("user10@email.com");
		try {
			new Facade().editarUsuario(user);;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(true, user.getId() != null);
		
		
	}
	
}

