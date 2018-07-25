package br.com.vinu.entidades;

import java.util.Date;
import java.util.List;

public class Vinho {

	private long id;
	private String nomeVinho;
	private List<Atributo> atributosVinho;
	private Date dataCadastro;
	
	public Vinho() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeVinho() {
		return nomeVinho;
	}

	public void setNomeVinho(String nomeVinho) {
		this.nomeVinho = nomeVinho;
	}

	public List<Atributo> getAtributosVinho() {
		return atributosVinho;
	}

	public void setAtributosVinho(List<Atributo> atributosVinho) {
		this.atributosVinho = atributosVinho;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Vinho [id=" + id + ", nomeVinho=" + nomeVinho + ", atributosVinho=" + atributosVinho + ", dataCadastro="
				+ dataCadastro + "]";
	}
	
	
}
