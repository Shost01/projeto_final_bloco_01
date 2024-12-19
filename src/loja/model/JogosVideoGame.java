package loja.model;

public class JogosVideoGame extends Jogos {
	private String plataforma;
	
	public JogosVideoGame (int id, int tipo, String nome, String plataforma) {
		super(id, tipo, nome);
		this.plataforma = plataforma;	
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Plataforma: " + this.plataforma);
	}
	
}
