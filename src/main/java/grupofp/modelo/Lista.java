package main.java.grupofp.modelo;

import java.util.ArrayList;

/*
*
* @author jeps
*/

public class Lista<T> {

	protected ArrayList<T> lista;
	
	  public Lista() {        
	       lista = new ArrayList<>();
	    }

	    public int getSize() {
	        return this.lista.size();
	    }

	    public void borrar(T t) {
	        this.lista.remove(t); 
	    }
	    
	    public T getAt(int position) {
	       return this.lista.get(position);
	    }

	    public void clear() {
	        this.lista.clear();
	    }
	    
	    public boolean isEmpty() {
	        return lista.isEmpty();
	    }
	    
	    public ArrayList<T> getLista() {
	        return lista;
	    }
	    public int search (String pk) throws Exception {
	    	return 0;
	    }
	}