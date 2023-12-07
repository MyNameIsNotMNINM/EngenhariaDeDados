package commands;

import interfaces.Command;

public class NotificacaoCommand implements Command{
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para notificar um usuário");
  }
}
