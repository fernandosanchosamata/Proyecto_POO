/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado;

import java.util.ArrayList;

/**
 *
 * @author Rafa
 */
public class Coordinacion{
    private String encargado;
    private String email;
    private String telefono;
    private ArrayList plantas;
    private ArrayList solicitudes;
    
    //Metodo constructor
    public Coordinacion(String encargado, String email, String telefono) {
        this.encargado = encargado;
        this.email = email;
        this.telefono = telefono;
        this.plantas = new ArrayList();
        this.solicitudes = new ArrayList();
    }

   //Agregar Objeto PLANTAS al ArrayList
    public void agrgarPlantas(Planta planta){
        this.plantas.add(planta);
    }
    
    //Agrega Objeto SOLICITUD al ArrayList
    public void agregarSolicitud(Solicitud solicitud){
        this.solicitudes.add(solicitud);
    }
    
    //Metodos Geter y Seter
    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList plantas) {
        this.plantas = plantas;
    }

    public ArrayList getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList solicitudes) {
        this.solicitudes = solicitudes;
    }

}
