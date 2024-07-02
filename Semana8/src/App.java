import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;
        int resultado;
        int edad;
        int peso;

        int opcion = 0;
        do {
            System.out.println(
                    "Digite\n1. Ejercicio 1\n2. Ejercicio 2 \n3. Ejercicio 3 \n4. Ejercicio 4 \n5. Ejercicio 5\n6. Ejercicio 6\n7. Ejercicio 7\n8. Ejercicio 8\n9. Ejercicio 9\n10. Ejercicio 10\n11. Ejercicio 11\n12. Salir");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    // Ejercicio 1
                    System.out.println("Digame un  numero:");
                    numero1 = scan.nextInt();
                    System.out.println("Digame otro  numero:");
                    numero2 = scan.nextInt();
                    suma = numero1 + numero2;
                    System.out.println("La suma de los numeros es: " + suma);
                    break;
                case 2:
                    // Ejercicio2
                    System.out.println("Digame un  numero:");
                    numero1 = scan.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultado = numero1 * i;
                        System.out
                                .println("La tabla de multiplicar del numero " + numero1 + " * " + i + " es igual a: "
                                        + resultado);
                    }
                    break;
                case 3:
                    System.out.println("Digame su edad:");
                    edad = scan.nextInt();
                    System.out.println("Digame su peso:");
                    peso = scan.nextInt();
                    ejercicio3Semana3(edad, peso);
                    break;
                case 4:
                    calcularAreaCirculo();
                    break;
                case 5:
                    System.out.println("Digite un numero para saber si es par o impar");
                    numero2 = scan.nextInt();
                    if (numero2 > 0) {
                        System.out.println("El numero es positivo");
                    } else {
                        if (numero2 < 0) {
                            System.out.println("El numero es negativo");
                        }
                    }
                    break;
                case 6:
                    int contador = 1;
                    int sumatoria = 0;
                    System.out.println("Digite el limite de mi while");
                    int limite = scan.nextInt();
                    while (contador <= limite) {
                        sumatoria = sumatoria + contador;
                        contador++;
                    }
                    System.out.println("La sumatoria es: " + sumatoria);
                    break;
                case 7:
                    System.out.println("Digame un numero:");
                    numero1 = scan.nextInt();
                    System.out.println("Digame otro numero :");
                    numero2 = scan.nextInt();
                    intercambiarValores(numero1, numero2);
                    break;
                case 8:
                    int numero3 = 0;
                    System.out.println("Digame un numero:");
                    numero1 = scan.nextInt();
                    System.out.println("Digame otro numero :");
                    numero2 = scan.nextInt();
                    System.out.println("Digame el tercer numero :");
                    numero3 = scan.nextInt();
                    if (numero1 < 0) {
                        System.out.println("El resultado del producto es " + (numero1 * numero2 * numero3));
                    } else {
                        if (numero1 > 0) {
                            System.out.println("El resultado del producto es " + (numero1 + numero2 + numero3));
                        }
                    }
                    break;
                case 9:
                    calcularCuadrados();
                    break;
                case 10:
                    String palabra;
                    do {
                        System.out.println("Digite una palabra");
                        palabra = scan.next();
                    } while (!palabra.equals("SALIR"));
                    break;
                case 11:
                    eureka();
                    break;
                case 12:

                    System.out.println("Saliendo del sistema.....");
                    break;
                default:
                    System.out.println("La opcion no existe");

                    break;
            }

        } while (opcion != 12);
        scan.close();
    }

    public static void ejercicio3Semana3(int edad, int peso) {
        System.out.println("Su edad es: " + edad);
        System.out.println("Su peso es: " + peso);
    }

    public static void calcularAreaCirculo() {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.1416;
        int radio = 0;
        System.out.println("Digame el radio del circulo");
        radio = scanner.nextInt();

        System.out.println("El area del circulo es " + (radio * radio * pi));
    }

    public static void intercambiarValores(int num1, int num2) {
        int aux;
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("El valor nuevo de numero 1 es: " + num1);
        System.out.println("El valor nuevo de numero 2 es: " + num2);

    }

    public static void calcularCuadrados() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i * i);
        }
    }

    public static void eureka() {
        Scanner sc = new Scanner(System.in);
        String clave;
        int intentos = 0;
        do {
            System.out.println("Digite la contraseña");
            clave = sc.next();
            if (clave.equals("EUREKA")) {
                System.out.println("ADIVINO LA CONTRASEÑA FELICIDADES!!!!");
                break;
            } else {
                intentos = intentos + 1;
            }

        } while (intentos < 3);
        if (intentos == 3) {
            System.out.println("Agoto los intentos");
        }
    }

}
