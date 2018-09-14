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

import br.com.vinu.dao.AtributoDao;
import br.com.vinu.dao.Dao;
import br.com.vinu.dao.FabricaDao;
import br.com.vinu.entidades.Atributo;
import br.com.vinu.servico.AtributoServico;
import br.com.vinu.servico.Facade;
import br.com.vinu.servico.ServicoException;
import io.swagger.annotations.Api;

@Path("/atributorest")
@Api(value="/atributorest")
public class AtributoRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void adicionar(Atributo atributo) {
		try {
			
			new AtributoServico().adicionar(atributo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Atributo> listar(){
		List<Atributo> vinhos = new AtributoDao().listar();
		return vinhos;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editar(Atributo atributo) {
		
		try {
			new Facade().editarAtributo(atributo);;
		} catch (ServicoException e) {
			e.printStackTrace();
		}
		
	}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void excuir(@PathParam("id") Long id) {
		try {
			Dao<Atributo> atributoDao = FabricaDao.createDaoAtributo();
			Atributo atributo  = atributoDao.buscarPorId(id);
			atributoDao.excluir(atributo);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Atributo buscarPorId(@PathParam("id")Long id) throws ServicoException  {
	
		return new Facade().buscarAtributoPorId(id);
	}
}
