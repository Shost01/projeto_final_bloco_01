package loja.model;

public class JogosPlaystation extends Jogos {
	private int modelo;

	public JogosPlaystation(int id, int tipo, String jogo, int modelo) {
		super(id, tipo, jogo);
		this.modelo = modelo;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Plataforma: PS" + this.modelo);
	}

}
