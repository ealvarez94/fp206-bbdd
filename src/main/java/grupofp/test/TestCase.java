package main.java.grupofp.test;

import main.java.grupofp.controlador.Controlador;
import main.java.grupofp.modelo.*;
import main.java.grupofp.vista.GestionOS;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TestCase {
    private GestionOS gestionOS;
    private Controlador controlador;
    @BeforeEach
    void setup(){
        Controlador controlador = new Controlador();
        GestionOS gestionOS = new GestionOS();
    }

    @Test
    void comprobar_override_cliente() {
        ClienteEstandard c = new ClienteEstandard("Pedro","54895","gijon","hola@gmail.com");
        String cliente = c.toString();
        assertNotNull(cliente);
    }

    @Test
    void comprobar_anadir_articulos(){
        Articulo producto = new Articulo("tomate","rojo",5,1,2);
        ArrayList<Articulo> articulo = new ListaArticulo().getLista();;
        assertNotNull(articulo);
    }


}