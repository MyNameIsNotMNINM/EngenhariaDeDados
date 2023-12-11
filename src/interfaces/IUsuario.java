package interfaces;

import java.util.ArrayList;

import entities.Reserva;
import emprestimo.Emprestimo;

public interface IUsuario {
    int getCodigoUsuario();
    void setCodigoUsuario(int codigoUsuario);
    
    String getNome();
    void setNome(String nome);

    void setIsDevedor(boolean isDevedor);
    boolean getIsDevedor();
    
    int getDiasDeEmprestimo();
    void setDiasDeEmprestimo(int diasDeEmprestimo);

    ArrayList<Reserva> getReservas();
    void adicionarReserva(Reserva reserva);
    void removerReserva(Reserva reserva);
    boolean limiteReservas();

    boolean podeEmprestar();
    void adicionarEmprestimo(Emprestimo emprestimo);
    void removerEmprestimo(Emprestimo emprestimo);
    int getLimiteEmprestimos();
    ArrayList<Emprestimo> getEmprestimos();
  }
