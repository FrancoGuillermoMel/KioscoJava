
package kiosco_3;

import java.util.Scanner;

public class Cliente extends Usuario {

    private Stock stock;

    public Cliente(String nombre, Stock stock) {
        super(nombre);
        this.stock = stock;
    }

    public void mostrarProductosDisponibles() {
        stock.mostrarStockConPrecio();
    }

    public void comprar() {
        Scanner entrada = new Scanner(System.in);
        stock.mostrarStockConPrecio();
        System.out.print("Ingrese el nombre del producto que desea comprar: ");
        String nombreProducto = entrada.nextLine();
        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = entrada.nextInt();

        System.out.print("Seleccione el método de pago (1: Efectivo, 2: Tarjeta): ");
        int metodoPago = entrada.nextInt();

        switch (metodoPago) {
            case 1:
                pagarConEfectivo(nombreProducto, cantidad);
                break;
            case 2:
                pagarConTarjeta(nombreProducto, cantidad);
                break;
            default:
                System.out.println("Opción de pago no válida.");
                break;
        }
    }

    private void pagarConEfectivo(String nombreProducto, int cantidad) {
        double precioTotal = stock.calcularPrecioTotal(nombreProducto, cantidad);
        System.out.println("El precio total a pagar es: $" + precioTotal);
        System.out.print("Ingrese la cantidad pagada en efectivo: ");
        Scanner scanner = new Scanner(System.in);
        double cantidadPagada = scanner.nextDouble();

        if (cantidadPagada >= precioTotal) {
            double vuelto = cantidadPagada - precioTotal;
            System.out.println("Gracias por su compra. Su vuelto es de: $" + vuelto);
        } else {
            System.out.println("La cantidad pagada no es suficiente.");
        }
    }

    private void pagarConTarjeta(String nombreProducto, int cantidad) {
        double precioTotal = stock.calcularPrecioTotal(nombreProducto, cantidad);
        double precioFinalConComision = precioTotal * 1.1; // Añadir un 10% de comisión
        System.out.println("El precio total a pagar con tarjeta es: $" + precioFinalConComision);
        System.out.println("Gracias por su compra.");
    }
}