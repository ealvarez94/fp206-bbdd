package main.java.grupofp.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class ArticuloTest {

    @Test
    void comprobar_anadir_articulos(){
        Articulo producto = new Articulo("1","tomate",2.5,5,10);
        ArrayList<Articulo> articulo = new ListaArticulo().getLista();;
        assertNotNull(articulo);
    }
}