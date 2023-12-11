package commands;

import interfaces.Command;

import main.Biblioteca;

public class LivroCommand implements Command {
  public LivroCommand() {};

  public void executar(int[] arg) {
    Biblioteca.getInstance().consultarLivro(arg[0]);
  }
}
