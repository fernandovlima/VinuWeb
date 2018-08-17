package br.com.vinu.servico;

import br.com.vinu.entidades.Atributo;
import br.com.vinu.entidades.Usuario;
import br.com.vinu.entidades.Vinho;

public class Facade {

	
		//usuário serviço
		public void addUsuario(Usuario user) throws ServicoException  {
			new UsuarioServico().adicionar(user); 
		}
		
		public void editarUsuario(Usuario user) throws ServicoException {
			new UsuarioServico().editar(user);
		}
		
		public void deletarUsuario(Usuario user) throws ServicoException {
			new UsuarioServico().deletar(user);
		}
		
		public Usuario buscarPorId(Long id) throws ServicoException {
			return new UsuarioServico().buscaPorId(id);
		}
		
		//Atributo servico
		public void addAtributo(Atributo atributo) throws ServicoException{
			new AtributoServico().adicionar(atributo);
		}
		
		public void editarAtributo(Atributo atributo) throws ServicoException{
			new AtributoServico().editar(atributo);
		}
		
		public void deletarAtributo(Atributo atributo) throws ServicoException{
			new AtributoServico().deletar(atributo);
		}
		
		public Atributo buscarAtributoPorId(Long id) throws ServicoException{
			return new AtributoServico().buscarPorId(id);
		}
		
		//Vinho Servico
		public void addVinho(Vinho v) throws ServicoException{
			new VinhoServico().adicionar(v);
		}
		
		public void editarVinho(Vinho v) throws ServicoException{
			new VinhoServico().editar(v);
		}
		
		public void excluirVinho(Vinho v) throws ServicoException{
			new VinhoServico().excluir(v);
		}
		
		public Vinho buscarVinhoPorId(Long id) throws ServicoException{
			return new VinhoServico().buscarPotId(id);
		}
}
