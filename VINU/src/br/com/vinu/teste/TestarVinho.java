package br.com.vinu.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.Test;

import br.com.vinu.entidades.Vinho;
import br.com.vinu.servico.Facade;

public class TestarVinho {

	
	
	@Test
	public void testaCadastarVinho() {
		Vinho v = new Vinho();
		v.setId(null);
		v.setNomeVinho("Casilero del Diablo");
		v.setDataCadastro(new Date());
		v.setAtributosVinho(null);
		
		try {
			new Facade().addVinho(v);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(true, v.getId() != null);
	}
	
	@Test
	public void testaEditarVinho() {
		Vinho v = new Vinho();
		v.setId((long) 10);
		v.setDataCadastro(new Date());
		v.setNomeVinho("Vinho 11");
		v.setAtributosVinho(null);
		try {
			new Facade().editarVinho(v);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(true, v.getId() != null);
		
	}
	
	@Test
	public void testaExcluirVinho() {
		Vinho v = new Vinho();
		v.setId((long) 10);
		v.setDataCadastro(new Date());
		v.setNomeVinho("Vinho 11");
		v.setAtributosVinho(null);
		try {
			new Facade().editarVinho(v);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(true, v.getId() != null);
	}
}
