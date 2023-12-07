package entities;

public class Usuario {
    private int codigo;
    private String nome;
    private boolean isDevedor;
    protected int diasDeEmprestimo;
    private int notificationCount;

    public Usuario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
