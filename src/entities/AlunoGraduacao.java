package entities;

public class AlunoGraduacao extends Aluno {
    public AlunoGraduacao(int codigoUsuario, String nome) {
        super(codigoUsuario, nome, 3);
    }

    @Override
    protected int limiteEmprestimos() {
        return 3;
    }
}
