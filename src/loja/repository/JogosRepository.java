package loja.repository;

import java.util.List;

import loja.model.Jogos;

public interface JogosRepository {

	//Métodos CRUD
	
	public void procurarPorId(int id);
	public void listarTodas();
	public void cadastrar(Jogos jogo);
	public void atualizar(Jogos jogo);
	public void deletar(int id);
	
	// Métodos Jogos
	
	public List<Jogos> buscaGenero(int genero);
	void buscarPorGenero(int genero);
}
