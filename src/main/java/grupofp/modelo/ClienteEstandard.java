
package main.java.grupofp.modelo;

/*
*
* @author jeps
*/

public class ClienteEstandard extends Cliente{
  
    public ClienteEstandard(String nombre, String NIF, String domicilio, String email) {
		super(nombre, NIF, domicilio, email);

	}

	@Override
    public String tipoCliente (){
    return "Estandard";
    }
	
	@Override
	public int cuotaAnual() {
	
		return 0;
	}

	@Override
	public int descuentoEnv() {
	
		return 0;
	}
}