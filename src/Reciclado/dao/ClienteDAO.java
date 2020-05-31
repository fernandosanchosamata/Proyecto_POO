/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado.dao;

import Reciclado.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafa
 */
public class ClienteDAO {
    Conexion conexion = new Conexion();
    
    public int agregarCliente(Cliente cliente ){
        String query = "INSERT INTO CLIENTE(nombre,rut,email,direccion,tipo_domicilio,ciudad) VALUES ('" + cliente.getNombreCliente()+"','"+cliente.getRutCliente()+"','"+cliente.getEmail()+"','"+cliente.getDireccion()+"','"+cliente.getTipoDomicilio()+"','"+cliente.getCiudad()+"')";
        return conexion.hacerEscritura(query);
    }
    
    public int actualizarCliente(String rut, Cliente cliente ){
        String query = "update cliente set nombre='"+cliente.getNombreCliente()+"',rut = '"+cliente.getRutCliente()+"',email='"+cliente.getEmail()+"',direccion='"+cliente.getDireccion()+"',tipo_domicilio='"+cliente.getTipoDomicilio()+"',ciudad='"+cliente.getCiudad()+"' where rut ='"+rut+"'";
        return conexion.hacerEscritura(query);
    }
    
    public boolean existeCliente(String rut){
        String query = "select id from cliente where rut = '"+rut+"'";
        ResultSet result = conexion.hacerConsulta(query);
        try {
            if(result.first()==true){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
}//Fin Clase

