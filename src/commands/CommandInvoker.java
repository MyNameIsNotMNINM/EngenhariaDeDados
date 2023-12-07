package commands;

import interfaces.Command;

public class CommandInvoker implements Command {
  private Command command;

  public CommandInvoker(Command command) {
    this.command = command;
  }

  public void executar(String[] args) {
    this.command.executar(args);
  }
}
