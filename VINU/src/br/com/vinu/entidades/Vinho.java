package br.com.vinu.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Vinho {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nomeVinho;
	private List<Atributo> atributosVinho;
	private Date dataCadastro;
	
	public Vinho() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

