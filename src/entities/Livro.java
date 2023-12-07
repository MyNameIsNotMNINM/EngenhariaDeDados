package entities;

public class Livro {
  private String codigo;
	private String titulo;
	private String editora;
	private String autores;
	private String edicao; 
	private String ano;

  public Livro(String codigo, String titulo, String editora, String autores, String edicao, String ano) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.editora = editora;
    this.autores = autores;
    this.edicao = edicao;
    this.ano = ano;
  }

  public String getCodigoLivro() {
    return this.codigo;
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

  public String getAnoLivro() {
    return this.ano;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
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

  public void setAno(String ano) {
    this.ano = ano;
  }
}
