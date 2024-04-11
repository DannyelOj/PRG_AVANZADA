/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author SALAI
 */
public class CHijos {

    String nombreHijo;
    int edadHijo;

    public CHijos(String nombreHijo, int edadHijo) {
        this.nombreHijo = nombreHijo;
        this.edadHijo = edadHijo;
    }

    public String getNombre() {
        return nombreHijo;
    }

    public void setNombre(String nombre) {
        this.nombreHijo = nombre;
    }

    public int getEdad() {
        return edadHijo;
    }

    public void setEdad(int edad) {
        this.edadHijo = edad;
    }

    public CHijos() {
    }
}
