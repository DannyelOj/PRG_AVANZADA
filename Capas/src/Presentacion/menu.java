/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Clases.CCliente;
import Logica.LCliente;
import java.util.Scanner;

/**
 *
 * @author SALAI
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    
    static CCliente objCliente = new CCliente();
    LCliente objLCliente = new LCliente();
    static String aux;
    static Scanner scan = new Scanner(System.in)
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        String aux;  
        
        do{
            System.out.println("==========MENU==========");
            System.out.println("Ingresar Cliente     [1]");
            System.out.println("Ingresar Direccion   [2]");
            System.out.println("Ingresar Lista       [3]");
            System.out.println("Listar               [4]");
            System.out.println("Salir                [5]");
            System.out.println("========================");
            
            aux = entrada.nextLine();
            op = Integer.parseInt(aux);
            switch (op){
                case 1: 
                    ingresarCliente(objCliente);
                    break;
                case 2: 
                    ingresarDireccion();
                    break;
                case 3: 
                    ingresarLista();
                    break;
                case 4: 
                    listar();
                    break;    
            }
            
        }while(op != 5);
                
        
    }
    
    public static void ingresarCliente(CCliente objCliente){
        if(objCliente != null){
            System.out.println("Ingrese Cedula: ");
            aux = scan.nextLine();
            objCliente.setCedula(aux);
            System.out.println("ingrese nombre");
            aux = scan.nextLine();
            objCliente.setNombres(aux);
            System.out.println("ingrese apellido");
            aux = scan.nextLine();
            objCliente.setNombres(aux);
            System.out.println("ingrese correo");
            aux = scan.nextLine();
            objCliente.setNombres(aux);
        }
    }
    public static void ingresarDireccion(CCliente objCliente){
        System.out.println("Ingrese la calle principal: ");
        aux = scan.nextLine();
        System.out.println("Ingrese la calle secundaria: ");
        aux = scan.nextLine();
    }  
    public static void ingresarLista(){
    
    }
    public static void listar(){
    
    }
}
