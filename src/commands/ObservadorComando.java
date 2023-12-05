package commands;

public class ObservadorComando implements Comando {
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para observar um livro");
  }
}
