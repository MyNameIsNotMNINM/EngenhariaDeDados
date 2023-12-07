package commands;

import interfaces.Command;

public class ReservaCommand implements Command{
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para reservar um livro");
  }
}
