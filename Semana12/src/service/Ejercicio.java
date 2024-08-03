package service;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = "1. Ejercicio 1\n2. Ejercicio 2\n3.Ejercicio 3\n4. Ejercicio 4\n5. Salir";
        int opcion = 0;

        do {

            System.out.println(menu + "\nDigite una opcion:");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    int[] numerosA = new int[4];
                    int numerosB[] = new int[4];
                    int suma[] = new int[4];

                    for (int i = 0; i < numerosA.length; i++) {
                        System.out.println("Digame el valor de la posicion " + i + " del Vector A:");
                        numerosA[i] = scan.nextInt();
                        System.out.println("Digame el valor de la posicion " + i + " del Vector B:");
                        numerosB[i] = scan.nextInt();
                        suma[i] = numerosA[i] + numerosB[i];
                        System.out.println("El valor de la suma de la posicion " + i + " es: " + suma[i]);
                    }

                    break;
                case 2:

                    String cardenales[] = new String[4];
                    cardenales[0] = "Norte";
                    cardenales[1] = "Este";
                    cardenales[2] = "Sur";
                    cardenales[3] = "Oeste";
                    for (int i = 0; i < cardenales.length; i++) {
                        System.out.println("La posicion " + i + " es: " + cardenales[i]);
                    }
                    System.out.println("-----------------------------------------");
                    // Imprimir a la inversa
                    for (int i = cardenales.length - 1; i >= 0; i--) {
                        System.out.println("La posicion " + i + " es: " + cardenales[i]);
                    }
                    break;
                case 3:
                    int[] pesos = new int[5];
                    for (int i = 0; i < pesos.length; i++) {
                        System.out.println("Digame el peso de la posicion " + i);
                        pesos[i] = scan.nextInt();
                    }

                    elementoMayor(pesos);
                    break;
                case 4:
                    int temp;
                    int calificaciones[] = { 50, 62, 1, 20, 36, 98 };
                    System.out.println("Indique el orden ASC o DESC");
                    String orden = scan.next();
                    if (orden.equals("ASC")) {

                        for (int i = 0; i < calificaciones.length; i++) {
                            for (int j = i + 1; j < calificaciones.length; j++) {
                                if (calificaciones[i] > calificaciones[j]) {
                                    temp = calificaciones[j];
                                    calificaciones[j] = calificaciones[i];
                                    calificaciones[i] = temp;
                                }
                            }
                        }
                    } else {
                        for (int i = 0; i < calificaciones.length; i++) {
                            for (int j = i + 1; j < calificaciones.length ; j++) {
                                if (calificaciones[i] < calificaciones[j]) {
                                    temp = calificaciones[j];
                                    calificaciones[j] = calificaciones[i];
                                    calificaciones[i] = temp;
                                }
                            }
                        }
                    }
                    imprimirVectorInt(calificaciones);

                    break;
                case 5:
                    System.out.println("Saliendo!!!!");
                    break;
                default:
                    break;
            }

        } while (opcion != 5);

    }

    public static void elementoMayor(int[] vector) {
        int mayor = 0;
        for (int j = 0; j < vector.length; j++) {
            if (vector[j] > mayor) {
                mayor = vector[j];
            }
        }
        System.out.println("El peso mayor es: " + mayor);

    }

    public static void imprimirVectorInt(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("La posicion " + i + " es: " + vector[i]);
        }
    }
}
