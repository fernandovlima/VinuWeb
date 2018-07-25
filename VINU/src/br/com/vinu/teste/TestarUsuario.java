package br.com.vinu.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.com.vinu.entidades.Usuario;
import br.com.vinu.servico.UsuarioServico;

public class TestarUsuario {

	@Test 
	public void deveriaCadastrarUsuario() {
		Usuario user = new Usuario();
		user.setId(0);
		user.setNomeUsuario("Teste");
		user.setEmailAluno("teste");
		
		new UsuarioServico().adicionar(user);
		
		assertEquals(true, user.getId() != 0);		
	}
}
