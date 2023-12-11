package commands;

import interfaces.Command;
import main.Biblioteca;

public class EmprestimoCommand implements Command {
    public EmprestimoCommand(){};

    public void executar(int[] arg) {
        Biblioteca.getInstance().emprestarLivro(arg[0], arg[1]);
    }
}
