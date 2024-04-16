/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BDatos.BDCliente;
import Clases.Cliente;
import java.sql.SQLException;

/**
 *
 * @author UTPL
 */
public class LCliente {

    BDCliente objBDCliente = new BDCliente();

    public void AgregarCliente(Cliente objCliente)
            throws ClassNotFoundException, SQLException {
        objBDCliente.InsertarCliente(objCliente);
    }
}
