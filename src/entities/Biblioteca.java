package entities;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Exemplar> listaDeExemplares = new ArrayList<Exemplar>();
    private ArrayList<Livro> Livros = new ArrayList<Livro>();
    private ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();

    public Biblioteca() {

    }

    public int adicionarExemplar(Exemplar exemplar){
        exemplar.setIdExemplar(listaDeExemplares.size());
        listaDeExemplares.add(exemplar);
        return exemplar.getIdExemplar();
    }
}
