
package main.java.grupofp.modelo;

/**
 *
 * @author joelj
 */

public class ClienteEstandard extends Cliente{
  
    public ClienteEstandard(String nombre, String NIF, String domicilio, String email) {
		super(nombre, NIF, domicilio, email);

	}

	@Override
    public String tipoCliente (){
    return "Estandard";
    }
}