/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Clases.Cliente;
import Logica.LCliente;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author UTPL
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner aux = new Scanner(System.in);
        LCliente objLCliente = new LCliente();
        //instancia
        String campo;        
        Cliente obj = new Cliente();
        System.out.println("Ingrese su cedula: ");
        campo = aux.nextLine();
        obj.setCedula(campo);
        System.out.println("Ingrese su nombre: ");
        campo = aux.nextLine();
        obj.setNombres(campo);
        System.out.println("Ingrese su apellido: ");       
        campo = aux.nextLine();
        obj.setApellidos(campo);
        
        if(objLCliente.validaCedula(obj))
            System.out.println(obj.toString());
        else
            System.out.println("error en la cedula");
        
    }
    
    
}


