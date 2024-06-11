package kiosco_3;

public class Venta {

     private Producto producto;
    private int cantidad;
    private double pagoCliente;

    public Venta(Producto producto, int cantidad, double pagoCliente) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.pagoCliente = pagoCliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPagoCliente() {
        return pagoCliente;
    }

    public void setPagoCliente(double pagoCliente) {
        this.pagoCliente = pagoCliente;
    }

    public double calcularPrecioTotal() {
        return producto.getPrecio() * cantidad;
    }

    public double calcularVuelto() {
        return pagoCliente - calcularPrecioTotal();
    }

    @Override
    public String toString() {
        return "Venta{" +
                "producto=" + producto.getNombre() +
                ", cantidad=" + cantidad +
                ", precioTotal=" + calcularPrecioTotal() +
                ", pagoCliente=" + pagoCliente +
                ", vuelto=" + calcularVuelto() +
                '}';
    }
}
