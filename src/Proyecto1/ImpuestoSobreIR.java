package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class ImpuestoSobreIR {

    //Metodo que calcula el porcentaje a pagar de acuerdo al salario
    public static double porcentajeDeAcuerdoSalario(double salario) {
        double resultado = 0;

        if (salario < 200000) {
            resultado = 0;

        } else if (salario >= 200000 && salario < 400000) {
            resultado = 0.1;

        } else if (salario >= 400000 && salario < 600000) {
            resultado = 0.15;

        } else if (salario >= 600000 && salario < 800000) {
            resultado = 0.2;

        } else {
            resultado = 0.3;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int dependientes = 0;
        double salario = 0;
        double gravablePorcentaje = 0;
        double porcentajeSalario = 0;
        double calculoImpuestoIR = 0;

        System.out.print("Ingrese el número de dependientes: ");
        dependientes = lector.nextInt();

        switch (dependientes) {
            case 1: {
                gravablePorcentaje = 1;
                System.out.print("Ingrese su salario: " + "\n");
                salario = lector.nextDouble();
                porcentajeSalario = porcentajeDeAcuerdoSalario(salario);
                calculoImpuestoIR = salario * gravablePorcentaje * porcentajeSalario;
                System.out.println("\n" + "El monto total a pagar del impuesto sobre IR es : " + calculoImpuestoIR);
                break;
            }
            case 2: {
                gravablePorcentaje = 0.9;
                System.out.print("Ingrese su salario: " + "\n");
                salario = lector.nextDouble();
                porcentajeSalario = porcentajeDeAcuerdoSalario(salario);
                calculoImpuestoIR = salario * gravablePorcentaje * porcentajeSalario;
                System.out.println("\n" + "El monto total a pagar del impuesto sobre IR es = " + calculoImpuestoIR);
                break;
            }
            case 3: {
                gravablePorcentaje = 0.7;
                System.out.print("Ingrese su salario: " + "\n");
                salario = lector.nextDouble();
                porcentajeSalario = porcentajeDeAcuerdoSalario(salario);
                calculoImpuestoIR = salario * gravablePorcentaje * porcentajeSalario;
                System.out.println("\n" + "El monto total a pagar del impuesto sobre IR es = " + calculoImpuestoIR);
                break;
            }
            case 4: {
                gravablePorcentaje = 0.6;
                System.out.print("Ingrese su salario: " + "\n");
                salario = lector.nextDouble();
                porcentajeSalario = porcentajeDeAcuerdoSalario(salario);
                calculoImpuestoIR = salario * gravablePorcentaje * porcentajeSalario;
                System.out.println("\n" + "El monto total a pagar del impuesto sobre IR es = " + calculoImpuestoIR);
                break;
            }
            default: {
                gravablePorcentaje = 0.4;
                System.out.print("Ingrese su salario: " + "\n");
                salario = lector.nextDouble();
                porcentajeSalario = porcentajeDeAcuerdoSalario(salario);
                calculoImpuestoIR = salario * gravablePorcentaje * porcentajeSalario;
                System.out.println("\n" + "El monto total a pagar del impuesto sobre IR es = " + calculoImpuestoIR);
                break;
            }
        }

    }

}
