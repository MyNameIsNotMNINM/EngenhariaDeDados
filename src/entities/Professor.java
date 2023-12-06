package entities;

import interfaces.IUsuario;

public class Professor extends Usuario implements IUsuario {
    public Professor(int id, String nome) {
        super(id, nome);
        super.diasDeEmprestimo = 7;
    }
}