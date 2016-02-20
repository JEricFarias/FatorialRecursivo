package fatorialrecursivo;

/**
 *
 * @author Eric Farias
 * @version 1.0
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número para calcular o faorial: ");
        int numero = input.nextInt();
        System.out.println("O fatorial é: " + FatorialRecursivo.fatorial(numero));
    }
}
