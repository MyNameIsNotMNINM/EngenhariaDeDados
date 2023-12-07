package main;
import java.util.HashMap;

import commands.*;
import interfaces.Command;

public class EntradaDados {
	private HashMap<String,Object> comando = new HashMap<String,Object>();

  public EntradaDados(Command comando, String[] args) {
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
  }

  // Executar comando
  public void execute(String[] args) {
    Command cmd = (Command) this.comando.get(args[0]);
    cmd.executar(args);
  }
}
