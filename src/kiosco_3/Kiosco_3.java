package kiosco_3;

import java.util.Scanner;

public class Kiosco_3 {

    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        Stock stock = new Stock();

        while (true) {
            System.out.println("----- Bienvenido al sistema -----");
            System.out.println("1. Ingresar como Admin");
            System.out.println("2. Ingresar como cliente");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese su nombre de usuario: ");
                String nombreDueño = entrada.next();
                System.out.print("Ingrese su contraseña: ");
                String contraseñaDueño = entrada.next();

                if (nombreDueño.equals("Juan") && contraseñaDueño.equals("12345")) {
                    System.out.println("----- Bienvenido, Dueño -----");
                    Dueño dueño = new Dueño(nombreDueño, stock);
                    dueño.menuDueño();
                } else {
                    System.out.println("Nombre de usuario o contraseña incorrectos.");
                }

            } else if (opcion == 2) {
                System.out.print("Ingrese el nombre del cliente: ");
                String nombreCliente = entrada.next();
                Cliente cliente = new Cliente(nombreCliente, stock);

                while (true) {
                    System.out.println("----- Menú Cliente -----");
                    System.out.println("1. Ver productos disponibles");
                    System.out.println("2. Comprar producto");
                    System.out.println("3. Salir");
                    System.out.print("Ingrese una opción: ");
                    int opcionCliente = entrada.nextInt();
                    switch (opcionCliente) {
                        case 1:
                            cliente.mostrarProductosDisponibles();
                            break;
                        case 2:
                            cliente.comprar();
                            break;
                        case 3:
                            System.out.println("***Vuelve al menu***");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    if (opcionCliente == 3) {
                        break;
                    }
                }
            } else if (opcion == 3) {
                System.out.println("* Salió del sistema *");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
}
