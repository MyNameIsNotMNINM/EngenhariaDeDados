package entities;

import interfaces.IUsuario;

public class Professor extends Usuario implements IUsuario {
    public Professor(int codigoUsuario, String nome) {
        super(codigoUsuario, nome);
        super.diasDeEmprestimo = 7;
    }
}