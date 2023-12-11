package commands;

import interfaces.Command;
import main.Biblioteca;

public class DevolverCommand implements Command {

	public DevolverCommand() {};

	public void executar(int[] arg) {
    Biblioteca.getInstance().devolverLivro(arg[0], arg[1]);
  }
}
