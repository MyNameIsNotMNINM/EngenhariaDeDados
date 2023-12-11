package commands;

import interfaces.Command;
import main.Biblioteca;

public class ReservaCommand implements Command {
    public ReservaCommand(){};

    public void executar(int[] arg) {
        Biblioteca.getInstance().reservarLivro(arg[0], arg[1]);
    }
}
