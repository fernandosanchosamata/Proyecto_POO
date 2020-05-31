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
public class Cliente {
    private String nombreCliente;
    private String rutCliente;
    private String email;
    private String direccion;
    private String tipoDomicilio;
    private String ciudad;
    private HashMap solicitudes;

    public Cliente(String nombreCliente, String rutCliente, String email, String direccion, String tipoDomicilio, String ciudad) {
        this.nombreCliente = nombreCliente;
        this.rutCliente = rutCliente;
        this.email = email;
        this.direccion = direccion;
        this.tipoDomicilio = tipoDomicilio;
        this.ciudad = ciudad;
    }

    public Cliente() {
    }

    public HashMap getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(HashMap solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
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
        return ("Nombre Cliente      : "+this.nombreCliente+
              "\nRut del Cliente     : "+this.rutCliente+
              "\nCorreo electronico  : "+this.email+
              "\nDireccionCliente    : "+this.direccion+
              "\nTipo de Domicilio   : "+this.tipoDomicilio+
              "\nCiudad              : "+this.ciudad+
              "\n---------------------------------------\n");
    }
       
}//Fin Clase
