/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado;


/**
 *
 * @author Rafa
 */
public class Vehiculo{
    private String patente;
    private String modelo;
    private String tipoVehiculo;
    private double kilometraje;

    public Vehiculo(String patente, String modelo, String tipoVehiculo) {
        this.patente = patente;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.kilometraje = 0;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    
    
    
}//FIN Clase
