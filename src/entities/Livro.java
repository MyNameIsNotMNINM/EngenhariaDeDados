package entities;

public class Livro {
  private String codigo;
	private String titulo;
	private String editora;
	private String autores;
	private int edicao; 
	private int ano;

  public Livro(String codigo, String titulo, String editora, String autores, int edicao, int ano) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.editora = editora;
    this.autores = autores;
    this.edicao = edicao;
    this.ano = ano;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String getEditora() {
    return this.editora;
  }

  public String getAutores() {
    return this.autores;
  }

  public int getEdicao() {
    return this.edicao;
  }

  public int getAno() {
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

  public void setEdicao(int edicao) {
    this.edicao = edicao;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  @Override
  public String toString() {
    return "Livro [codigo=" + codigo + ", titulo=" + titulo + ", editora=" + editora + ", autores=" + autores
        + ", edicao=" + edicao + ", ano=" + ano + "]";
  }
}
