package commands;

import interfaces.Command;

public class ConsultarLivroCommand implements Command {
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para consultar um livro");
  }
}
