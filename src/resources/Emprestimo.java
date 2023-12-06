package resources;

import java.time.LocalDate;

import interfaces.IUsuario;
import entities.Exemplar;

public class Emprestimo {
    private int codigoUsuario;
    private int codigoExemplar;
    private String codigoLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataLimite;
    private LocalDate dataDevolucao;
    private boolean devolvido;

    public Emprestimo(IUsuario usuario, Exemplar exemplar) {
        this.codigoUsuario = usuario.getID();
        this.codigoExemplar = exemplar.getIdExemplar();
        this.codigoLivro = exemplar.getCodigoLivro();
        this.dataEmprestimo = LocalDate.now();
        this.dataLimite = LocalDate.now().plusDays(usuario.getDiasDeEmprestimo());
        this.dataDevolucao = null;
        this.devolvido = false;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public int getCodigoExemplar() {
        return codigoExemplar;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setCodigoUsuario(int id) {
        this.codigoUsuario = id;
    }

    public void setCodigoExemplar(int id) {
        this.codigoExemplar = id;
    }

    public void setCodigoLivro(String id) {
        this.codigoLivro = id;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}
