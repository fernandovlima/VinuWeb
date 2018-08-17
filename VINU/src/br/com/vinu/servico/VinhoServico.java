package br.com.vinu.servico;

import br.com.vinu.dao.Dao;
import br.com.vinu.dao.FabricaDao;
import br.com.vinu.entidades.Vinho;

public class VinhoServico {

	Dao<Vinho> vinhoDao = FabricaDao.createDaoVinho();
	
	public void adicionar(Vinho v) throws ServicoException {
		if(v.getNomeVinho() == null) {
			throw new ServicoException("Vinho inexixtente.");
		}
		vinhoDao.adicionar(v);
	}
	
	public void editar(Vinho v) throws ServicoException{
		if (v.getId() == null) {
			throw new ServicoException("Vinho inxistente.");
		}
		vinhoDao.editar(v);
	}
	
	public void excluir(Vinho v) throws ServicoException{
		if (v.getId() == null) {
			throw new ServicoException("Vinho inexistente.");
		}
		vinhoDao.excluir(v);
		
	}
	
	public Vinho buscarPotId(Long id) {
		return vinhoDao.buscarPorId(id);
	}
}
