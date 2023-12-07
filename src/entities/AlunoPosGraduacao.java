package entities;

import interfaces.IUsuario;

public class AlunoPosGraduacao extends Usuario implements IUsuario {
    public AlunoPosGraduacao(int codigoUsuario, String nome) {
        super(codigoUsuario, nome);
        super.diasDeEmprestimo = 4;
    }
}
