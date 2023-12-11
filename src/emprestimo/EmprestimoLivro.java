package emprestimo;

import entities.Exemplar;
import entities.Livro;
import interfaces.IOperacaoEmprestimo;
import interfaces.IUsuario;
import main.Sistema;

public class EmprestimoLivro implements IOperacaoEmprestimo {
    private Sistema sistema;

    public EmprestimoLivro(Sistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void executarOperacao(int codigoLivro, int codigoUsuario) {
        IUsuario usuario = sistema.getUsuarioByCodigo(codigoUsuario);
        Livro livro = sistema.getLivroByCodigo(codigoLivro);

        Exemplar exemplar = sistema.getExemplarDisponivel(codigoLivro);
        if (exemplar != null) {
            if (usuario.podeEmprestar()) {
                Emprestimo emprestimo = new Emprestimo(usuario, exemplar);
                usuario.adicionarEmprestimo(emprestimo);
                livro.adicionarEmprestimo(emprestimo);
                exemplar.setDisponivel(false);
                if (livro.getReservas().size() > 0) {
                    livro.removerReserva(livro.getReservas().get(0));
                    usuario.removerReserva(usuario.getReservas().get(0));
                }
                System.out.println("Nome: " + usuario.getNome()
                    + " - Título do livro: " + livro.getTituloLivro()
                    + " Empréstimo efetuado com sucesso.");
            } else {
                System.out.println("O usuário " + usuario.getNome()
                    + " já alcançou o limite de empréstimos.");
            }
        } else {
            System.out.println("Não há exemplares disponíveis.");
        }
    }
}