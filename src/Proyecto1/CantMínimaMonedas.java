package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class CantMínimaMonedas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int monto = 0;
        int residuo = 0;
        int totalMonedas = 0;
        
        System.out.print("Ingrese la cantidad de dinero: ");
        monto = in.nextInt();

        int[] tiposMonedas = {1000, 500, 100, 10, 5, 1};

        tiposMonedas[0] = monto / 1000;
        residuo = monto % 1000;

        tiposMonedas[1] = residuo / 500;
        residuo = residuo % 500;

        tiposMonedas[2] = residuo / 100;
        residuo = residuo % 100;

        tiposMonedas[3] = residuo / 10;
        residuo = residuo % 10;

        tiposMonedas[4] = residuo / 5;
        residuo = residuo % 5;

        tiposMonedas[5] = residuo / 1;

        totalMonedas = tiposMonedas[0] + tiposMonedas[1] + tiposMonedas[2] + tiposMonedas[3] + tiposMonedas[4] + tiposMonedas[5];
        
        System.out.println("\n" + "Desglose de monedas: ");
        
        if (tiposMonedas[0] != 0) {
            System.out.println(tiposMonedas[0] + " de mil");
        }
        if (tiposMonedas[1] != 0) {
            System.out.println(tiposMonedas[1] + " de quinientos");
        }
        if (tiposMonedas[2] != 0) {
            System.out.println(tiposMonedas[2] + " de cien");
        }
        if (tiposMonedas[3] != 0) {
            System.out.println(tiposMonedas[3] + " de diez");
        }
        if (tiposMonedas[4] != 0) {
            System.out.println(tiposMonedas[4] + " de cinco");
        }
        if (tiposMonedas[5] != 0) {
            System.out.println(tiposMonedas[5] + " de uno");
        }
        System.out.println("\n" + "Para un total de " + totalMonedas + " monedas");
    }
}
