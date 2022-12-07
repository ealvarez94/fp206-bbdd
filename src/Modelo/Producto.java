package Modelo;

public class Producto {
    private String codigo;
    private String nombre;
    private float precioVenta;
    private float gastosEnvio;
    private int tiempoPrep;

    public Producto() {};
    public Producto(String codigo, String nombre, float precioVenta, float gastosEnvio, int tiempoPrep){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.gastosEnvio = gastosEnvio;
        this.tiempoPrep = tiempoPrep;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(float gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getTiempoPrep() {
        return tiempoPrep;
    }

    public void setTiempoPrep(int tiempoPrep) {
        this.tiempoPrep = tiempoPrep;
    }

    @Override
    public String toString(){
        return  "Codigo producto: " + this.getCodigo() + "\n" +
                "Nombre producto: " + this.getNombre() + "\n" +
                "Precio venta: " + this.getPrecioVenta() + "\n" +
                "Gastos envio:  " + this.getGastosEnvio() + "\n" +
                "Tiempo preparo:  " + this.getTiempoPrep() + "\n";

    }
}
