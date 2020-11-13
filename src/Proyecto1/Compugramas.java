package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Compugramas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seleccion;

        do {
            System.out.println("Seleccione el compugrama a escoger: ");
            System.out.println("1) Compugrama 1");
            System.out.println("2) Compugrama 2");
            System.out.println("3) Compugrama 3");
            System.out.println("4) Compugrama 4");
            System.out.println("5) Compugrama 5");
            System.out.println("6) Compugrama 6");
            System.out.println("7) SALIR ");

            seleccion = input.nextInt();

            switch (seleccion) {

                case 1: {   //Compugrama 1

                    System.out.print("Ingrese el valor de n: ");
                    int n = input.nextInt();
                    System.out.println("\n" + "Compugrama 1 = ");

                    for (int i = 0; i < n; i++) {
                        System.out.print("-");
                        System.out.print("  ");
                    }

                    System.out.println(">");
                    System.out.println();
                    break;
                }

                case 2: {  //Compugrama 2

                    System.out.print("Ingrese el valor de n: ");
                    int n = input.nextInt();
                    System.out.println("\n" + "Compugrama 2 = ");

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("-");
                            System.out.print("  ");
                        }
                        System.out.print(">");
                        System.out.println();
                    }

                    System.out.println();
                    break;
                }

                case 3: {  //Compugrama 3

                    System.out.print("Ingrese el valor de n; (n = Impar): ");
                    int n = input.nextInt();

                    if (n % 2 != 0) {
                        System.out.println("\n" + "Compugrama 3 = ");

                        //Parte Superior
                        for (int i = 0; i < n; i++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();

                        //Parte Intermedia
                        for (int i = 0; i < (n - 2); i++) {
                            System.out.print("* ");
                            for (int j = 0; j < (n - 2); j++) {
                                System.out.print("  ");
                            }
                            System.out.println("*");
                        }

                        //Parte Inferior
                        for (int i = 0; i < n; i++) {
                            System.out.print("*" + " ");
                        }

                        System.out.println();

                    } else {
                        System.out.println("n debe ser un número impar, por favor vuelva a seleccionar una opcion.");
                        System.out.println();
                    }
                    break;
                }

                case 4: {  //Compugrama 4 

                    System.out.print("Ingrese el valor de n; (n = Impar): ");
                    int n = input.nextInt();

                    if (n % 2 != 0) {
                        System.out.println("\n" + "Compugrama 4 = ");

                        //Parte Superior
                        for (int i = 0; i < n; i++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();

                        //Parte Intermedia
                        for (int i = 0; i < (n - 2); i++) {
                            System.out.print("* ");
                            for (int j = 0; j < (n - 2); j++) {
                                if (i == j) {
                                    System.out.print("*");

                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println(" *");
                        }

                        //Parte Inferior
                        for (int i = 0; i < n; i++) {
                            System.out.print("*" + " ");
                        }

                        System.out.println();

                    } else {
                        System.out.println("n debe ser un número impar, por favor vuelva a seleccionar.");
                        System.out.println();
                    }
                    break;
                }

                case 5: {  //Compugrama 5

                    System.out.print("Ingrese el valor de n; (n = Impar): ");
                    int n = input.nextInt();

                    if (n % 2 != 0) {
                        System.out.println("\n" + "Compugrama 5 = ");

                        //Parte Superior
                        for (int i = 0; i < n; i++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();

                        //Parte Intermedia
                        for (int i = 0; i < (n - 2); i++) {

                            System.out.print("* ");

                            for (int j = 0; j < (n - 2); j++) {
                                if ((i + j) == (n - 3)) {
                                    System.out.print("* ");

                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println("*");
                        }

                        //Parte Inferior
                        for (int i = 0; i < n; i++) {
                            System.out.print("*" + " ");
                        }

                        System.out.println();

                    } else {
                        System.out.println("n debe ser un número impar, por favor vuelva a seleccionar.");
                        System.out.println();
                    }
                    break;
                }

                case 6: { // Compugrama 6

                    System.out.print("Ingrese el valor de n; (n = Impar): ");
                    int n = input.nextInt();

                    if (n % 2 != 0) {
                        System.out.println("\n" + "Compugrama 6 = ");

                        //Parte Superior
                        for (int i = 0; i < n; i++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();

                        //Parte Intermedia
                        for (int i = 0; i < (n - 2); i++) {

                            System.out.print("* ");

                            for (int j = 0; j < (n - 2); j++) {
                                if ((i + j) == (n - 3)) {
                                    System.out.print("* ");

                                } else if (i == j) {
                                    System.out.print("* ");

                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println("*");
                        }

                        //Parte Inferior
                        for (int i = 0; i < n; i++) {
                            System.out.print("*" + " ");
                        }

                        System.out.println();

                    } else {
                        System.out.println("n debe ser un número impar, por favor vuelva a seleccionar.");
                        System.out.println();
                    }
                    break;
                }
                default: {
                    System.out.println("El ciclo ha finalizado.");
                }

            }
        } while (seleccion < 7);

    }

}
