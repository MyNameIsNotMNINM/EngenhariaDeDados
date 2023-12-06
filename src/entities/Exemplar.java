package entities;

public class Exemplar {
	private int idExemplar;
	private String codigoLivro;
	private boolean disponivel;
	
	public Exemplar(int idExemplar, Livro livro) {
    this.idExemplar = idExemplar;
		this.codigoLivro = livro.getCodigoLivro();
    this.disponivel = true;
	}
	
	public String getCodigoLivro() {
		return codigoLivro;
	}

	public int getIdExemplar() {
		return idExemplar;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setCodigoLivro(String id) {
		this.codigoLivro = id;
	}
	
	public void setCodigoExemplar(int id) {
		this.idExemplar = id;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
