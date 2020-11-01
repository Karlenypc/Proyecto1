package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class CalculoAreas {
    
    //Metodo para calcular el area de un Cuadrado
    public static int areaCuadrado(int lado) {
        int resultado = 0;
        resultado = lado * lado;
        return resultado;
    }
    
    //Metodo para calcular el area de un Rectangulo
    public static int areaRectangulo(int lado, int ancho) {
        int resultado = 0;
        resultado = lado * ancho;
        return resultado;
    }
    
    //Metodo para calcular el area de un Circulo
    public static double areaCirculo(double radio) {
        double resultado = 0;
        double valorPI = Math.PI;
        resultado = valorPI * (Math.pow(radio, 2));
        return resultado;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        CalculoAreas llamada = new CalculoAreas();

        int lado;
        int ancho;
        double radio;
        int seleccion = 0;
        int resultCuadrado = 0;
        int resultRectangulo = 0;
        double resultCirculo = 0;

        do {
            System.out.println("Seleccione: ");
            System.out.println("           1 = AREA del CUADRADO");
            System.out.println("           2 = AREA del RECTANGULO");
            System.out.println("           3 = AREA del CIRCULO");
            System.out.println("           4 = SALIR del ciclo");

            seleccion = lector.nextInt();

            switch (seleccion) {
                case 1: {
                    System.out.print("Ingrese el lado:");
                    lado = lector.nextInt();
                    resultCuadrado = llamada.areaCuadrado(lado);
                    System.out.println("\n" + "El area del cuadrado es: " + resultCuadrado + "\n");
                    break;
                }

                case 2: {
                    System.out.print("Ingrese el lado:");
                    lado = lector.nextInt();
                    System.out.print("Ingrese el ancho:");
                    ancho = lector.nextInt();
                    resultRectangulo = llamada.areaRectangulo(lado, ancho);
                    System.out.println("\n" + "El area del rectángulo es: " + resultRectangulo + "\n");
                    break;
                }

                case 3: {
                    System.out.print("Ingrese el radio:");
                    radio = lector.nextDouble();
                    resultCirculo = llamada.areaCirculo(radio);
                    System.out.println("\n" + "El area del circulo es: " + resultCirculo + "\n");
                    break;
                }

                default: {
                    System.out.println("Su ciclo ha finalizo");
                    break;
                }

            }

        } while (seleccion < 4);

    }

}
