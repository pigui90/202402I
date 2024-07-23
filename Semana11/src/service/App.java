package service;

import java.util.Date;
import java.util.Scanner;

import model.Carrito;
import model.CarritoDetalle;
import model.Cliente;
import model.Producto;
import model.TipoCliente;
import model.TipoProducto;
import modelQuiz.ClienteBanco;
import modelQuiz.Cuenta;
import modelQuiz.MovimientoCuenta;
import modelQuiz.TipoCuenta;
import modelQuiz.TipoMoneda;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        String menu = "1. Ejercicio del quiz\nEstas opciones son de la tarea\n2. Agregar Tipo Cliente\n3. Agregar Cliente\n4. Agregar Tipo Producto\n5. Agregar Producto\n6. Agregar Carrito\n7. Agregar CarritoDetalle\n8. Salir";
        String descripcion;
        int id;
        boolean activo;
        String identificacion;
        String nombre;
        int edad;
        int numeroCuenta;
        double monto;
        boolean tieneTarjeta;
        boolean positivo;
        TipoCliente tipoCliente = new TipoCliente();
        TipoProducto tipoProducto = new TipoProducto();
        Cliente cliente = new Cliente();
        Producto producto = new Producto();
        Carrito carrito = new Carrito();
        CarritoDetalle carritoDetalle = new CarritoDetalle();

        do {
            System.out.println(menu);
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    TipoCuenta tipoCuenta = new TipoCuenta();
                    TipoMoneda tipoMoneda = new TipoMoneda();
                    ClienteBanco clienteBanco = new ClienteBanco();
                    Cuenta cuenta = new Cuenta();
                    MovimientoCuenta movimientoCuenta = new MovimientoCuenta();

                    // pedir datos para tipoCuenta
                    System.out.println("Digame la descripcion de el tipo de cuenta");
                    descripcion = scan.next();
                    System.out.println("digame el identificador del tipo de cuenta");
                    id = scan.nextInt();
                    System.out.println("Digame si esta activo o no (true = si , false = no)");
                    activo = scan.nextBoolean();
                    tipoCuenta.setActivo(activo);
                    tipoCuenta.setDescripcion(descripcion);
                    tipoCuenta.setIdentificador(id);

                    // pedir datos para TipoMoneda
                    System.out.println("Digame el tipo de moneda");
                    descripcion = scan.next();
                    System.out.println("digame el identificador del tipo de moneda");
                    id = scan.nextInt();
                    System.out.println("Digame si esta activo o no (true = si , false = no)");
                    activo = scan.nextBoolean();
                    tipoMoneda.setActivo(activo);
                    tipoMoneda.setDescripcion(descripcion);
                    tipoMoneda.setIdentificador(id);

                    // pedir datos de Cliente banco
                    System.out.println("Digame su identificacion de Cliente");
                    identificacion = scan.next();
                    System.out.println("Digame su nombre");
                    nombre = scan.next();
                    System.out.println("Digame su edad");
                    edad = scan.nextInt();
                    clienteBanco.setEdad(edad);
                    clienteBanco.setFechaIngreso(new Date());
                    clienteBanco.setIdentificacion(identificacion);
                    clienteBanco.setNombre(nombre);

                    // Pedir los datos de cuenta
                    System.out.println("Digame el numero de cuenta");
                    numeroCuenta = scan.nextInt();
                    System.out.println("Digame el monto inicial de su cuenta");
                    monto = scan.nextDouble();
                    System.out.println("Digame si tiene tarjeta o no (true = si , false = no)");
                    tieneTarjeta = scan.nextBoolean();
                    cuenta.setCliente(clienteBanco);
                    cuenta.setMontoTotal(monto);
                    cuenta.setNumeroCuenta(numeroCuenta);
                    cuenta.setTieneTarjeta(tieneTarjeta);
                    cuenta.setTipoCuenta(tipoCuenta);
                    cuenta.setTipoMoneda(tipoMoneda);

                    // Pedir los datos de MovimientoCuenta
                    System.out.println("Digame el monto del movimiento");
                    monto = scan.nextDouble();
                    System.out.println("Digame si el movimiento es positivo o no (true = si , false = no)");
                    positivo = scan.nextBoolean();
                    movimientoCuenta.setCuenta(cuenta);
                    movimientoCuenta.setMonto(monto);
                    movimientoCuenta.setPositivo(positivo);
                    break;
                case 2:
                    System.out.println("Digame el id de tipo Cliente ");
                    tipoCliente.setId(scan.nextInt());
                    System.out.println("Digame el codigo de Tipo Cliente");
                    tipoCliente.setCodigo(scan.next());
                    System.out.println("Digame la descripcion del tipo cliente");
                    tipoCliente.setDescripcion(scan.next());
                    break;
                case 3:
                    System.out.println("digame el id del cliente");
                    cliente.setId(scan.nextInt());
                    System.out.println("Digame el nombre");
                    nombre = scan.next();
                    cliente.setNombre(nombre);
                    System.out.println("Digame el codigo del cliente");
                    cliente.setCodigo(scan.next());
                    System.out.println("Digame su identificacion");
                    cliente.setIdentificacion(scan.nextInt());
                    System.out.println("Digame su lugar de residencia");
                    cliente.setLugarResidencia(scan.next());
                    cliente.setTipoCliente(tipoCliente);
                    break;
                case 4:
                    System.out.println("Digame el id de tipo Producto ");
                    tipoProducto.setId(scan.nextInt());
                    System.out.println("Digame el codigo de Tipo producto");
                    tipoProducto.setCodigo(scan.next());
                    System.out.println("Digame la descripcion del tipo producto");
                    tipoProducto.setDescripcion(scan.next());
                    break;
                case 5:
                    System.out.println("Digame el id del producto");
                    id = scan.nextInt();
                    producto.setId(id);
                    System.out.println("Digame el codigo del producto");
                    producto.setCodigo(scan.next());
                    System.out.println("Digame el nombre del producto");
                    producto.setNombre(scan.next());
                    System.out.println("la cantidad stock del producto");
                    producto.setCantidadStock(scan.nextInt());
                    System.out.println("digame el precio del producto");
                    producto.setPrecio(scan.nextDouble());
                    producto.setTipoProducto(tipoProducto);
                    break;
                case 6:
                    carrito.setFechaCompra(new Date());
                    carrito.setCliente(cliente);
                    break;
                case 7:
                    carritoDetalle.setCarrito(carrito);
                    carritoDetalle.setProducto(producto);
                    break;
                case 8:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    break;
            }

        } while (opcion != 8);
        scan.close();

    }
}
