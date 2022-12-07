package Modelo;

import static java.lang.Math.floor;

public class Pedido {
    private String codigo;
    private Cliente cliente;
    private Producto producto;
    private int cantidad;

    public Pedido() {};
    public Pedido(String codigo, Cliente cliente, Producto producto, int cantidad) {
        this.codigo = null;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;

    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public double pecioTotal() {
        double total;
        total = this.producto.getPrecioVenta() * this.cantidad + gastosEnvio();
        if (this.getCliente() instanceof Premium) {
            total -= total * 0.2;
        }

        floor(total);
        return total;

    }

    public double gastosEnvio() {
        return this.producto.getGastosEnvio() * this.cantidad;
    }

    @Override
    public String toString() {
        return "Nº PEDIDO: " + this.codigo + "\n" +
                "CLIENTE " + this.cliente.getNombre() + "      NIF: " + this.cliente.getNif() + "\n" +
                "_______________________________________________________________________________________________"  + "\n" +
                "REF.: " + this.producto.getCodigo() +
                "   |   DESCRIPCION: " + this.producto.getNombre()  +"   |   CANTIDAD: " + this.cantidad +
                "   |   COSTE: " + producto.getPrecioVenta() +"€" + "\n" +
                "_______________________________________________________________________________________________"  + "\n" +
                "COSTE ENVIO: " + producto.getGastosEnvio() +"€" + "\n" +
                "PRECIO TOTAL: " + pecioTotal();
    }
}