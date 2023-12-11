package commands;

import interfaces.Command;

import main.Biblioteca;
public class UsuarioCommand implements Command {
  public UsuarioCommand() {};

  public void executar(int[] arg) {
    Biblioteca.getInstance().consultarUsuario(arg[0]);
  }
}
