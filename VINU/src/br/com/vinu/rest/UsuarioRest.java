package br.com.vinu.rest;



import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.vinu.dao.UsuarioDao;
import br.com.vinu.entidades.Usuario;
import br.com.vinu.servico.UsuarioServico;

@Path("/usuariorest")
public class UsuarioRest {

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void adicionar(Usuario user) {

		try {
			new UsuarioServico().adicionar(user);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listar(){
		 List<Usuario> usuarios = new UsuarioDao().listar();
		 return usuarios;
	}

	

	
}
