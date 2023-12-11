package entities;

public class AlunoPosGraduacao extends Aluno {
    public AlunoPosGraduacao(int codigoUsuario, String nome) {
        super(codigoUsuario, nome, 4);
    }

    @Override
    protected int limiteEmprestimos() {
        return 4;
    }
}
