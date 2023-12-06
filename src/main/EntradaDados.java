package main;
import java.util.HashMap;

import commands.*;

public class EntradaDados {
	private HashMap<String,Object> comando = new HashMap<String,Object>();

  public EntradaDados(Comando comando, String[] args) {
    listaComandos();
  }

  // Lista de comandos possíveis
  private void listaComandos() {
    this.comando.put("emp", new EmprestimoComando());
    this.comando.put("dev", new DevolverComando());
    this.comando.put("res", new ReservaComando());
    this.comando.put("obs", new ObservadorComando());
    this.comando.put("liv", new LivroComando());
    this.comando.put("usu", new UsuarioComando());
    this.comando.put("ntf", new NotificacaoComando());
  }

  // Executar comando
  public void execute(String[] args) {
    Comando cmd = (Comando) this.comando.get(args[0]);
    cmd.executar(args);
  }
}
