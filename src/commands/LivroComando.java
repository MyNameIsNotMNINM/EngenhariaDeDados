package commands;

public class LivroComando implements Comando {
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para manipular um livro");
  }
}
