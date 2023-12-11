package main;

import entities.*;
import interfaces.IUsuario;

public class Biblioteca {
    private static Biblioteca instance;
    private Sistema sistema;
    private SaidaDados saidaDados;

    public Biblioteca() {
        this.sistema = Sistema.getInstance();
        this.saidaDados = new SaidaDados(sistema);
    }

    public static Biblioteca getInstance() {
        if (instance == null) {
            instance = new Biblioteca();
        }
        return instance;
    }

    public void emprestarLivro(int codigoLivro, int codigoUsuario) {
        this.sistema.adicionarEmprestimo(codigoLivro, codigoUsuario);
    }

    public void devolverLivro(int codigoLivro, int codigoUsuario) {
        this.sistema.devolverLivro(codigoLivro, codigoUsuario);
    }

    public void gerarObservador(int codigoLivro, int codigoUsuario) {
        Livro livro = this.sistema.getLivroByCodigo(codigoLivro);
        IUsuario usuario = this.sistema.getUsuarioByCodigo(codigoUsuario);
        livro.registrarObservador((Professor) usuario);
        System.out.println("Observador gerado com sucesso.");
    }

    public void notificar(int codigoUsuario) {
        IUsuario usuario = this.sistema.getUsuarioByCodigo(codigoUsuario);
        System.out.println(
            "Quantidade de vezes que o professor foi notificado: " + ((Professor) usuario).getNotificacoes());
    }

    public void reservarLivro(int codigoLivro, int codigoUsuario) {
        Livro livro = this.sistema.getLivroByCodigo(codigoLivro);
        IUsuario usuario = this.sistema.getUsuarioByCodigo(codigoUsuario);

        if (!usuario.limiteReservas()) {
            Reserva reserva = new Reserva(codigoUsuario, codigoLivro);
            usuario.adicionarReserva(reserva);
            livro.adicionarReserva(reserva);
            System.out.println("Nome: " + usuario.getNome() + " - Título do livro: " + livro.getTituloLivro()
                + " Reserva efetuada com sucesso.");
        } else {
            System.out.println("O usuario " + usuario.getNome() + " já alcançou o limite de reservas");
        }
    }

    public void consultarLivro(int codigoLivro) {
        Livro livro = this.sistema.getLivroByCodigo(codigoLivro);
        saidaDados.imprimirInformacoesLivro(livro);
    }

    public void consultarUsuario(int codigoUsuario) {
        IUsuario usuario = this.sistema.getUsuarioByCodigo(codigoUsuario);
        saidaDados.imprimirInformacoesUsuario(usuario);
    }
}
