package main;

import entities.Exemplar;
import entities.Livro;
import entities.Usuario;
import data.HardCodedData;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static Biblioteca instance;
    private ArrayList<Exemplar> listaDeExemplares = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    HardCodedData hardCodedData = new HardCodedData();

    public Biblioteca() {
        carregarLivro();
        carregarExemplar();
        carregarUsuarios();
    }

    public static Biblioteca getInstance() {
		if (instance == null) {
			instance = new Biblioteca();
		}
		return instance;
	}

    private void carregarLivro() {
        List<Livro> livroList = hardCodedData.getLivros();
        livros.addAll(livroList);
    }

    private void carregarExemplar() {
        List<Exemplar> exemplarList = hardCodedData.getExemplares();
        listaDeExemplares.addAll(exemplarList);
    }

    private void carregarUsuarios() {
        List<Usuario> usuarioList = hardCodedData.getAlunos();
        usuarios.addAll(usuarioList);
    }

    public void emprestarLivro(String codigoLivro, String matriculaUsuario) {
        
    }

    public void devolverLivro(String codigoLivro) {
        
    }

    public List<Livro> obterLivrosDisponiveis() {
        List<Livro> livros = new ArrayList<>();
        for (Exemplar exemplar : listaDeExemplares) {
            if (exemplar.isDisponivel()) {
                for (Livro livro : this.livros) {
                    if (exemplar.getCodigoLivro().equals(livro.getCodigoLivro())) {
                        livros.add(livro);
                    }
                }
            }
        }
        return livros;
    }

    public List<Usuario> obterUsuariosComLivrosEmprestados() {

        return usuarios;
    }
}
