package service;

import java.util.Scanner;

import model.TipoTarifa;
import model.TipoTransporte;
import model.Transporte;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        TipoTarifa  tipoTarifa;
        TipoTransporte tipoTransporte;
        Transporte transporte;

        tipoTarifa = new TipoTarifa();

        System.out.println("Indique el id del tipo Transporte");
        int id = scan.nextInt();
        System.out.println("Indique la descripcion del tipo Transporte");
        String descripcion = scan.next();
        tipoTransporte = new TipoTransporte(id, descripcion);

        System.out.println("Indique el id del tipo tarifa");
        id = scan.nextInt();
        tipoTarifa.setId(id);

        System.out.println("Indique la descripcion del tipo tarifa");
        descripcion = scan.next();
        tipoTarifa.setDescripcion(descripcion);
        
        System.out.println("Indique la placa del transporte");
        String placa = scan.next();
        System.out.println("Indique la capacidad del transporte");
        int capacidad = scan.nextInt();
        System.out.println("Indique la tarifa del transporte");
        int tarifa = scan.nextInt();

        transporte = new Transporte(placa, tarifa, tipoTarifa, tipoTransporte, capacidad);

        System.out.println("El tipo de Tarifa de mi transporte es: " + transporte.getTipoTarifa().getDescripcion());
        System.out.println("El tipo de Transporte de mi transporte es: " + transporte.getTipoTransporte().getDescripcion());
        System.out.println("La placa de mi transporte es: " + transporte.getPlaca());
        System.out.println("La Ganancia total de mi transporte es: " + transporte.calcularGananciaTotal());

    }
}
