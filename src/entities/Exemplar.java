package entities;

public class Exemplar {
	private String idExemplar;
	private String codigoLivro;
	private boolean disponivel;
	
	public Exemplar(String idExemplar, String livro, boolean disponivel) {
    this.setCodigoLivro(idExemplar);
		this.setIdExemplar(livro);
		this.setDisponivel(disponivel);
	}
	
	public String getCodigoLivro() {
		return codigoLivro;
	}

	public String getIdExemplar() {
		return idExemplar;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setCodigoLivro(String id) {
		this.codigoLivro = id;
	}
	
	public void setIdExemplar(String id) {
		this.idExemplar = id;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
