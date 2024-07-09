import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        boolean seguir = true;
        int valor1;
        int valor2;
        int valor3;
        do {
            System.out.println(
                    "Digite una opcion:\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Ejercicio 5\n6. Ejercicio 6\n7. Ejercicio 7\n8. Ejercicio 8\n9. Ejercicio 9\n10. Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite el primer valor");
                    valor1 = scan.nextInt();
                    if (valor1 < 8) {
                        System.out.println("El numero es menor a 8");
                    } else {
                        System.out.println("Digite el segundo  valor");
                        valor2 = scan.nextInt();
                        if (valor2 >= 7) {
                            System.out.println("No es necesario leer otro valor");
                        } else {
                            System.out.println("Digite el tercero  valor");
                            valor3 = scan.nextInt();
                            if (valor3 <= 3) {
                                System.out.println("No hay más intentos, perdió");
                            } else {
                                System.out.println("Felicidades, ha superado la prueba");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite el primer valor");
                    valor1 = scan.nextInt();

                    do {
                        System.out.println("Digite el segundo  valor");
                        valor2 = scan.nextInt();
                    } while (valor2 >= valor1);

                    /*
                     * System.out.println("Digite el segundo  valor");
                     * valor2 = scan.nextInt();
                     * while (valor2 >= valor1) {
                     * System.out.println("Digite el segundo  valor");
                     * valor2 = scan.nextInt();
                     * }
                     */
                    for (int i = valor1; i >= valor2; i--) {
                        System.out.println(
                                "El resultado de la multiplicacion de " + i + " por 3, es igual a: " + (i * 3));
                    }
                    System.out.println("Finalizo el proceso de multiplicaciones");
                    break;
                case 3:
                    String mes;
                    System.out.println("Digite un mes");
                    mes = scan.next();
                    switch (mes) {
                        case "Enero":
                            System.out.println("Primer mes");
                            break;
                        case "Febrero":
                            System.out.println("Mes del amor");
                            break;
                        case "Marzo":
                            System.out.println("Mes 3");
                            break;
                        case "Abril":
                            System.out.println("Cuarto mes");
                            break;
                        case "Mayo":
                            System.out.println("Mes de abejones");
                            break;
                        case "Junio":
                            System.out.println("El mejor mes");
                            break;
                        case "Julio":
                            System.out.println("Mes despues del mejor mes");
                            break;
                        case "Agosto":
                            System.out.println("Mes de la madre");
                            break;
                        case "Setiembre":
                            System.out.println("Indepencia mes");
                            break;
                        case "Octubre":
                            System.out.println("Mes del susto");
                            break;
                        case "Noviembre":
                            System.out.println("Casi que acaba el año");
                            break;
                        case "Diciembre":
                            System.out.println("Ya no me dan regalos");
                            break;
                        default:
                            System.out.println("No existe ese mes");
                            break;
                    }
                    break;
                case 4:
                    int mayor;
                    int menor;
                    System.out.println("Digite el primer valor");
                    valor2 = scan.nextInt();
                    System.out.println("Digite un segundo valor");
                    valor3 = scan.nextInt();
                    if (valor2 > valor3) {
                        mayor = valor2;
                        menor = valor3;
                    } else {
                        mayor = valor3;
                        menor = valor2;
                    }

                    for (int i = menor; i <= mayor; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 5:
                    int edad;
                    String nombreCompleto;
                    Date fechaNacimiento;
                    System.out.println("Digite la edad");
                    edad = scan.nextInt();
                    System.out.println("El nombre completo");
                    nombreCompleto = scan.next();
                    System.out.println("Indique su fecha de nacimiento");
                    fechaNacimiento = new Date();
                    System.out.println(edad + "\n" + nombreCompleto + "\n" + fechaNacimiento);
                    break;
                case 6:
                    int figura = 0;
                    int medida1;
                    int medida2;
                    int altura;
                    System.out.println("1. Romboide, 2. Trapecio, 3. Rombo ");
                    figura = scan.nextInt();
                    switch (figura) {
                        case 1:
                            System.out.println("Digite la base del romboide");
                            medida1 = scan.nextInt();
                            System.out.println("Digite la altura");
                            altura = scan.nextInt();
                            System.out.println("El area del Romboide es: " + (medida1 * altura));
                            break;
                        case 2:
                            System.out.println("Digite la base mayor del trapecio");
                            medida1 = scan.nextInt();
                            System.out.println("Digite la base menor del trapecio");
                            medida2 = scan.nextInt();
                            System.out.println("Digite la altura del trapecio");
                            altura = scan.nextInt();
                            System.out.println("El area del Trapecio es: " + ((medida1 + medida2) / 2) * altura);
                            break;
                        case 3:
                            System.out.println("Digite la diagonal mayor del trapecio");
                            medida1 = scan.nextInt();
                            System.out.println("Digite la diagonal menor del trapecio");
                            medida2 = scan.nextInt();
                            System.out.println("El area del Rombo es: " + ((medida1 * medida2) / 2));

                            break;
                        default:
                        System.out.println("Figura no encontrada");
                            break;
                    }
                    break;
                case 10:
                    System.out.println("Saliendo del sistema.... tu tu tu");

                    seguir = false;
                    break;
                default:

                    break;
            }
        } while (seguir);

        scan.close();
    }
}
