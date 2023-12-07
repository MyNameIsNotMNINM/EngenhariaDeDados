package commands;

import interfaces.Command;

public class EmprestimoCommand implements Command{
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para emprestar um livro");
  }
}
