package fatorialrecursivo;

import java.util.Scanner;

/**
 *
 * @author Eric Farias
 * @version 1.0
 * 
 */
public class FatorialRecursivo{
    
    // recursive funcion
    public static long fatorial(int n){
        // base step
        if(n == 1){
            return n;
        } 
        // recursive step
        else{
            return n * fatorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número para calcular o faorial: ");
        int numero = input.nextInt();
        System.out.println("O fatorial é: " + fatorial(numero));
    }
}
