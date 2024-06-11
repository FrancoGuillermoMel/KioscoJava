
package kiosco_3;
import java.util.ArrayList;

public class Stock {
    private ArrayList<Producto> stock;

    public Stock() {
        this.stock = new ArrayList<>();
        inicializarProductosPredeterminados();
    }

    private void inicializarProductosPredeterminados() {
        stock.add(new Producto("Galletitas", 10, 30));
        stock.add(new Producto("Coca-Cola", 10, 50));
        stock.add(new Producto("Alfajor", 10, 15));
        stock.add(new Producto("Cafe", 10, 25));
        stock.add(new Producto("Pan", 10, 65));
        stock.add(new Producto("Leche", 10, 200));
        stock.add(new Producto("Dulce de leche", 10, 260));
        stock.add(new Producto("Jamon", 10, 250));
        stock.add(new Producto("Queso", 10, 250));
    }

    public void agregarProducto(String nombreProducto, int cantidad, double precio) {
        stock.add(new Producto(nombreProducto, cantidad, precio));
    }

    public void modificarProducto(String nombreProducto, double precio, int cantidad) {
        for (Producto producto : stock) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                producto.setPrecio(precio);
                producto.setCantidad(cantidad);
                break;
            }
        }
    }

    public void eliminarProducto(String nombreProducto) {
        for (Producto producto : stock) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                stock.remove(producto);
                break;
            }
        }
    }

    public void mostrarStock() {
        for (Producto producto : stock) {
            System.out.println(producto);
        }
    }

    public void mostrarStockConPrecio() {
        for (Producto producto : stock) {
            System.out.println(producto.toStringConPrecio());
        }
    }

    public void agregarMasCantidadProducto(String nombreProducto, int cantidad) {
        for (Producto producto : stock) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                int cantidadActual = producto.getCantidad();
                producto.setCantidad(cantidadActual + cantidad);
                break;
            }
        }
    }

    public ArrayList<Producto> getStock() {
        return stock;
    }

    public boolean reducirStock(String nombreProducto, int cantidad) {
        for (Producto producto : stock) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                if (producto.getCantidad() >= cantidad) {
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public double calcularPrecioTotal(String nombreProducto, int cantidad) {
        for (Producto producto : stock) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                return producto.getPrecio() * cantidad;
            }
        }
        return 0;
    }
}
