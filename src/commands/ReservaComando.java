package commands;

public class ReservaComando implements Comando{
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para reservar um livro");
  }
}
