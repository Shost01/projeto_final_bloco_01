package loja.model;

public class JogosVideoGame extends Jogos {
	private String plataforma;
	
	public JogosVideoGame (int id, int tipo,int genero, String nome, String plataforma) {
		super(id, tipo, genero, nome);
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
		System.out.println("Plataforma: " + ((JogosVideoGame) this).getPlataforma());  
	}
	
}
