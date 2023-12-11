package main;
import commands.*;
import interfaces.Command;
import java.util.HashMap;

public class EntradaDados {
    private HashMap<String, Object> comando = new HashMap<String, Object>();

    public EntradaDados() {
        listaComandos();
    }

    // Lista de comandos possíveis
    private void listaComandos() {
        this.comando.put("emp", new EmprestimoCommand());
        this.comando.put("dev", new DevolverCommand());
        this.comando.put("res", new ReservaCommand());
        this.comando.put("obs", new ObservadorCommand());
        this.comando.put("liv", new LivroCommand());
        this.comando.put("usu", new UsuarioCommand());
        this.comando.put("ntf", new NotificacaoCommand());
        this.comando.put("sai", new SairCommand());
    }

    // Executar comando
    public void executar(String cmd, int[] arg) {
        Command command = (Command) this.comando.get(cmd);
        command.executar(arg);
    }
}
