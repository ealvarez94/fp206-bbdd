
package main.java.grupofp.modelo;

/**
 *
 * @author joelj
 */
public class Articulo {


	private String codigo;
    private String descripcion;
    private double precio;
    private double preparacion;
    private double gastoEnvio;

//Constructor
    public Articulo(String codigo, String descripcion, double precio, double preparacion, double gastoEnvio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.preparacion = preparacion;
        this.gastoEnvio = gastoEnvio;
    }
    
    
// Getters
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPreparacion() {
        return preparacion;
    }

    public double getGastoEnvio() {
        return gastoEnvio;
    }
    
      
//Setters

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPreparacion(double preparacion) {
        this.preparacion = preparacion;
    }

    public void setGastoEnvio(double gastoEnvio) {
        this.gastoEnvio = gastoEnvio;
    }
    
    
    @Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", preparacion="
				+ preparacion + ", gastoEnvio=" + gastoEnvio + "]";
	}
}


