/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Clases.Cliente;
import java.util.regex.Pattern;

/**
 * @author UTPL
 * Clase para manejar la logica de Cliente
 */
public class LCliente {
    public static boolean validaCedula(Cliente obj){
        //Define la expresion solo para numeros y la longitud de 10
        String regex = "[0-9]{10}";
        //Compila la expresion regular en un patron
        Pattern pattern = Pattern.compile(regex);
        //Usa el patron para verificar si la cedula es correcta 
        return pattern.matcher(obj.getCedula()).matches();
    }
    //programacion por capas
    //modelo vista controlador
    //visivilidad de metros y atributos -> leccion 
}
