package entities;

import interfaces.IUsuario;

public class Professor extends Usuario implements IUsuario {
    public Professor(int codigo, String nome) {
        super(codigo, nome);
        super.diasDeEmprestimo = 7;
    }
}