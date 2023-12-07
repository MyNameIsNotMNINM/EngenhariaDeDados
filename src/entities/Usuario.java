package entities;

public class Usuario {
    private int codigoUsuario;
    private String nome;
    private boolean isDevedor;
    protected int diasDeEmprestimo;
    private int notificationCount;

    public Usuario(int codigoUsuario, String nome) {
        this.codigoUsuario = codigoUsuario;
        this.nome = nome;
    }

    public int getCodigoUsuario() {
        return this.codigoUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public void setIsDevedor(boolean isDevedor) {
        this.isDevedor = isDevedor;
    }

    public boolean getIsDevedor() {
        return isDevedor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeNotificacoes(){
        return this.notificationCount;
    }

    public int setNumeroDeNotificacoes(){
        return this.notificationCount;
    }


    public int getDiasDeEmprestimo() {
        return this.diasDeEmprestimo;
    }
}
