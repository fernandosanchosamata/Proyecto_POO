/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado;

import java.util.HashMap;

/**
 *
 * @author Rafa
 */
public class Solicitud {
    private int idSolicitud;
    private int idCliente;
    private String ciudadSolicitud;
    private String tipoResiduo;
    private float kilogramos;
    private float precio;
    
    
    public Solicitud(){}

    //Metodo Costructor Primer Nivel de Anidacion, carga datos de Solicitud
    public Solicitud(int idSolicitud, String ciudadSolicitud, String tipoResiduo, float kilogramos, float precio){
        this.idSolicitud = idSolicitud;
        this.ciudadSolicitud = ciudadSolicitud;
        this.tipoResiduo = tipoResiduo;
        this.kilogramos = kilogramos;
        this.precio = precio;
    }
    
   
    
    //Metodos Geter y Seter
    public int getIdSolicitud() {
        this.idSolicitud = (int) ((Math.random()*25+1));
        return  this.idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    

    public String getCiudadSolicitud() {
        return ciudadSolicitud;
    }

    public void setCiudadSolicitud(String ciudadSolicitud) {
        this.ciudadSolicitud = ciudadSolicitud;
    }

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public float getKilogramos() {
        return kilogramos;
    }

    public void setKilogramos(float kilogramos) {
        this.kilogramos = kilogramos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
  
    public void asignarClienteASolicitid(){
        
    }
    public void asignarChoferASolicitud(){
        
    }
    
    
}//Fin Clase
