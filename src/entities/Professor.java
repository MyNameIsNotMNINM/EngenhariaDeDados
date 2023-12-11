package entities;

import interfaces.IUsuario;
import interfaces.Observer;

public class Professor extends Usuario implements IUsuario, Observer {
    private int notificacoes = 0;

    public Professor(int codigoUsuario, String nome) {
        super(codigoUsuario, nome);
        super.diasDeEmprestimo = 7;
    }

    @Override
    public void update() {
        this.notificacoes += 1;
    }

    public int getNotificacoes() {
        return this.notificacoes;
    }

    @Override
    public boolean podeEmprestar() {
        return !this.getIsDevedor();
    }

    @Override
    public int getLimiteEmprestimos() {
        return 7;
    }
}