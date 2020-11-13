 package Proyecto1;

import java.util.Scanner;

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
    public static int promedio() {
        Scanner entrada = new Scanner(System.in);

        int n;
        int sumatoria = 0;
        System.out.print("Favor digite la cantidad de números que desea promediar: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite el número " + i + ": ");
            int numeros = entrada.nextInt();
            sumatoria = sumatoria + numeros;
        }

        int resultado = sumatoria / n;
        return resultado;
    }

    //Metodo calculo promedio con arreglos
    public static int promedios(int[] elementos) {
        int resultado = 0;
        int suma = 0;

        for (int i : elementos) {
            suma += i;
        }

        resultado = suma / elementos.length;
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

        for (int i = 0; i < nDigitos; i++) {
            if (i > digitos) {
                i = digitos;
            }
            resultado = digitos;
        }
        return resultado;
    }

    //Método para hayar el valor Max de un arreglo
    public static int hayarMax(int[] nDatos) {
        int posicionMax = nDatos[0];

        for (int i = 0; i < nDatos.length; i++) {
            if (nDatos[i] > posicionMax) {
                posicionMax = nDatos[i];
            }
        }

        return posicionMax;
    }

    //Invertir lista de un arreglo
    public static int[] invertirLista(int[] nums, int i) {
        int[] resultado = new int[nums.length];

        int ultimoValor = (i - 1);
        System.out.print("{");
        while (ultimoValor >= 0) {

            System.out.print(nums[ultimoValor] + ",");

            ultimoValor--;
        }
        System.out.print("}");

        return resultado;
    }

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

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1.  a = suma");
        System.out.println("2.  b = resta");
        System.out.println("3.  c = multiplicación");
        System.out.println("4.  d = división");
        System.out.println("5.  e = calculo promedio (SIN arreglos)");
        System.out.println("6.  f = calculo promedio (con arreglos)");
        System.out.println("7.  g = n! calculo de un factorial");
        System.out.println("8.  h = hayar del valor máximo (SIN arreglos)");
        System.out.println("9.  i = hayar el valor máximo  (con arreglos)");
        System.out.println("10. j = invertir lista de números (arreglo)");
        System.out.println("11. k = reordenar lista de forma aleatoria");

        String operacion = "";
        operacion = entrada.next();

        switch (operacion) {
            case "a": {
                System.out.print("Ingrese el primer digito: ");
                int x = entrada.nextInt();
                String operador = "+";
                System.out.print("Ingrese el segundo digito: ");
                int y = entrada.nextInt();
                int sumaTotal = newCalcu.suma(x, y);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(x + " " + operador + " " + y + " " + "=" + " " + sumaTotal);
                break;
            }

            case "b": {
                System.out.print("Ingrese el primer digito: ");
                int x = entrada.nextInt();
                String operador = "-";
                System.out.print("Ingrese el segundo digito: ");
                int y = entrada.nextInt();
                int restaTotal = newCalcu.resta(x, y);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(x + " " + operador + " " + y + " " + "=" + " " + restaTotal);
                break;
            }

            case "c": {
                System.out.print("Ingrese el primer digito: ");
                int x = entrada.nextInt();
                String operador = "*";
                System.out.print("Ingrese el segundo digito: ");
                int y = entrada.nextInt();
                int multiplTotal = newCalcu.multiplicacion(x, y);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(x + " " + operador + " " + y + " " + "=" + " " + multiplTotal);
                break;
            }

            case "d": {
                System.out.print("Ingrese el primer digito: ");
                int x = entrada.nextInt();
                String operador = "/";
                System.out.print("Ingrese el segundo digito: ");
                int y = entrada.nextInt();
                int divisionTotal = newCalcu.division(x, y);
                System.out.println("\n" + "El resultado de su operación es: ");
                System.out.println(x + " " + operador + " " + y + " " + "=" + " " + divisionTotal);
                break;
            }

            case "e": {
                int resultado = newCalcu.promedio();
                System.out.println("\n" + "El promedio es: " + resultado);
                break;
            }

            case "f": {
                int nElementos;
                System.out.print("Digite la cantidad de elementos que desea calcular: ");
                nElementos = entrada.nextInt();

                int[] elementos = new int[nElementos];
                for (int i = 0; i < nElementos; i++) {
                    System.out.print("Digite el número " + (i + 1) + ": ");
                    elementos[i] = entrada.nextInt();
                }
                System.out.println("\n" + "El resultado del promedio es: " + promedios(elementos));
                break;
            }

            case "g": {
                int n;
                System.out.print("Ingrese el número: ");
                n = entrada.nextInt();

                int resultadoFactorial = factorial(n);
                System.out.println("El resultado de " + n + "! es: " + resultadoFactorial);
                break;
            }

            case "h": {
                int datos = 0;
                System.out.print("Digite el tamaño de su conjunto de datos: ");
                int n = entrada.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("Ingrese el dato " + (i + 1) + ": ");
                    datos = entrada.nextInt();
                }
                int resultadoMax = valorMax(datos, n);
                System.out.println("\n" + "El número mayor de su conjunto de datos es: " + resultadoMax);
                break;
            }

            case "i": {
                int n;
                System.out.print("Digite el tamaño de su arreglo: ");
                n = entrada.nextInt();

                int[] arreglo = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Ingrese el número " + (i + 1) + ": ");
                    arreglo[i] = entrada.nextInt();
                }

                int resultMax = hayarMax(arreglo);
                System.out.println("\n" + "El número mayor de su arreglo es: " + resultMax);
                break;
            }

            case "j": {
                int n;
                System.out.print("Ingrese el tamaño de su arreglo: ");
                n = entrada.nextInt();

                int[] listaArreglo = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Ingrese el número " + (i + 1) + ": ");
                    listaArreglo[i] = entrada.nextInt();
                }

                System.out.println("\n" + "Arreglo original:");
                System.out.print("{");
                for (int j = 0; j < n; j++) {
                    System.out.print(listaArreglo[j] + ",");
                }
                System.out.print("}");

                System.out.println();
                System.out.println("\n" + "Arreglo invertido:");
                System.out.println(invertirLista(listaArreglo, n));
                break;
            }

            case "k": {
                int nDatos = 0;
                int[] resultado;
                System.out.print("Digite la cantidad de números de su conjunto de datos: ");
                nDatos = entrada.nextInt();

                int[] datos = new int[nDatos];
                for (int i = 0; i < nDatos; i++) {
                    System.out.print("Ingrese el número " + (i + 1) + ": ");
                    datos[i] = entrada.nextInt();
                }
                System.out.println("\n" + "El resultado reordenado aleatoriamente es: ");
                resultado = reordenarAleatorio(datos);

                //Mostrar resultado lista aleatoria 
                System.out.print("{");
                for (int j = 0; j < resultado.length; j++) {
                    System.out.print(resultado[j] + ",");
                }
                System.out.print("}" + "\n");
                break;
            }
        }
    }
}
