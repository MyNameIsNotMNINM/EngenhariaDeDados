package emprestimo;

import interfaces.IEmprestimoVerifier;
import interfaces.IUsuario;

public class EmprestimoVerifierProfessor implements IEmprestimoVerifier {
    private IUsuario usuario;

    public EmprestimoVerifierProfessor(IUsuario usuario) {
        this.usuario = usuario;
    }

    public IUsuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(IUsuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean verificar(Emprestimo emprestimo) {
        IUsuario usuario = emprestimo.getUsuario();
        return !usuario.getIsDevedor();
    }
}