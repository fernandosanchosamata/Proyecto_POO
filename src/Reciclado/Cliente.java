/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rafa
 */
public class Cliente{
    private int id;
    private String nombre;
    private String rut;
    private String email;
    private String direccion;
    private String tipoDomicilio;
    private String ciudad;
    private Map<Integer,Solicitud> solicitudes;

    public Cliente(String nombreCliente, String rutCliente, String email, String direccion, String tipoDomicilio, String ciudad) {
        this.id = 0;
        this.nombre = nombreCliente;
        this.rut = rutCliente;
        this.email = email;
        this.direccion = direccion;
        this.tipoDomicilio = tipoDomicilio;
        this.ciudad = ciudad;
    }

    public Cliente() {
    }

    public int getId() {
        if(this.id == 0){
            this.id = (int) ((Math.random()*25+1));
        }
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public Map<Integer, Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Map<Integer, Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    public String getNombreCliente() {
        return nombre;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombre = nombreCliente;
    }

    public String getRutCliente() {
        return rut;
    }

    public void setRutCliente(String rutCliente) {
        this.rut = rutCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoDomicilio() {
        return tipoDomicilio;
    }

    public void setTipoDomicilio(String tipoDomicilio) {
        this.tipoDomicilio = tipoDomicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return ("Nombre Cliente      : "+this.nombre+
              "\nRut del Cliente     : "+this.rut+
              "\nCorreo electronico  : "+this.email+
              "\nDireccionCliente    : "+this.direccion+
              "\nTipo de Domicilio   : "+this.tipoDomicilio+
              "\nCiudad              : "+this.ciudad+
              "\n---------------------------------------\n");
    }
       
}//Fin Clase
