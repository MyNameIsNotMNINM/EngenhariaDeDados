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

    
    public Livro getLivroByCodigo(int codigo){
        for (Livro livro : this.livros) {
            if(livro.codigo == codigo)
                return livro;
        }
        return null;
    }

    public Usuario getUsuarioByCodigo(int codigo){
        for (Usuario user : this.usuarios) {
            if(user.codigo == codigo)
                return user;
        }
        return null;
    }

    public Exemplar getExemplarByCodigo(int codigo){
        for (Exemplar exemplar : this.exemplares) {
            if(exemplar.codigo == codigo)
                return exemplar;
        }
        return null;
    }

    public static Biblioteca getInstance() {
		if (instance == null) {
			instance = new Biblioteca();
		}
		return instance;
	}

    public void GetAvailableExemplar(Livro livro){
        for (Exemplar exemplar : this.exemplares) {
            if (exemplar.isDisponivel() && exemplar.codigoLivro == livro.codigo) {
                return exemplar;
            }
        }
    }

    private void carregarLivro() {
        List<Livro> livroList = hardCodedData.getLivros();
        this.livros.addAll(livroList);
    }

    private void carregarExemplar() {
        List<Exemplar> exemplarList = hardCodedData.getExemplares();
        this.exemplares.addAll(exemplarList);
    }

    private void carregarUsuarios() {
        List<Usuario> usuarioList = hardCodedData.getAlunos();
        this.usuarios.addAll(usuarioList);
    }

    public void emprestarLivro(int codigoLivro, int matriculaUsuario) {
        Usuario user = getUsuarioByCodigo(matriculaUsuario);
        Livro livro = getLivroByCodigo(codigoLivro);
        
    }

    public void devolverLivro(int codigoLivro) {
        
    }

    public List<Livro> obterLivrosDisponiveis() {
        Set<Livro> livros = new HashSet<Livro> ();
        for (Exemplar exemplar : this.exemplares) {
            if (exemplar.isDisponivel()) {
                livros.add(getLivroByCodigo(exemplar.codigoLivro));
            }
        }
        return livros;
    }

    public List<Usuario> obterUsuariosComLivrosEmprestados() {

        return usuarios;
    }
}
