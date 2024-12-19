package loja.controller;

import java.util.ArrayList;

import loja.model.Jogos;
import loja.repository.JogosRepository;

public class JogosController implements JogosRepository {

	private ArrayList<Jogos> listaJogos = new ArrayList<Jogos>();
	int id = 0;
	
	@Override
	public void procurarPorId(int id) {
		var jogo = buscarNaCollection(id);
		
		if (jogo!= null)
			jogo.visualizar();
		else
			System.out.println("\nO jogo com o ID: " + id + " não foi encontrado!");
		
	}

	@Override
	public void listarTodas() {
		for (var jogo : listaJogos) {
			jogo.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Jogos jogo) {
		listaJogos.add(jogo);
		System.out.println("\nO jogo: " + jogo.getNome() + " foi adicionado com sucesso!");
		
	}

	@Override
	public void atualizar(Jogos jogo) {
		var buscaNome = buscarNome(jogo.getNome());
		
		if (buscaNome != null) {
			listaJogos.set(listaJogos.indexOf(buscaNome), jogo);
			System.out.println("\nO Jogo: " + jogo.getNome() + " foi atualizado com sucesso!");
		}
		else {
			System.out.println("\nO Jogo: " + jogo.getNome() + " não foi encontrado!");
		}
		
	}

	@Override
	public void deletar(int id) {
		
		var jogo = buscarNaCollection(id);
		
		if (jogo != null) {
			if (listaJogos.remove(jogo) == true)
				System.out.println("\nO Jogo: " + jogo.getNome() + " foi deletado com sucesso");
		}
		else {
			System.out.println("\nO jogo com o ID " + id + " não foi encontrado!");
		}
		
	}
	
	public int geraId() {
		return ++ id;
	}
	
	public Jogos buscarNaCollection(int id) {
		for (var jogos : listaJogos) {
			if (jogos.getId() == id) {
				return jogos;
			}
		}
		return null;
	}
	
	public Jogos buscarNome(String nome) {
	    for (var jogo : listaJogos) {
	        if (jogo.getNome().equals(nome)) {
	            return jogo;
	        }
	    }
	    return null;
	}
}
