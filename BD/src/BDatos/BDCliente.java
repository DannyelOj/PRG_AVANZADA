/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDatos;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author UTPL
 */
public class BDCliente {
    
    Conexiones BDConexiones = new Conexiones();
    Cliente objCliente = new Cliente();
    
    public int InsertarCliente(Cliente objCliente) 
            throws SQLException, ClassNotFoundException{
        String Sentencia = "Insert into Clientes (Cedula,Nombres,Apellidos) "
                + "values (?,?,?)";
        PreparedStatement ps = BDConexiones.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objCliente.getCedula());
        ps.setString(2, objCliente.getNom());
        ps.setString(3, objCliente.getApe());
        return ps.executeUpdate(); //1 si se inserta -- 0 si no inserta
    }

    
    public static void ObtenerUsurio(Cliente objCliente) 
            throws ClassNotFoundException, SQLException {
        //TRABAJPO de los algoritmos
        ResultSet rs = objCliente.RecuperarUsuarios1(objCliente);
        while (rs.next()){
                objCliente.setCedula(rs.getString(1));
                objCliente.setNom(rs.getString(2));
        }
        rs.close();
    }
    
}
