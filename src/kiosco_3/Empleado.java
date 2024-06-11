
package kiosco_3;

public class Empleado extends Usuario {

    public Empleado(String nombre) {
        super(nombre);
    }

    public void darVuelto(double pagoCliente, double precioTotal) {
        double vuelto = pagoCliente - precioTotal;
        if (vuelto > 0) {
            System.out.println("El vuelto a entregar al cliente es: $" + vuelto);
        } else {
            System.out.println("El cliente ha pagado la cantidad exacta, no hay vuelto.");
        }
    }
}