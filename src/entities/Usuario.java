package entities;

public class Usuario {
    private int id;
    private String nome;
    private boolean isDevedor;
    protected int diasDeEmprestimo;
    private int notificationCount;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getID() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setIsDevedor(boolean isDevedor) {
        this.isDevedor = isDevedor;
    }

    public void getIsDevedor() {
        return this.isDevedor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeNotificacoes(){
        return this.notificationCount;
    }

    public int getDiasDeEmprestimo() {
        return this.diasDeEmprestimo;
    }
}
