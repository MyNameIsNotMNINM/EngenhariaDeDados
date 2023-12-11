package entities;

import emprestimo.Emprestimo;
import java.util.ArrayList;

public class Usuario {
    private int codigoUsuario;
    private String nome;
    private ArrayList<Reserva> reservas;
    private ArrayList<Emprestimo> emprestimos;
    private int quantidadeReserva;
    private boolean isDevedor;
    protected int diasDeEmprestimo;

    public Usuario(int codigoUsuario, String nome) {
        this.codigoUsuario = codigoUsuario;
        this.nome = nome;
        this.reservas = new ArrayList<Reserva>();
        this.emprestimos = new ArrayList<Emprestimo>();
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

    public int getDiasDeEmprestimo() {
        return this.diasDeEmprestimo;
    }

    public void setDiasDeEmprestimo(int diasDeEmprestimo) {
        this.diasDeEmprestimo = diasDeEmprestimo;
    }

    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
        this.quantidadeReserva++;
    }

    public void removerReserva(Reserva reserva) {
        this.reservas.remove(reserva);
        if (this.quantidadeReserva > 0) {
            this.quantidadeReserva--;
        }
    }

    public boolean limiteReservas() {
        return this.quantidadeReserva == 3;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return this.emprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.remove(emprestimo);
    }

    public void getLivrosEmprestados() {
        for (Emprestimo emprestimo : this.emprestimos) {
            System.out.println(emprestimo.getCodigoExemplar());
        }
    }
}
