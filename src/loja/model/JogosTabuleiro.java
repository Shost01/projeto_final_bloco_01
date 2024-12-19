package loja.model;

public class JogosTabuleiro extends Jogos {

	private String duracao;
	
	public JogosTabuleiro(int id, int tipo, int genero, String nome, String duracao) {
		super(id, tipo, genero, nome);
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
		System.out.println("Duração: " + ((JogosTabuleiro) this).getDuracao());  
	}

	public void generos() {
		System.out.println("\n\n******************************************************");
		System.out.println("                        GÊNEROS:                     ");
		System.out.println("*****************************************************");
		System.out.println("            1 - RPG                                  ");
		System.out.println("            2 - Cooperativo                          ");
		System.out.println("            3 - Adivinhação                          ");
		System.out.println("            4 - 1 Jogador                            ");
		System.out.println("            5 - Outros                               ");
		System.out.println("\n\n******************************************************");
	}
}
