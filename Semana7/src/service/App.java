package service;

import java.util.Scanner;

import model.Estudiante;
import model.Transporte;

public class App {
    public static void main(String[] args) throws Exception {
        int edad = 34;

        Scanner scan = new Scanner(System.in);

        System.out.println("Mi primer proyecto");
        System.out.println("Sergio Campos R");
        System.out.println("Edad: " + edad);

        Transporte transporte = new Transporte();
        System.out.println("La placa del transporte es: " + transporte.getPlaca());
        transporte.setPlaca("102596");
        System.out.println("La placa del transporte es: " + transporte.getPlaca());
        System.err.println("Digite una placa");
        String placa = scan.next();
        transporte.setPlaca(placa);
        System.out.println("La placa del transporte es: " + transporte.getPlaca());

        Estudiante estudiante = new Estudiante();
        System.out.println("Digite la edad");
        estudiante.setEdad(scan.nextInt());
        System.out.println("La edad del estudiante es: " + estudiante.getEdad());
    
    }

}
