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
    public static long fatorial(int v){
        // base step
        if(v == 1){
            return v;
        } 
        // recursive step
        else{
            return v * fatorial(v - 1);
        }
    }
}
