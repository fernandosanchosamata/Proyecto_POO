/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado.dao;

import Reciclado.Solicitud;
import java.sql.ResultSet;



/**
 *
 * @author Rafa
 */
public class SolicitudDao {
    
    private Database database;
    
    public SolicitudDao(Database database){
        this.database = database;
    }
    
    public SolicitudDao(){
    }
    
    public int agregarSolicitud(Solicitud solicitud ){
        String query = "insert into solicitud(id_cliente,ciudad,tipo_residuo,kilogramos,precio) VALUES ("+solicitud.getIdCliente()+",'"+solicitud.getCiudadSolicitud()+"','"+solicitud.getTipoResiduo()+"',"+solicitud.getKilogramos()+","+solicitud.getPrecio()+")";
        return database.hacerEscritura(query);
    }
    
    public int actualizarSolicitud(int id, Solicitud solicitud ){
        String query = "update solicitud set id_cliente="+solicitud.getIdCliente()+",ciudad='"+solicitud.getCiudadSolicitud()+"',tipo_residuo='"+solicitud.getTipoResiduo()+"',kilogramos="+solicitud.getKilogramos()+",precio="+solicitud.getPrecio()+" where id_solicitud="+id;
        return database.hacerEscritura(query);
    }
    
    public int eliminarSolicitud(int idSolicitud ){
        String query = "delete from solicitud where id_solicitud = "+idSolicitud;
        return database.hacerEscritura(query);
    }
    
    public ResultSet listarSolicitudes(){
        String query = "select s.id_solicitud,c.id, c.nombre,c.rut,c.email,c.direccion,c.tipo_domicilio,c.ciudad,s.kilogramos,s.precio from cliente c inner join solicitud s on (c.id = s.id_cliente)";
        ResultSet result = database.hacerConsulta(query);
        return result;
    }
    
}
