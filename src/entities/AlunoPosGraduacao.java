package entities;

import interfaces.IUsuario;

public class AlunoPosGraduacao extends Usuario implements IUsuario {
    public AlunoPosGraduacao(int id, String nome) {
        super(id, nome);
        super.diasDeEmprestimo = 4;
    }
}
