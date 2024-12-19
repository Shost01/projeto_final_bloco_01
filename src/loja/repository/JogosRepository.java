package loja.repository;

import loja.model.Jogos;

public interface JogosRepository {

	public void procurarPorId(int id);
	public void listarTodas();
	public void cadastrar(Jogos jogo);
	public void atualizar(Jogos jogo);
	public void deletar(int id);
	
}
