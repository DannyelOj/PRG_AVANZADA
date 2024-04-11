/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Clases.CCliente;

/**
 *
 * @author SALAI
 */
public class LHijo {
    public boolean calcularEdad(CCliente obj){
        if(obj.getHijos().get(0).getEdad() < 0){
            return true;
        }else{
            return false;
        }
    }
}
