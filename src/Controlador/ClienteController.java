package Controlador;

import Modelo.Cliente;
import Modelo.Datos;
import Modelo.Estandar;
import Modelo.Premium;
import Vista.ClienteView;

import java.util.List;

public class ClienteController {
    Datos bbdd = new Datos();
    ClienteView menuCliente = new ClienteView();

    OnlineStore volver = new OnlineStore();

//carga el submenu que permite seleccionar el tipo de cliente
    public void subMenu() {

        int opcion = menuCliente.mostrarMenu();

        switch (opcion) {
            case 1:
                nuevoEstandar();
                subMenu();
                break;
            case 2:
                nuevoPremium();
                subMenu();
                break;
            case 3:
                verClientes();
                subMenu();
            case 4:
                volver.inicio();
            default:
                System.out.println("*** OPCION NO DISPONIBLE ***\n");
                subMenu();

        }
    }

//registro cliente estandar
    public void nuevoEstandar() {

        List parametros = menuCliente.lecturaCliente();
        String nif = parametros.get(0).toString();
        String nombre = parametros.get(1).toString();
        String email = parametros.get(2).toString();
        String domicilio = parametros.get(3).toString();

        Estandar datosEstandar = new Estandar(nif, nombre, email, domicilio);
        bbdd.agregarCliente(datosEstandar);
    }

//registro cliente premium
    public void nuevoPremium() {

        List parametros = menuCliente.lecturaCliente();
        String nif = parametros.get(0).toString();
        String nombre = parametros.get(1).toString();
        String email = parametros.get(2).toString();
        String domicilio = parametros.get(3).toString();

        Premium datosPremium = new Premium(nif, nombre, email, domicilio);
        bbdd.agregarCliente(datosPremium);
    }

//listado de clientes
    public void verClientes() {
        List<Cliente> datos = bbdd.getClientes();
        menuCliente.mostrarClientes(datos);
    }


}