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
import br.com.vinu.dao.VinhoDao;
import br.com.vinu.entidades.Vinho;
import br.com.vinu.servico.Facade;
import br.com.vinu.servico.ServicoException;
import br.com.vinu.servico.VinhoServico;
import io.swagger.annotations.Api;


@Path("/vinhorest")
@Api(value="/vinhorest")
public class VinhoRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void adicionar(Vinho vinho) {
		try {
			new VinhoServico().adicionar(vinho);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Vinho> listar(){
		List<Vinho> vinhos = new VinhoDao().listar();
		return vinhos;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editar(Vinho v) {
		
		try {
			new Facade().editarVinho(v);;
		} catch (ServicoException e) {
			e.printStackTrace();
		}
		
	}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void excuir(@PathParam("id") Long id) {
		try {
			Dao<Vinho> vinhoDao = FabricaDao.createDaoVinho();
			Vinho vinho = vinhoDao.buscarPorId(id);
			vinhoDao.excluir(vinho);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Vinho buscarPorId(@PathParam("id")Long id) throws ServicoException  {
	
		return new Facade().buscarVinhoPorId(id);
	

	}

}
