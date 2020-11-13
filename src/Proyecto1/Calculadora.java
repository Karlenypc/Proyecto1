package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Calculadora {

    //Metodos Operaciones Basicas
    public static int suma(int num1, int num2) {
        int resultado;
        resultado = num1 + num2;
        return resultado;

    }

    public static double suma(double num1, double num2) {
        double resultado;
        resultado = num1 + num2;
        return resultado;

    }

    public static int resta(int num1, int num2) {
        int resultado;
        resultado = num1 - num2;
        return resultado;

    }

    public static double resta(double num1, double num2) {
        double resultado;
        resultado = num1 - num2;
        return resultado;

    }

    public static int multiplicacion(int num1, int num2) {
        int resultado;
        resultado = num1 * num2;
        return resultado;

    }

    public static double multiplicacion(double num1, double num2) {
        double resultado;
        resultado = num1 * num2;
        return resultado;

    }
//
    public static int division(int num1, int num2) {
        int resultado;
        resultado = num1 / num2;
        return resultado;

    }

    public static double division(double num1, double num2) {
        double resultado;
        resultado = num1 / num2;
        return resultado;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora llamada = new Calculadora();

        //Variables 
        int num1 = 0;
        int num2 = 0;
        int sumaTotal = 0;
        int restaTotal = 0;
        int multiplTotal = 0;
        double divisionTotal = 0;
        String operacion = "";
        String operador = "";

        //Datos usuario
        System.out.print("Ingrese el primer digito: ");
        num1 = entrada.nextInt();
        System.out.print("\n" + "Seleccione la operación que desea realizar:"
                + "\n" + "+ = suma" + "\n" + "- = resta" + "\n"
                + "* = multiplicación" + "\n" + "/ = división" + "\n");
        operacion = entrada.next();
        System.out.print("Ingrese el segundo digito: ");
        num2 = entrada.nextInt();

        switch (operacion) {
            case "+": {
                operador = "+";
                sumaTotal = llamada.suma(num1, num2);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(num1 + " " + operador + " " + num2 + " " + "=" + " " + sumaTotal);
                break;
            }

            case "-": {
                operador = "-";
                restaTotal = llamada.resta(num1, num2);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(num1 + " " + operador + " " + num2 + " " + "=" + " " + restaTotal);
                break;
            }

            case "*": {
                operador = "*";
                multiplTotal = llamada.multiplicacion(num1, num2);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(num1 + " " + operador + " " + num2 + " " + "=" + " " + multiplTotal);
                break;
            }

            case "/": {
                operador = "/";
                divisionTotal = llamada.division(num1, num2);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(num1 + " " + operador + " " + num2 + " " + "=" + " " + divisionTotal);
                break;
            }
            
            case "a": {
                operador = "/";
                divisionTotal = llamada.division(num1, num2);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(num1 + " " + operador + " " + num2 + " " + "=" + " " + divisionTotal);
                break;
            }
        }

    }

}
