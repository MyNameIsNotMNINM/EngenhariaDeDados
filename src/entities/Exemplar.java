package entities;

public class Exemplar {
	private int codigoExemplar;
	private int codigoLivro;
	private boolean disponivel;
	
	public Exemplar(int codigoExemplar, int codigoLivro, boolean disponivel) {
    this.setCodigoLivro(codigoLivro);
		this.setCodigoExemplar(codigoExemplar);
		this.setDisponivel(disponivel);
	}
	
	public int getCodigoLivro() {
		return codigoLivro;
	}

	public int getCodigoExemplar() {
		return codigoExemplar;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setCodigoLivro(int id) {
		this.codigoLivro = id;
	}
	
	public void setCodigoExemplar(int id) {
		this.codigoExemplar = id;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
