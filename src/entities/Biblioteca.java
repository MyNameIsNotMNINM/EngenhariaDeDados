package entities;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Exemplar> listaDeExemplares = new ArrayList<Exemplar>();

    public Biblioteca() {

    }

    public int adicionarExemplar(Exemplar exemplar){
        exemplar.setIdExemplar(listaDeExemplares.size());
        listaDeExemplares.add(exemplar);
        return exemplar.getIdExemplar();
    }
}
