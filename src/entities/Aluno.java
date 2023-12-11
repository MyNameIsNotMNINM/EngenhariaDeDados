package entities;

import interfaces.IUsuario;

public abstract class Aluno extends Usuario implements IUsuario {
    public Aluno(int codigoUsuario, String nome, int diasDeEmprestimo) {
        super(codigoUsuario, nome);
        super.diasDeEmprestimo = diasDeEmprestimo;
    }

    @Override
    public boolean podeEmprestar() {
        return !this.getIsDevedor() && this.getEmprestimos().size() < this.getLimiteEmprestimos();
    }

    @Override
    public int getLimiteEmprestimos() {
        return this.limiteEmprestimos();
    }

    protected abstract int limiteEmprestimos();
}
