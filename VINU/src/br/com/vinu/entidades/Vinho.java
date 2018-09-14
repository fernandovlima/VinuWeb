package br.com.vinu.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Vinho {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nomeVinho;
	
	@JsonManagedReference
	@OneToMany(mappedBy="vinho", cascade = CascadeType.ALL)
	private List<Atributo> atributosVinho;
	
	
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

	

	@Override
	public String toString() {
		return "Vinho [id=" + id + ", nomeVinho=" + nomeVinho + ", atributosVinho=" + atributosVinho ;
	}
	
	
}

