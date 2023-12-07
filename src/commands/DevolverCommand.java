package commands;

import interfaces.Command;

public class DevolverCommand implements Command {
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para devolver um livro");
  }
}
