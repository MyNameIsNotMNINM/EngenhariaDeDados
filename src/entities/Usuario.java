package entities;

public class Usuario {
    private int id;
    private String nome;
    protected int diasDeEmprestimo;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiasDeEmprestimo() {
        return this.diasDeEmprestimo;
    }
}
