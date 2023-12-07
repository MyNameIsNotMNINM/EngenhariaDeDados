package entities;

public class Livro {
  private int codigoLivro;
	private String titulo;
	private String editora;
	private String autores;
	private String edicao; 
	private int ano;

  public Livro(int codigoLivro, String titulo, String editora, String autores, String edicao, int ano) {
    this.codigoLivro = codigoLivro;
    this.titulo = titulo;
    this.editora = editora;
    this.autores = autores;
    this.edicao = edicao;
    this.ano = ano;
  }

  public int getCodigoLivro() {
    return this.codigoLivro;
  }

  public String getTituloLivro() {
    return this.titulo;
  }

  public String getEditoraLivro() {
    return this.editora;
  }

  public String getAutoresLivro() {
    return this.autores;
  }

  public String getEdicaoLivro() {
    return this.edicao;
  }

  public int getAnoLivro() {
    return this.ano;
  }

  public void setCodigoLivro(int codigoLivro) {
    this.codigoLivro = codigoLivro;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public void setAutores(String autores) {
    this.autores = autores;
  }

  public void setEdicao(String edicao) {
    this.edicao = edicao;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
}
