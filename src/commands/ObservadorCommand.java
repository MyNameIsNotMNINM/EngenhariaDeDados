package commands;

import interfaces.Command;

public class ObservadorCommand implements Command {
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para observar um livro");
  }
}
