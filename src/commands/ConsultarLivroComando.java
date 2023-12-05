package commands;

public class ConsultarLivroComando implements Comando {
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para consultar um livro");
  }
}
