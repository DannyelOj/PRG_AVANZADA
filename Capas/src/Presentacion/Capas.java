/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Clases.CCliente;
import Clases.CHijos;
import Logica.LCliente;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author SALAI
 */
public class Capas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner aux = new Scanner(System.in);
        CHijos objHijo = new CHijos();
        LCliente objLCliente = new LCliente();
        CCliente obj = new CCliente();

        //instancia
        String campo;
        String nombreHijo;
        int edad;
        ArrayList<CHijos> hijos = null;

        //CEDULA
        System.out.println("Ingrese su cedula: ");
        campo = aux.nextLine();
        obj.setCedula(campo);
        //NOMBRE
        System.out.println("Ingrese su nombre: ");
        campo = aux.nextLine();
        obj.setNombres(campo);
        //APELLIDO
        System.out.println("Ingrese su apellido: ");
        campo = aux.nextLine();
        obj.setApellidos(campo);
        //INGRESE EL NUMERO DE HIJOS
        System.out.println("Ingrese la cantidad de hijos: ");
        int numHijos = aux.nextInt();

        for (int i = 0; i < numHijos; i++) {
            //NOMBRE_HIJO
            System.out.println("Ingrese el nombre de su hijo: ");
            nombreHijo = aux.nextLine();
            objHijo.setNombre(nombreHijo);
            aux.nextLine();
            //EDAD_HIJO
            System.out.println("Ingrese la edad de su hijo: ");
            edad = aux.nextInt();
            objHijo.setEdad(edad);
            
            hijos.add(objHijo);
        }

        if (objLCliente.validaCedula(obj)) {
            System.out.println(obj.toString());
        } else {
            System.out.println("error en la cedula");
        }
        
    }
    
}
