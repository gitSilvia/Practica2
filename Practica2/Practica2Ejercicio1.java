package Practica2;

import java.util.Scanner;
/*
 * practica5
 * @author Silvia Chamorro
 * 
 * 
 */
public class Practica2Ejercicio1 {
    static String red = "\033[31m]";
    static String green = "\033[32m]";
    static String reset= "\u001B[0m]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //variable
        float ingreso;
        float irp= 80000000;
        //entrada
        System.out.print(reset + "Digite el ingreso anual: ");
        ingreso =  scanner.nextFloat();
        //condicion
        if (ingreso > irp){
            System.out.print(red + "Debe abonar irp el siguiente año.");
        }  else {
            System.out.print(green + "No abona irp.");
        }
        scanner.close();
        System.out.print(reset);
    }

}
