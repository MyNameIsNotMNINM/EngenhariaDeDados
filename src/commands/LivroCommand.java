package commands;

import interfaces.Command;

public class LivroCommand implements Command {
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para manipular um livro");
  }
}
