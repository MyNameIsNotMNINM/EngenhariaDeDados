package commands;

public class DevolverComando implements Comando {
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para devolver um livro");
  }
}
