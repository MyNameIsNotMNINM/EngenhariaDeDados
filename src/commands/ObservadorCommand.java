package commands;

import interfaces.Command;
import main.Biblioteca;

public class ObservadorCommand implements Command {
    public ObservadorCommand(){};

    public void executar(int[] arg) {
        Biblioteca.getInstance().gerarObservador(arg[0], arg[1]);
    }
}
