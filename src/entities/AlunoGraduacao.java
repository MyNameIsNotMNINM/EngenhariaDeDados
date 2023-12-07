package entities;

import interfaces.IUsuario;

public class AlunoGraduacao extends Usuario implements IUsuario{
    public AlunoGraduacao(int codigoUsuario, String nome) {
        super(codigoUsuario, nome);
        super.diasDeEmprestimo = 3;
    }
}
