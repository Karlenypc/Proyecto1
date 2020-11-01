
package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class CalculoPotencia {
    
    //Metodo para elevar "x" número al exponente "y" 
    //SIN uso del metodo Math.pow
    public static int elevarPotencia(int base, int exponente){
        
        //Retorno del resultado final
        if(exponente ==1) {
            return base;
        } 
        //Cualquier número elevado a 0 = 1 
        else if (exponente ==0) { 
            return 1;
        } 
        //decremento y continua el "ciclo" hasta llegar a (exponente == 1)
        else {
            return base * elevarPotencia(base, (exponente - 1)); 
        }
    }
    
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el número que desea calcular: ");
        int baseNum = lector.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = lector.nextInt();
        System.out.println();
        System.out.println("El resultado de " + baseNum + "^" + exponente + " es = " + elevarPotencia(baseNum, exponente));
    }
}
