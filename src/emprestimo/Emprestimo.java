package entities;

import java.sql.Date;

public class Emprestimo {
    private Usuario user;
    private Date dataEmprestimo;
    private Exemplar exemplar;
    
    public Emprestimo(Usuario user, Date dataEmprestimo, Exemplar exemplar){
        this.user = user;
        this.dataEmprestimo = dataEmprestimo;
        this.exemplar = exemplar;
    }

    public Usuario getUser() {
        return user;
    }
    
    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public Exemplar getExemplar() {
        return exemplar;
    }
    
    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
    
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    
}
