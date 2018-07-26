package br.com.vinu.entidades;

public class Usuario {

	private long id;
	private String nomeUsuario;
	private String emailUsuario;
	
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getEmailAluno() {
		return emailUsuario;
	}
	public void setEmailAluno(String emailAluno) {
		this.emailUsuario = emailAluno;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nomeUsuario=" + nomeUsuario + ", emailAluno=" + emailUsuario + "]";
	}
	
	
	
	
	
	
}

