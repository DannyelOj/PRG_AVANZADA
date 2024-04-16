/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.ResultSet;

/**
 *
 * @author UTPL
 */
public class Cliente {
    int idCli;
    String cedula;
    String nom;
    String ape; 

    public Cliente() {
    }

    public Cliente(int idCli, String cedula, String nom, String ape) {
        this.idCli = idCli;
        this.cedula = cedula;
        this.nom = nom;
        this.ape = ape;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCli=" + idCli + ", cedula=" + cedula + ", nom=" + 
                nom + ", ape=" + ape + '}';
    }

    public ResultSet RecuperarUsuarios1(Cliente objCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
