/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author UTPL
 */
public class Cliente {
    String cedula;
    String nombres;
    String apellidos;
    String mail; //verificar el dominio por ejemplo "@gmail.com; @utpl.edu.ec"
    Direcciones direccion;
    //ArrayList<Direcciones> direcciones;
    /*
    Constructor explicito
    Constructor vacio
    */
    public Cliente(String cedula, String nombres, String apellidos) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Trabajo01_Profe{" + "cedula=" + cedula + ", nombres=" + nombres
                + ", apellidos=" + apellidos + '}';
    }
    
    
}
