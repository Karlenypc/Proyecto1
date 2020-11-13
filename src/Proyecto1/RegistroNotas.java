package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class RegistroNotas {

    static int vGlobalMax = 1000;
    static int nRegistro = 0;

    static int[] nCarnet = new int[vGlobalMax];
    static int[] notas = new int[vGlobalMax];

    // Metodo para ingresar los datos
    public static void agregarNotas(int carnet, int nota) {

        nCarnet[nRegistro] = carnet;
        notas[nRegistro] = nota;

        nRegistro++;
    }

    //Metodo para eliminar último registro 
    public static void eliminarNota() {

        nRegistro--;

        nCarnet[nRegistro] = 0;
        notas[nRegistro] = 0;
    }

    //Metodo para mostrar los datos 
    public static int[] mostrarNotas() {
        
        int[] resultado = new int[vGlobalMax];
        
        for (int i = 0; i < resultado.length; i++) {
            if (nCarnet[i] != 0 && notas[i] != 0) {
                System.out.println("Carné: " + nCarnet[i] + " Nota: " + notas[i]);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        RegistroNotas llamada = new RegistroNotas();

        for (int i = 0; i < nCarnet.length; i++) {
            nCarnet[i] = 0;
        }

        for (int i = 0; i < notas.length; i++) {
            notas[i] = 0;
        }

        int optMenu = 0;
        System.out.println("Bienvenido por favor seleccione la opción que desea realizar: ");

        do {
            System.out.println();
            System.out.println("1) Agregar nota. ");
            System.out.println("2) Eliminar nota. ");
            System.out.println("3) Mostrar notas registradas. ");
            System.out.println("4) Salir del bucle. ");

            optMenu = entrada.nextInt();

            switch (optMenu) {

                case 1: {
                    int carnet = 0;
                    int nota = 0;
                    if (nRegistro < vGlobalMax) {
                        System.out.print("Ingrese el carné: ");
                        carnet = entrada.nextInt();
                        System.out.print("Ingrese la nota: ");
                        nota = entrada.nextInt();
                        llamada.agregarNotas(carnet, nota);
                    } else {
                        System.out.println("No es posible agregar una nueva nota, ya que se ha excedido el máximo permitido.");
                        System.out.println("Por favor, proceda a eliminar una nota para poder ejecutar esta función nuevamente.");
                    }
                    break;
                }

                case 2: {

                    llamada.eliminarNota();
                    System.out.println("La nota anterior ha sido eliminada con exito!");
                    break;
                }

                case 3: {

                    if (nCarnet[0] == 0 && notas[0] == 0) {
                        System.out.println("No existen registros en el sistema.");

                    } else {
                        System.out.println("Total notas registradas: ");
                        llamada.mostrarNotas();
                    }
                    break;
                }
            }
        } while (optMenu < 4);
    }
}
