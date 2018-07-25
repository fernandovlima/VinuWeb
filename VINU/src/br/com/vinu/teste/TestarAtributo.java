package br.com.vinu.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.vinu.entidades.Atributo;
import br.com.vinu.servico.AtributoServico;

public class TestarAtributo {

	@Test
	public void testacadastroAtributo() {
		Atributo atributo = new Atributo();
		atributo.setId(0);
		atributo.setNomeAtributo("Teste");
		atributo.setValorAtributo("teste");
		
		new AtributoServico().adicionar(atributo);
		
		assertEquals(true, atributo.getId() != 0);
	}
}
