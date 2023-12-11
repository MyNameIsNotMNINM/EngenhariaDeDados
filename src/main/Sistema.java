package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import data.HardCodedData;
import emprestimo.DevolverLivro;
import emprestimo.Emprestimo;
import emprestimo.EmprestimoLivro;
import entities.Exemplar;
import entities.Livro;
import entities.Reserva;
import interfaces.IUsuario;

public class Sistema {
  private Map<Integer, IUsuario> usuarios = new HashMap<>();
  private Map<Integer, Livro> livros = new HashMap<>();
  private Map<Integer, Exemplar> exemplares = new HashMap<>();
	private ArrayList<Reserva> reservas = new ArrayList<>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
  HardCodedData hardCodedData = new HardCodedData();
  private EmprestimoLivro emprestimoLivro;
  private DevolverLivro devolucaoLivro;

  private static Sistema instance;

  public Sistema() {
      carregarLivro();
      carregarExemplar();
      carregarUsuarios();
      emprestimoLivro = new EmprestimoLivro(this);
      devolucaoLivro = new DevolverLivro(this);
  }

  public static Sistema getInstance() {
    if (instance == null) {
      instance = new Sistema();
    }
    return instance;
  }

  private void carregarLivro() {
    ArrayList<Livro> livros = hardCodedData.getLivros();
    for (Livro livro : livros) {
        this.livros.put(livro.getCodigoLivro(), livro);
    }
  }

  private void carregarExemplar() {
    ArrayList<Exemplar> exemplares = hardCodedData.getExemplares();
    for (Exemplar exemplar : exemplares) {
        this.exemplares.put(exemplar.getCodigoExemplar(), exemplar);
        if (livros.containsKey(exemplar.getCodigoLivro())) {
            Livro livro = this.livros.get(exemplar.getCodigoLivro());
            livro.adicionarExemplar(exemplar);
        }
    }
  }

  private void carregarUsuarios() {
    ArrayList<IUsuario> usuarios = hardCodedData.getUsuarios();
    for (IUsuario usuario : usuarios) {
        this.usuarios.put(usuario.getCodigoUsuario(), usuario);
    }
  }

  public IUsuario getUsuarioByCodigo(int codigo){
      return this.usuarios.get(codigo);
  }

  public Map<Integer, IUsuario> getUsuarios() {
      return usuarios;
  }

  public ArrayList<IUsuario> obterUsuariosComLivrosEmprestados() {
    ArrayList<IUsuario> usuariosComLivrosEmprestados = new ArrayList<>();
    for (IUsuario usuario : this.usuarios.values()) {
      if (usuario.getEmprestimos().size() > 0) {
        usuariosComLivrosEmprestados.add(usuario);
      }
    }
    return usuariosComLivrosEmprestados;
  }

  public Livro getLivroByCodigo(int codigo){
    return this.livros.get(codigo);
  }

  public Map<Integer, Livro> getLivros() {
      return livros;
  }

  public Livro getLivroDisponivel(int codigoLivro) {
    for (Livro livro : this.livros.values()) {
      if (livro.getCodigoLivro() == codigoLivro) {
        return livro;
      }
    }
    return null;
  }

  public boolean verificarDisponibilidadeLivro(int codigoLivro) {
    for (Exemplar exemplar : this.exemplares.values()) {
      if (exemplar.getCodigoLivro() == codigoLivro && exemplar.isDisponivel()) {
        return true;
      }
    }
    return false;
  }

  public Map<Integer, Exemplar> getExemplares() {
      return exemplares;
  }

  public Exemplar getExemplarDisponivel(int codigoLivro) {
    for (Exemplar exemplar : this.exemplares.values()) {
      if (exemplar.getCodigoLivro() == codigoLivro && exemplar.isDisponivel()) {
        return exemplar;
      }
    }
    return null;
  }

  public boolean verificarDisponibilidadeExemplar(int codigoExemplar) {
    for (Exemplar exemplar : this.exemplares.values()) {
      if (exemplar.getCodigoExemplar() == codigoExemplar && exemplar.isDisponivel()) {
        return true;
      }
    }
    return false;
  }

  public ArrayList<Emprestimo> getEmprestimos() {
      return this.emprestimos;
  }

  public void adicionarEmprestimo(int codigoLivro, int codigoUsuario) {
      emprestimoLivro.executarOperacao(codigoLivro, codigoUsuario);
  }

  public void devolverLivro(int codigoLivro, int codigoUsuario) {
      devolucaoLivro.executarOperacao(codigoLivro, codigoUsuario);
  }

  public void removerEmprestimo(Emprestimo emprestimo) {
    this.emprestimos.remove(emprestimo);
  }
	
	public ArrayList<Reserva> getReservas() {
		return this.reservas;
	}

  public void adicionarReserva(Reserva reserva) {
    this.reservas.add(reserva);
  }

  public void removerReserva(Reserva reserva) {
    this.reservas.remove(reserva);
  }
}
