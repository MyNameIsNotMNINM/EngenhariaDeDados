package commands;

import interfaces.Command;
import main.Biblioteca;

public class NotificacaoCommand implements Command {
    public NotificacaoCommand(){};

    public void executar(int[] arg) {
        Biblioteca.getInstance().notificar(arg[0]);
    }
}
