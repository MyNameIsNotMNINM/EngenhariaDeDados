package main;

import entities.Exemplar;
import entities.Livro;
import entities.Usuario;
import data.HardCodedData;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static Biblioteca instance;
    private ArrayList<Exemplar> exemplares = new ArrayList<>();
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
        exemplares.addAll(exemplarList);
    }

    private void carregarUsuarios() {
        List<Usuario> usuarioList = hardCodedData.getAlunos();
        usuarios.addAll(usuarioList);
    }

    public void emprestarLivro(int codigoLivro, int matriculaUsuario) {
        Usuario user = getUsuarioByCodigo(matriculaUsuario);
        Livro livro = getLivroByCodigo(codigoLivro);

    }

    public void devolverLivro(int codigoLivro) {
        
    }

    public List<Livro> obterLivrosDisponiveis() {
        Set<Livro> livros = new HashSet<Livro> ();
        for (Exemplar exemplar : exemplares) {
            if (exemplar.isDisponivel()) {
                livros.add(getLivroByCodigo(exemplar.codigoLivro));
            }
        }
        return livros;
    }

    public Livro getLivroByCodigo(int codigo){
        for (Livro livro : livros) {
            if(livro.codigo == codigo)
                return livro;
        }
        return null;
    }

    public Usuario getUsuarioByCodigo(int codigo){
        for (Usuario user : usuarios) {
            if(user.codigo == codigo)
                return user;
        }
        return null;
    }

    public Exemplar getExemplarByCodigo(int codigo){
        for (Exemplar exemplar : exemplares) {
            if(exemplar.codigo == codigo)
                return exemplar;
        }
        return null;
    }

    public List<Usuario> obterUsuariosComLivrosEmprestados() {

        return usuarios;
    }
}
