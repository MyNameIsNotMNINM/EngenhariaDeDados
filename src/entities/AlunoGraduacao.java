package entities;

import interfaces.IUsuario;

public class AlunoGraduacao extends Usuario implements IUsuario{
    public AlunoGraduacao(int id, String nome) {
        super(id, nome);
        super.diasDeEmprestimo = 3;
    }
}
