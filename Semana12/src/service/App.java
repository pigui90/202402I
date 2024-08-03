package service;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String nombres[] = new String[4];

        nombres[0] = "Sergio";
        nombres[1] = "Gerardo";
        System.out.println("Digame un nombre");
        nombres[2] = scan.next();
        System.out.println("Digame un nombre");
        nombres[3] = scan.next();
        System.out.println("-----------------------------------------");

        // Leer un vector
        for(int i = 0; i < nombres.length; i++){
            System.out.println(i + " " + nombres[i]);
        }
        System.out.println("-----------------------------------------");
        //Guardar el valor de un vector por medio de un for
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Digame un nombre");
            nombres[i] = scan.next();
        }
        System.out.println("******************************");

        // Leer un vector
        for(int i = 0; i < nombres.length; i++){
            System.out.println("El nombre es: " + nombres[i]);
        }



        



    }
}
