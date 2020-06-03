/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado;

import Reciclado.abstrac.AbstractEmpleado;
import java.util.HashMap;

/**
 *
 * @author Rafa
 */
public class Chofer extends AbstractEmpleado{
    private String licencia;
    private int cantViajes;
    private HashMap vehiculos;
    
    public static final double PRECIO_X_VIAJE = 5000;

    public Chofer() {
    }

    //Metodo Constructor para solicitud
    public Chofer(int idChofer, String nombreChofer, String licencia) {
        super(idChofer, nombreChofer);
        this.licencia = licencia;
        this.vehiculos = new HashMap<Integer,Vehiculo>();
    }
    
    //Metodo Constructor para Area de Coordinacion
    public Chofer(int idChofer, String nombreChofer, String rutChofer, String telefono, String email, String licencia, double sueldo) {
        super(idChofer, nombreChofer,rutChofer,telefono,email,sueldo);
        this.licencia = licencia;
        this.cantViajes = 0;
    }
    

    //Agregar Objeto VEHICULO al HashMap
    public Vehiculo agrgarVehiculo(Vehiculo vehiculo){
        return (Vehiculo) this.vehiculos.put(vehiculo.getPatente(), vehiculo);
    }
    
    //Metodos Geter y Seter
    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getCantViajes() {
        return cantViajes;
    }

    public void setCantViajes(int cantViajes) {
        this.cantViajes = cantViajes;
    }

    public HashMap getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(HashMap vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Chofer{" + "licencia=" + licencia + ", cantViajes=" + cantViajes + ", vehiculos=" + vehiculos + '}';
    }

    @Override
    public double calcularSueldo() {
        double sueldoCalculado = (cantViajes * PRECIO_X_VIAJE) + SUELDO_BASE;
        return sueldoCalculado;
    }

    @Override
    public double obtenetHorario() {
        return 1;
    }

    
    /**
     *
     * @return
     */
    
    
}//Fin Clase
