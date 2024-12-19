package loja.model;

public class JogosXbox extends Jogos {
	private String modelo;

	public JogosXbox(int id, int tipo, String jogo, String modelo) {
		super(id, tipo, jogo);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Plataforma: Xbox " + this.modelo);
	}

}
