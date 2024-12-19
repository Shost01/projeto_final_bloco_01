package loja.model;

public class JogosTabuleiro extends Jogos {

	private String duracao;
	
	public JogosTabuleiro(int id, int tipo, String nome, String duracao) {
		super(id, tipo, nome);
		this.duracao = duracao;
	}
	
	public String getDuracao() {
		return duracao;
	}



	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}



	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Duração: " + this.duracao);
	}

}
