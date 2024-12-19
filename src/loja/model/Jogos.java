package loja.model;

public abstract class Jogos {
	private int id;
	private int tipo;
	private String nome;
	
	public Jogos(int id, int tipo, String nome) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void visualizar() {
		
		String tipo = " ";
		
		switch (this.tipo) {
		case 1:
			tipo = "Video Game";
			break;
		case 2:
			tipo = "Tabuleiro";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Id do jogo: " + this.id);
		System.out.println("Tipo do jogo: " + tipo);
		System.out.println("Jogo: " + this.nome);
	
	}
	
	
}
