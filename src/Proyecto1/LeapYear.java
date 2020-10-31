package Proyecto1;



import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class LeapYear {

    public static boolean leapyear(int year) {
        boolean result = false;
        boolean cond1 = false, cond2 = false, cond3 = false;
        
        double residue = year % 4;
        if (residue == 0) {
            cond1 = true;
        }
        
        residue = year % 100;
        if (residue == 0) {
            cond2 = true;
        }
        
        residue = year % 400;
        if (residue == 0) {
            cond3 = true;
        }

        if (cond1 && (!cond2 || cond3)) 
            result = true;
        return result;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int year;
        
        System.out.print("Enter the year: ");
        year = reader.nextInt();

        System.out.println(year + " = " + leapyear(year));
    }
}
