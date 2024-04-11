/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author SALAI
 */
public class CCliente {

    String cedula;
    String nombres;
    String apellidos;
    String mail; //verificar el dominio por ejemplo "@gmail.com; @utpl.edu.ec"
    CDirecciones direccion;
    ArrayList<CHijos> hijos;

    /*
    Constructor explicito
    Constructor vacio
     */
    public CCliente(String cedula, String nombres, String apellidos, String mail,
            CDirecciones direccion, ArrayList<CHijos> hijos) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.mail = mail;
        this.direccion = direccion;
        this.hijos = hijos;
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

    public ArrayList<CHijos> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<CHijos> hijos) {
        this.hijos = hijos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public CDirecciones getDireccion() {
        return direccion;
    }

    public void setDireccion(CDirecciones direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "=====Datos Ingresados=====\n" + "cedula: " + cedula + ":\nnombres: " + nombres
                + "\napellidos: " + apellidos;
    }

    public CCliente() {
    }
}
