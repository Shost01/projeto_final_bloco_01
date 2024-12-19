package loja.model;

public abstract class Jogos {
	private int id;
	private int tipo;
	private int genero;
	private String nome;
	
	public Jogos(int id, int tipo,int genero, String nome) {
		this.id = id;
		this.tipo = tipo;
		this.genero = genero;
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
	
	
	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}
	
    public String getGeneroNome() {
        switch (this.genero) {
            case 1:
                return "RPG";
            case 2:
                return "Corrida";
            case 3:
                return "Luta";
            case 4:
                return "FPS";
            case 5:
                return "Aventura";
            default:
                return "Desconhecido";  
        }
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
		System.out.println("Gênero do jogo: " + getGeneroNome());
		System.out.println("Tipo do jogo: " + tipo);
		System.out.println("Nome do Jogo: " + this.nome);
		
	}
	
	public void generos() {
		
		String gen = " ";
		
		System.out.println("\n\n******************************************************");
		System.out.println("                        GÊNEROS:                     ");
		System.out.println("*****************************************************");
		System.out.println("            1 - RPG                                  ");
		System.out.println("            2 - Corrida                              ");
		System.out.println("            3 - Luta                                 ");
		System.out.println("            4 - FPS                                  ");
		System.out.println("            5 - Aventura                             ");
		System.out.println("\n\n******************************************************");		

	}
	
	
}
