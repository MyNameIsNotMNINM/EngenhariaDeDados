package emprestimo;

import entities.Exemplar;
import entities.Livro;
import interfaces.IOperacaoEmprestimo;
import interfaces.IUsuario;
import java.time.LocalDate;
import main.Sistema;

public class DevolverLivro implements IOperacaoEmprestimo {
    private Sistema sistema;

    public DevolverLivro(Sistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void executarOperacao(int codigoLivro, int codigoUsuario) {
        IUsuario usuario = sistema.getUsuarioByCodigo(codigoUsuario);
        Livro livro = sistema.getLivroByCodigo(codigoLivro);

        Exemplar exemplar = sistema.getExemplarDisponivel(codigoLivro);
        if (exemplar != null) {
            for (Emprestimo emprestimo : livro.getEmprestimos()) {
                if (emprestimo.getCodigoUsuario() == codigoUsuario && emprestimo.getCodigoLivro() == codigoLivro
                    && !emprestimo.isDevolvido()) {
                    emprestimo.setDevolvido(true);
                    emprestimo.setDataDevolucao(LocalDate.now());
                    exemplar.setDisponivel(true);
                    System.out.println("Nome: " + usuario.getNome() + " - Título do livro: " + livro.getTituloLivro()
                        + " Devolução efetuada com sucesso.");
                }
            }
        } else {
            System.out.println("Não há exemplares disponíveis.");
        }
    }
}