package emprestimo;

import entities.Exemplar;
import interfaces.IUsuario;
import java.time.LocalDate;

public class Emprestimo {
    private IUsuario usuario;
    private int codigoUsuario;
    private int codigoExemplar;
    private int codigoLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean devolvido;

    public Emprestimo(IUsuario usuario, Exemplar exemplar) {
        this.usuario = usuario;
        this.codigoUsuario = usuario.getCodigoUsuario();
        this.codigoExemplar = exemplar.getCodigoExemplar();
        this.codigoLivro = exemplar.getCodigoLivro();
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao =
            LocalDate.now().plusDays(usuario.getDiasDeEmprestimo());
        this.devolvido = false;
    }

    public IUsuario getUsuario() {
        return this.usuario;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public int getCodigoExemplar() {
        return codigoExemplar;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}
