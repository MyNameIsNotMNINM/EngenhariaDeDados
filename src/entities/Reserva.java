package entities;

import java.time.LocalDate;

public class Reserva {
  private int codigoUsuario;
	private int codigoLivro;
	private LocalDate data;

  public Reserva(int codigoUsuario, int codigoLivro) {
    this.codigoUsuario = codigoUsuario;
    this.codigoLivro = codigoLivro;
    this.data = LocalDate.now();
  }

  public int getCodigoUsuario() {
    return this.codigoUsuario;
  }

  public int getCodigoLivro() {
    return this.codigoLivro;
  }

  public LocalDate getData() {
    return this.data;
  }

  public void setCodigoUsuario(int codigoUsuario) {
    this.codigoUsuario = codigoUsuario;
  }

  public void setCodigoLivro(int codigoLivro) {
    this.codigoLivro = codigoLivro;
  }
}
