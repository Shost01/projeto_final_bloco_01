package loja.model;

public abstract class Jogos {
	private int id;
	private int tipo;
	private String jogo;
	
	public Jogos(int id, int tipo, String jogo) {
		this.id = id;
		this.tipo = tipo;
		this.jogo = jogo;
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

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}
	
	public void visualizar() {
		
		String tipo = " ";
		
		switch (this.tipo) {
		case 1:
			tipo = "Playstation";
			break;
		case 2:
			tipo = "Xbox";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Id do jogo: " + this.id);
		System.out.println("Tipo do jogo: " + tipo);
		System.out.println("Jogo: " + this.jogo);
	}
	
	
}
