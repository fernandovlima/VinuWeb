package br.com.vinu.servico;

import br.com.vinu.dao.Dao;
import br.com.vinu.dao.FabricaDao;
import br.com.vinu.entidades.Atributo;

public class AtributoServico {
	
	Dao<Atributo> atributoDao = new FabricaDao().createDaoAtributo();

	public void adicionar(Atributo a) throws ServicoException {
		if(a.getNomeAtributo() == null) {
			//dispara erro
			throw new ServicoException("Nome do atributo não pode ser vazio.");
		}else {
			if(a.getValorAtributo() == null) {
				throw new ServicoException("Valor do atributo não pode ser vazio.");
			}
		}
		atributoDao.adicionar(a);
	}
	
	public void editar(Atributo a) throws ServicoException {
		if (buscarPorId(a.getId()) == null) {
			throw new ServicoException("Usuário inexistente.");

		}
		atributoDao.editar(a);
	}
	
	public void deletar(Atributo atributo) throws ServicoException{
		if(atributo.getId() == null) {
			throw new ServicoException("Usuário inexistente.");
		}
		atributoDao.excluir(atributo);
	}
	
	public void listar() throws ServicoException{
		
	}
	
	public Atributo buscarPorId(Long id) {
		return atributoDao.buscarPorId(id);
	}
}

