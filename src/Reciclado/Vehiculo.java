/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado;

import Reciclado.abstrac.IActivo;
import java.util.UUID;


/**
 *
 * @author Rafa
 */
public class Vehiculo implements IActivo{
    private String patente;
    private String modelo;
    private String tipoVehiculo;
    private double kilometraje;
    private String indentificadorActivo;

    public Vehiculo(String patente, String modelo, String tipoVehiculo) {
        this.patente = patente;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.kilometraje = 0;
        this.calcularIdentificadorActivo();
        toString();
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

    @Override
    public final void calcularIdentificadorActivo() {
        final String uuid = UUID.randomUUID().toString();
        StringBuilder identificador = new StringBuilder();
        identificador.append(Vehiculo.class.getName());
        identificador.append("-");
        identificador.append(uuid);
        this.indentificadorActivo = identificador.toString();
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", tipoVehiculo=" + tipoVehiculo + ", kilometraje=" + kilometraje + ", indentificadorActivo=" + indentificadorActivo + '}';
    }
    
    
    
    
}//FIN Clase
