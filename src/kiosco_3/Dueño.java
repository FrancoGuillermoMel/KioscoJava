
package kiosco_3;

import java.util.Scanner;

public class Dueño extends Usuario{
    private Stock stock;

    public Dueño(String nombre, Stock stock) {
        super(nombre);
        this.stock = stock;
    }

    public void menuDueño() {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("----- Menu del Dueño -----");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Modificar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Ver Lista de Productos");
            System.out.println("5. Agregar más cantidad del producto");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    agregarMasCantidadProducto();
                    break;
                case 6:
                    System.out.println("* Saliendo del sistema *");
                    return;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }

    public void agregarProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del nuevo producto: ");
        String nombre = entrada.next();
        System.out.print("Ingrese la cantidad de unidades del nuevo producto: ");
        int cantidad = entrada.nextInt();
        System.out.print("Ingrese el precio del nuevo producto: ");
        double precio = entrada.nextDouble();

        stock.agregarProducto(nombre, cantidad, precio);
        System.out.println("***Producto agregado correctamente***");
    }

    public void modificarProducto() {
        stock.mostrarStockConPrecio();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = entrada.next();
        System.out.print("Ingrese el nuevo precio del producto: ");
        double precio = entrada.nextDouble();
        System.out.print("Ingrese la nueva cantidad de unidades del producto: ");
        int cantidad = entrada.nextInt();

        stock.modificarProducto(nombre, precio, cantidad);
        System.out.println("Producto modificado correctamente.");
    }

    public void eliminarProducto() {
        stock.mostrarStockConPrecio();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = entrada.next();

        stock.eliminarProducto(nombre);
        System.out.println("Producto eliminado correctamente.");
    }

    public void mostrarProductos() {
        stock.mostrarStockConPrecio();
    }

    public void agregarMasCantidadProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto al que desea agregar más cantidad: ");
        String nombre = entrada.next();
        System.out.print("Ingrese la cantidad de unidades a agregar: ");
        int cantidad = entrada.nextInt();

        stock.agregarMasCantidadProducto(nombre, cantidad);
        System.out.println("Se agregó correctamente la cantidad al producto.");
    }
}
