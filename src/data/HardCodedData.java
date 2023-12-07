package data;

import java.util.List;

import entities.*;
import java.util.ArrayList;

public class HardCodedData {
    public List<Livro> getLivros(){
        List<Livro> livros = new ArrayList<Livro>();
        livros.add(new Livro(100,"Engenharia de Software","Addison Wesley","Ian Sommervile", "6ª", 2000));
        livros.add(new Livro(101,"UML - Guia do Usuário","Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson","7ª", 2000));
        livros.add(new Livro(200,"Code Complete","Microsoft Press","Steve McConnell", "2ª", 2014));
        livros.add(new Livro(201,"Agile Software Development, Principles, Patterns, and Practices","Prentice Hall","Robert Martin", "1ª", 2002));
        livros.add(new Livro(300,"Refactoring: Improving the Design of Existing Code","Addison Wesley Professional","Martin Fowler ", "1ª", 1999));
        livros.add(new Livro(301,"Software Metrics: A Rigorous and Practical Approach","CRC Press", "Norman Fenton, James Bieman", "3ª", 2014));
        livros.add(new Livro(401,"UML Distilled: A Brief Guide to the Standard Object Modeling Language","Addison Wesley Professional","Martin Fowler ", "3ª", 2003));
        return livros; 

    }

    public List<Exemplar> getExemplares(){
        List<Exemplar> exemplares = new ArrayList<Exemplar>();

        exemplares.add(new Exemplar(100, 1, true));
        exemplares.add(new Exemplar(100, 2, true));
        exemplares.add(new Exemplar(101, 3, true));
        exemplares.add(new Exemplar(200, 4, true));
        exemplares.add(new Exemplar(201, 5, true));
        exemplares.add(new Exemplar(300, 6, true));
        exemplares.add(new Exemplar(300, 7, true));
        exemplares.add(new Exemplar(400, 8, true));
        exemplares.add(new Exemplar(400, 9, true));
        return  exemplares;
    }

    public List<Usuario> getAlunos() {
        List<Usuario> alunos = new ArrayList<Usuario>();

        alunos.add(new AlunoGraduacao(123, "João da Silva"));
        alunos.add(new AlunoPosGraduacao(456, "Luiz Fernando Rodrigues"));
        alunos.add(new AlunoGraduacao(789, "Pedro Paulo"));
        alunos.add(new Professor(100, "Carlos Lucena"));
        return alunos; 
    }
}