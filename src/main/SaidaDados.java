package main;

import emprestimo.Emprestimo;
import entities.*;
import interfaces.IUsuario;

public class SaidaDados {
    private Sistema sistema;

    public SaidaDados(Sistema sistema) {
        this.sistema = sistema;
    }

    public void imprimirInformacoesUsuario(IUsuario usuario) {
        System.out.println("-");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("----------------");
        System.out.println("Quantidade de empréstimos: " + usuario.getEmprestimos().size());
        System.out.println("-");
        for (Emprestimo emprestimo : usuario.getEmprestimos()) {
            imprimirInformacoesEmprestimo(emprestimo);
        }
        imprimirInformacoesReservas(usuario);
    }

    private void imprimirInformacoesReservas(IUsuario usuario) {
        System.out.println("----------------");
        System.out.println("Quantidade de reservas: " + usuario.getReservas().size());
        System.out.println("-");
        for (Reserva reserva : usuario.getReservas()) {
            imprimirInformacoesReserva(reserva);
        }
    }

    private void imprimirInformacoesReserva(Reserva reserva) {
        System.out.println("Reservado por: " + this.sistema.getUsuarioByCodigo(reserva.getCodigoUsuario()).getNome());
        System.out.println(
            "Título do livro: " + this.sistema.getLivroByCodigo(reserva.getCodigoLivro()).getTituloLivro());
        System.out.println("Data da reserva: " + reserva.getData());
        System.out.println("-");
    }

    public void imprimirInformacoesLivro(Livro livro) {
        System.out.println("-");
        System.out.println("Título: " + livro.getTituloLivro());
        System.out.println("Quantidade de reservas: " + livro.getReservas().size());
        System.out.println("Quantidade de exemplares: " + livro.getExemplares().size());
        imprimirReservas(livro);
        imprimirExemplares(livro);
    }

    private void imprimirReservas(Livro livro) {
        if (livro.getReservas().size() != 0) {
            System.out.println("----------------");
            System.out.println("Reservas");
            System.out.println("-");
            for (Reserva reserva : livro.getReservas()) {
                imprimirInformacoesReserva(reserva);
            }
        }
    }

    private void imprimirExemplares(Livro livro) {
        if (livro.getExemplares().size() != 0) {
            System.out.println("----------------");
            System.out.println("Exemplares");
            System.out.println("-");
            for (Exemplar exemplar : livro.getExemplares()) {
                imprimirInformacoesExemplar(exemplar, livro);
            }
        }
    }

    private void imprimirInformacoesExemplar(Exemplar exemplar, Livro livro) {
        System.out.println("Código do exemplar: " + exemplar.getCodigoExemplar());
        System.out.println("Status do exemplar: " + (exemplar.isDisponivel() ? "Disponível" : "Emprestado"));
        System.out.println("-");

        if (!exemplar.isDisponivel()) {
            imprimirInformacoesEmprestimo(livro, exemplar);
        }
    }

    private void imprimirInformacoesEmprestimo(Livro livro, Exemplar exemplar) {
        for (Emprestimo emprestimo : livro.getEmprestimos()) {
            if (emprestimo.getCodigoExemplar() == exemplar.getCodigoExemplar()) {
                imprimirInformacoesEmprestimo(emprestimo);
            }
        }
    }

    private void imprimirInformacoesEmprestimo(Emprestimo emprestimo) {
        System.out.println("Emprestado por: " + emprestimo.getUsuario().getNome());
        System.out.println(
            "Título do livro: " + this.sistema.getLivroByCodigo(emprestimo.getCodigoLivro()).getTituloLivro());
        System.out.println("Data do empréstimo: " + emprestimo.getDataEmprestimo());
        if (emprestimo.isDevolvido()) {
            System.out.println("Data da devolução: " + emprestimo.getDataDevolucao());
        } else {
            System.out.println("Data da devolução prevista: " + emprestimo.getDataDevolucao());
        }
        System.out.println("Status do empréstimo: " + (emprestimo.isDevolvido() ? "Finalizado" : "Em curso"));
        System.out.println("-");
    }
}