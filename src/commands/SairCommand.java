package commands;

import interfaces.Command;

public class SairCommand implements Command {
  public SairCommand() {};
  
  public void executar(int[] arg) {
    System.exit(0);
  }
}
