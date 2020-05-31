/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado;

import Reciclado.abstrac.AbstractEmpleado;
import java.util.ArrayList;

/**
 *
 * @author Rafa
 */
public class Coordinacion extends AbstractEmpleado{
   
    private ArrayList plantas;
    private ArrayList solicitudes;
    private double sueldo;
    
    public static final double COMISION_SOLICITUD = 5000;
    
    //Metodo constructor
    public Coordinacion(String encargado, String email, String telefono) {
        super(encargado,email,telefono);
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

    @Override
    public double calcularSueldo() {
        int numeroPlantas = plantas.size();
        int numeroSolicitudes = plantas.size();
        double sueldoCalculado = (numeroPlantas * COMISION_SOLICITUD) + SUELDO_BASE;
        return sueldoCalculado;
    }

}
