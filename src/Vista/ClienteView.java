package Vista;

import Modelo.Cliente;
import Modelo.Estandar;
import Modelo.Premium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//menu principal de clientes
public class ClienteView {

    public int mostrarMenu() {
        int opcion;
        System.out.println("MENU CLIENTES");
        System.out.println("___________________________");
        System.out.println("1 Agregar cliente estandar");
        System.out.println("2 Agregar cliente premium");
        System.out.println("3 Ver clientes");
        System.out.println("4 Volver");

        opcion = new Scanner(System.in).nextInt();

        return opcion;

    }
//lee el imput y los exporta como parametros para que pueda ser leido por el controlador y el DAO
    public static List lecturaCliente() {

        List parametros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("NIF:");
        String nif = sc.nextLine();
        parametros.add(nif);

        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        parametros.add(nombre);

        System.out.println("e-mail:");
        String email = sc.nextLine();
        parametros.add(email);

        System.out.println("Domicilio:");
        String domicilio = sc.nextLine();
        parametros.add(domicilio);

        return (parametros);

    }

//saca por pantalla los datos de clientes almacenados en la base de datos
    public void mostrarClientes(List<Cliente> clienteLista) {
        System.out.println("CLIENTES");
        for (Cliente cliente : clienteLista) {
            if (cliente instanceof Estandar) {
                System.out.println(cliente.toString());
                System.out.println("___________________________");
            } else if(cliente instanceof Premium) {
                System.out.println(cliente.toString());
                System.out.println("___________________________");
            }
        }
    }
}
