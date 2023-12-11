package entities;

public class Exemplar {
	private int codigoLivro;
	private int codigoExemplar;
	private boolean disponivel;
	
	public Exemplar(int codigoLivro, int codigoExemplar, boolean disponivel) {
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
