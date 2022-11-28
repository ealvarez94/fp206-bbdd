package Controlador;

import Modelo.*;
import Vista.PedidosView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PedidosController {
    Datos bbdd = new Datos();
    PedidosView menuPedido = new PedidosView();
    OnlineStore volver = new OnlineStore();

//submenu de pedidos
    public void subMenu() {
        PedidosView menuPedidos = new PedidosView();
        int opcion = menuPedidos.mostrarMenu();

        switch (opcion) {
            case 1:
                nuevoPedido();
                subMenu();
                break;
            case 2:
                verPedidos();
                subMenu();
                break;
            case 3:
                OnlineStore volver = new OnlineStore();
                volver.inicio();
            default:
                System.out.println("*** OPCION NO DISPONIBLE ***\n");
                subMenu();

        }
    }

//registro nuevos pedidos
    public void nuevoPedido() {

        List parametros = menuPedido.lecturaPedido();
        bbdd.agregarPedido(parametros);
        }

//listado de pedidos creados
    public void verPedidos() {
        List<Pedido> datos = bbdd.getPedidos();
        menuPedido.mostrarPedidos(datos);
    }

    }

