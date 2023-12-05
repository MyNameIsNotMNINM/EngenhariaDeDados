package commands;

public class NotificacaoComando implements Comando{
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para notificar um usuário");
  }
}
