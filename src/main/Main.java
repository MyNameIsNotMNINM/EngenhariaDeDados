package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntradaDados entradaDados = new EntradaDados();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String comando = scanner.nextLine();
                String[] comandoArray = comando.split(" ");
                String nomeComando = comandoArray[0];
                String[] argumentos =
                    Arrays.copyOfRange(comandoArray, 1, comandoArray.length);
                entradaDados.executar(nomeComando,
                    Arrays.stream(argumentos)
                        .mapToInt(Integer::parseInt)
                        .toArray());
            }
        }
    }
}
