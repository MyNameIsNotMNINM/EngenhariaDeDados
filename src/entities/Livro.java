package entities;

import emprestimo.Emprestimo;
import interfaces.INotificacao;
import interfaces.Observer;
import java.util.ArrayList;

public class Livro implements INotificacao {
    private int codigoLivro;
    private String titulo;
    private String editora;
    private String autores;
    private String edicao;
    private int ano;
    private ArrayList<Observer> observers;
    private ArrayList<Reserva> reservas;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Exemplar> exemplares;

    public Livro(int codigoLivro, String titulo, String editora, String autores, String edicao, int ano) {
        this.codigoLivro = codigoLivro;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.ano = ano;
        this.observers = new ArrayList<Observer>();
        this.reservas = new ArrayList<Reserva>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.exemplares = new ArrayList<Exemplar>();
    }

    public int getCodigoLivro() {
        return this.codigoLivro;
    }

    public String getTituloLivro() {
        return this.titulo;
    }

    public String getEditoraLivro() {
        return this.editora;
    }

    public String getAutoresLivro() {
        return this.autores;
    }

    public String getEdicaoLivro() {
        return this.edicao;
    }

    public int getAnoLivro() {
        return this.ano;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
        if (reservas.size() > 2) {
            notificarObservadores();
        }
    }

    public void removerReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }

    public int getQuantidadeReservas() {
        return reservas.size();
    }

    public ArrayList<Reserva> getReservasUsuario(int codigoUsuario) {
        ArrayList<Reserva> reservasUsuario = new ArrayList<Reserva>();
        for (Reserva reserva : reservas) {
            if (reserva.getCodigoUsuario() == codigoUsuario) {
                reservasUsuario.add(reserva);
            }
        }
        return reservasUsuario;
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

    public int getQuantidadeEmprestimos() {
        return emprestimos.size();
    }

    public ArrayList<Exemplar> getExemplares() {
        return this.exemplares;
    }

    public void adicionarExemplar(Exemplar exemplar) {
        this.exemplares.add(exemplar);
    }

    @Override
    public void registrarObservador(Observer observador) {
        observers.add(observador);
    }

    @Override
    public void removerObservador(Observer observador) {
        if (observers.indexOf(observador) >= 0) {
            observers.remove(observador);
        }
    }

    @Override
    public void notificarObservadores() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}