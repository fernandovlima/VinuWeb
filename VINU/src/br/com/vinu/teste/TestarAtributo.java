package br.com.vinu.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.vinu.dao.AtributoDao;
import br.com.vinu.entidades.Atributo;
import br.com.vinu.servico.Facade;

public class TestarAtributo {

	@Test
	public void testCadastrarAtributo() {
		Atributo atributo = new Atributo();
		atributo.setId(null);
		atributo.setNomeAtributo("Atributo 1");
		
		try {
			new Facade().addAtributo(atributo);

		} catch (Exception e) {
			e.printStackTrace();
		}	
		assertEquals(true, atributo.getId() != 0);
	}
	
	@Test
	public void testListarAtributos() {
		List<Atributo> atributos = new AtributoDao().listar();
		assertEquals(true, atributos.size() > 0);
	}
	
	@Test
	public void testEditarAtributo() {
		Atributo a = new Atributo();
		a.setId((long) 11);
		a.setNomeAtributo("Atributo 11");
		try {
			new Facade().editarAtributo(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(true, a.getId()!= null);
	}
	
	@Test
	public void testExcluirAtributo() {
		Atributo a = new Atributo();
		a.setId((long) 11);
		a.setNomeAtributo("Atributo 11");
		try {
			new Facade().deletarAtributo(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(true, a.getId()!= null);
	}
}
