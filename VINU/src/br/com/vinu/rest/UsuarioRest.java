package br.com.vinu.rest;



import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.vinu.dao.Dao;
import br.com.vinu.dao.FabricaDao;
import br.com.vinu.dao.UsuarioDao;
import br.com.vinu.entidades.Usuario;
import br.com.vinu.servico.Facade;
import br.com.vinu.servico.ServicoException;
import br.com.vinu.servico.UsuarioServico;
import io.swagger.annotations.Api;

@Path("/usuariorest")
@Api(value="/usuariorest")
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

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editar(Usuario usuario) {
		try {
			new Facade().editarUsuario(usuario);
		} catch (ServicoException e) {
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void excuir(@PathParam("id") Long id) {
		try {
			
			Dao<Usuario> userDao = FabricaDao.createDaoUsuario();
			Usuario user = userDao.buscarPorId(id);
			userDao.excluir(user);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario buscarPorId(@PathParam("id")Long id) throws ServicoException  {
	
		return new Facade().buscarPorId(id);
	

	}
	
	
	
}
