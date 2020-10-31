package Proyecto1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Karlenypc
 */
public class Calculadora2 {

    //Metodo que suma 2 números enteros
    public static int suma(int x, int y) {
        int resultado;
        resultado = x + y;
        return resultado;

    }

    public static double suma(double x, double y) {
        double resultado;
        resultado = x + y;
        return resultado;

    }

    //Metodo que resta 2 números enteros
    public static int resta(int x, int y) {
        int resultado;
        resultado = x - y;
        return resultado;

    }

    public static double resta(double x, double y) {
        double resultado;
        resultado = x - y;
        return resultado;

    }

    //Metodo que multiplica 2 números enteros
    public static int multiplicacion(int x, int y) {
        int resultado;
        resultado = x * y;
        return resultado;

    }

    public static double multiplicacion(double x, double y) {
        double resultado;
        resultado = x * y;
        return resultado;

    }

    //Metodo que divide 2 números enteros
    public static int division(int x, int y) {
        int resultado;
        resultado = x / y;
        return resultado;

    }

    public static double division(double x, double y) {
        double resultado;
        resultado = x / y;
        return resultado;

    }

    //Metodo calculo promedio SIN arreglos
    public static int promedio(int sumatoria, int nElementos) {
        Scanner entrada = new Scanner(System.in);

        int resultado = 0;

        System.out.println("Favor digite la cantidad de números que desea promediar: ");
        nElementos = entrada.nextInt();
        for (int i = 0; i <= nElementos; i++) {
            System.out.println("Digite el numero: " + (i + 1));
            int numero = entrada.nextInt();
            sumatoria = +numero;
        }
        resultado = sumatoria / nElementos;
        return resultado;
    }

    //Metodo calculo promedio con arreglos
    public static int promedio(int[] elementos) {
        int resultado = 0;
        int sumA = 0;

        for (int numero : elementos) {
            sumA = +numero;
        }

        resultado = sumA / elementos.length;
        return resultado;
    }

    //Metodo calculo factorial n!
    public static int factorial(int n) {
        int resultado = 1;

        for (int i = n; i > 0; i--) {
            resultado = resultado * i;
        }
        return resultado;
    }

    //Método calculo valor Max SIN arreglo 
    public static int valorMax(int digitos, int nDigitos) {
        int resultado = 0;

        //Mostrar datos? 
        int maximo = 0;
        for (int i = 0; i <= nDigitos; i++) {
            if (i > maximo) {
                i = maximo;
            }
            resultado = maximo;
        }
        return resultado;
    }
    
    //Método para hayar el valor Max con arreglo[]
    //public static int 

    //Reordenar lista de forma aleatoria 
    public static int[] reordenarAleatorio(int[] numeros) {
        int[] resultado = new int[numeros.length];

        //El arreglo se inicializa con ceros 
        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = 0;
        }

        for (int i = 0; i < numeros.length; i++) {
            int index = aleatorio(numeros.length);

            if (resultado[index] == 0) {
                resultado[index] = numeros[i];
            } else {
                i--;
            }
        }
        return resultado;
    }

    //Método que retorna un entero entre 0 y (n-1)
    private static int aleatorio(int n) {
        int resultado = 0;
        double numAleatorio = Math.random() * (n);
        resultado = (int) Math.floor(numAleatorio);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora2 newCalcu = new Calculadora2();

        //Variables
        int x = 0;
        int y = 0;
        int sumaTotal = 0;
        int restaTotal = 0;
        int multiplTotal = 0;
        double divisionTotal = 0;
        String operacion = "";
        String operador = "";
        int nElementos = 0;
        int sumatoria = 0;

        //Datos usuario
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. + = suma");
        System.out.println("2. - = resta");
        System.out.println("3. * = multiplicación");
        System.out.println("4. / = división");
        System.out.println("5. a = % calculo promedio (SIN arreglos)");
        System.out.println("6. b = % calculo promedio (con arreglos)");
        System.out.println("7. c = n! calculo de un factorial");
        System.out.println("8. d = calculo del valor Máximo");
        System.out.println("9.  = promedio (con arreglos)");

        operacion = entrada.next();

        switch (operacion) {
            case "+": {
                System.out.print("Ingrese el primer digito: ");
                x = entrada.nextInt();
                operador = "+";
                System.out.print("Ingrese el segundo digito: ");
                y = entrada.nextInt();
                sumaTotal = newCalcu.suma(x, y);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(x + " " + operador + " " + y + " " + "=" + " " + sumaTotal);
                break;
            }

            case "-": {
                System.out.print("Ingrese el primer digito: ");
                x = entrada.nextInt();
                operador = "-";
                System.out.print("Ingrese el segundo digito: ");
                y = entrada.nextInt();
                restaTotal = newCalcu.resta(x, y);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(x + " " + operador + " " + y + " " + "=" + " " + restaTotal);
                break;
            }

            case "*": {
                System.out.print("Ingrese el primer digito: ");
                x = entrada.nextInt();
                operador = "*";
                System.out.print("Ingrese el segundo digito: ");
                y = entrada.nextInt();
                multiplTotal = newCalcu.multiplicacion(x, y);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(x + " " + operador + " " + y + " " + "=" + " " + multiplTotal);
                break;
            }

            case "/": {
                System.out.print("Ingrese el primer digito: ");
                x = entrada.nextInt();
                operador = "/";
                System.out.print("Ingrese el segundo digito: ");
                y = entrada.nextInt();
                divisionTotal = newCalcu.division(x, y);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(x + " " + operador + " " + y + " " + "=" + " " + divisionTotal);
                break;
            }

            case "a": {
                String listaNumeros = "";
                // Mostrar lista de numeros
                System.out.println("El resultado del promedio es: " + promedio(sumatoria, nElementos));
            }

            case "b": {

                nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos que desea calcular:"));

                int[] elementos = new int[nElementos];
                for (int i = 0; i < nElementos; i++) {
                    System.out.print((i + 1) + ". Ingrese un digito: ");
                    elementos[i] = entrada.nextInt();
                }
                //Mostrar lista datos
                int resultado = promedio(elementos);
                System.out.println("\n" + "El resultado del promedio es: " + resultado);
            }

            case "c": {
                // Main Factorial 
                int n;
                System.out.print("Ingrese el número: ");
                n = entrada.nextInt();

                int resultadoFactorial = factorial(n);
                System.out.println("El resultado de " + n + "! es: " + resultadoFactorial);
            }

            case "d": {
                int datos = 0;
                System.out.println("Digite el tamaño de su conjunto de datos: ");
                int n = entrada.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("Ingrese el dato " + (i + 1) + ": ");
                    datos = entrada.nextInt();
                }
                int resultadoMax = valorMax(datos, n);
                System.out.println("El número mayor de su conjunto de datos es: " + resultadoMax);
            }
            case "e": {
                int nDatos = 0;
                int[] datos = new int[nDatos];
                int[] resultado;
                System.out.print("Digite la cantidad de números que desea incluir en su conjunto de datos: ");
                nDatos = entrada.nextInt();
                for (int i = 0; i < nDatos; i++) {
                    System.out.println((i + 1) + ". Ingrese un digito: ");
                    datos[i] = entrada.nextInt();
                }
                System.out.println("\n" + "El resultado de su conjunto de datos reordenado es: ");
                resultado = reordenarAleatorio(datos);

                //Mostrar resultado lista aleatoria 
                System.out.print("{");
                for (int j = 0; j < resultado.length; j++) {
                    System.out.print(resultado[j] + ",");
                }
                System.out.print("}");
            }
        }
    }

}
