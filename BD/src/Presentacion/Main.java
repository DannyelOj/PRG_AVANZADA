/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Clases.Cliente;
import Logica.LCliente;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Main {

    static Cliente objCliente = new Cliente(0, "1102", "Daniel", "Ojeda");
    static LCliente objLCliente = new LCliente();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        objLCliente.AgregarCliente(objCliente);
        Scanner sc = new Scanner(System.in);
        String opc;
        boolean bandera = true;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1) Ingresar Cliente");
            System.out.println("2) Ingresar un Paquete");
            System.out.println("3) Cambiar el estado del paquete");
            System.out.println("4) Ingresar Direccion");
            System.out.println("5) Listar");
            System.out.println("6) Salir");
            System.out.print("Ingrese un opcion: ");
            opc = sc.nextLine();
            switch (opc) {
                case "1" -> {
                    objLCliente.AgregarCliente(objCliente);
                }
                default -> {
                    System.out.println("Opción no válida");
                }
            }
        } while (bandera);
    }

}
