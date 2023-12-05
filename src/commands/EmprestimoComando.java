package commands;

public class EmprestimoComando implements Comando{
  @Override
  public void executar(String[] args) {
    System.out.println("Executando o comando para emprestar um livro");
  }
}
