
package main.java.grupofp.modelo;

/*
*
* @author jeps
*/

public class ClientePremium extends Cliente{

	public ClientePremium(String nombre, String NIF, String domicilio, String email) {
		super(nombre, NIF, domicilio, email);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public String tipoCliente (){
    return "Premium";
    }
	
	@Override
	public int cuotaAnual() {

		return 30;
	}

	@Override
	public int descuentoEnv() {

		return 30;
	}
}
