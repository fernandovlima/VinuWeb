package br.com.vinu.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Atributo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nomeAtributo;
	private String valorAtributo;
	
	
	
	public Atributo() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeAtributo() {
		return nomeAtributo;
	}
	public void setNomeAtributo(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	public String getValorAtributo() {
		return valorAtributo;
	}
	public void setValorAtributo(String valorAtributo) {
		this.valorAtributo = valorAtributo;
	}
	@Override
	public String toString() {
		return "Atributo [id=" + id + ", nomeAtributo=" + nomeAtributo + ", valorAtributo=" + valorAtributo + "]";
	}
	

	
}
