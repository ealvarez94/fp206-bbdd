package main.java.grupofp.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteEstandardTest {

    @Test
    void comprobar_override_cliente() {
        ClienteEstandard c = new ClienteEstandard("Paloma","12345678A","Barcelona","paloma@correo.com");
        String cliente = c.toString();
        assertNotNull(cliente);
    }
}