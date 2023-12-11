package emprestimo;

import interfaces.IEmprestimoVerifier;
import interfaces.IUsuario;

public class EmprestimoVerifierAlunoGraduacao implements IEmprestimoVerifier {
    private IUsuario usuario;
    private int codigoExemplar;

    public EmprestimoVerifierAlunoGraduacao(IUsuario usuario) {
        this.usuario = usuario;
    }

    public IUsuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(IUsuario usuario) {
        this.usuario = usuario;
    }

    public int getCodigoExemplar() {
        return this.codigoExemplar;
    }

    public void setCodigoExemplar(int codigoExemplar) {
        this.codigoExemplar = codigoExemplar;
    }

    @Override
    public boolean verificar(Emprestimo emprestimo) {
        IUsuario usuario = emprestimo.getUsuario();
        return !usuario.getIsDevedor() && usuario.getEmprestimos().size() < 3;
    }
}