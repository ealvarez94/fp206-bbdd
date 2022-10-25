package main.java.grupofp.modelo;

import java.util.Iterator;

/*
*
* @author jeps
*/

public class ListaArticulo extends Lista<Articulo>  {

	    public void aniadir(String codigo,String descripcion, double precio, double preparacion, double gastoEnvio) throws Exception {
	    	Articulo articulo = new Articulo (codigo,descripcion, precio, preparacion, gastoEnvio);
		 	if (existeArticulo(articulo.getCodigo())) {
		 		throw new Exception ("Este art�culo ya existe.");
		 	}
		 	else {
		 		lista.add(articulo);
		 	}
	 }
	 	public boolean existeArticulo(String codigo) {
	 		for (Articulo articulo: lista) {
	 			if (articulo.getCodigo().equals(codigo)) {
	 				return true;
	 			}
	 		}
	 		return false;
	 	}
	 	
	 	@Override
	 	public int search (String pk) throws Exception {
	 		int posicion = 0;
	 		for (Articulo articulo: lista) {
	 			if (articulo.getCodigo().equals(pk)){
	 				return posicion;
	 				
	 			}
	 			posicion++;
	 		}
	 		throw new Exception("Este art�culo no existe");
	 	}
	 	
	 	@Override
    public String toString() {
        
        String cadena = "";
       for (Articulo articulo: lista) {
    	   cadena+=(articulo.toString())+"\n";
    	  
       }return cadena;
} 
}

