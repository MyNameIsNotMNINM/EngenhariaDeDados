package entities;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Exemplar> listaExemplares;
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.listaExemplares = new ArrayList<Exemplar>();
        this.livros = new ArrayList<Livro>();
        this.usuarios = new ArrayList<Usuario>();
    }


}
