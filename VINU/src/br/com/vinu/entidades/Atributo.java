package br.com.vinu.entidades;

public class Atributo {

	private int id;
	private String nomeAtributo;
	private String valorAtributo;
	
	
	
	public Atributo() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
