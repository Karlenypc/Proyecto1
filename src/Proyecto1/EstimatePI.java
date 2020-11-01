package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class EstimatePI {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n = reader.nextInt();

        System.out.println("An estimate value of PI is = " + pi(n));
    }

    //Metodo para estimar el valor de PI
    public static double pi(int n) {
        int denominator = 1, operator = 1;
        double term = 0, sum = 0;

        for (int i = 1; i <= n; i++) {
            term = (double) 1 / denominator * operator;
            sum += term;
            denominator += 2;
            operator *= -1;
        }
        return sum * 4;
    }
}
