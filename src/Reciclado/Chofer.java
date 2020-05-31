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
public class Chofer{
    private int idChofer;
    private String nombreChofer; 
    private String rutChofer;
    private String telefono;
    private String email;
    private String licencia;
    private double sueldo;
    private int cantViajes;
    private HashMap vehiculos;

    //Metodo Constructor para solicitud
    public Chofer(int idChofer, String nombreChofer, String licencia) {
        this.idChofer = idChofer;
        this.nombreChofer = nombreChofer;
        this.licencia = licencia;
        this.vehiculos = new HashMap<Integer,Vehiculo>();
    }
    
    //Metodo Constructor para Area de Coordinacion
    public Chofer(int idChofer, String nombreChofer, String rutChofer, String telefono, String email, String licencia, double sueldo) {
        this.idChofer = idChofer;
        this.nombreChofer = nombreChofer;
        this.rutChofer = rutChofer;
        this.telefono = telefono;
        this.email = email;
        this.licencia = licencia;
        this.sueldo = sueldo;
        this.cantViajes = 0;
    }

    public Chofer() {
    }
   
    //Agregar Objeto VEHICULO al HashMap
    public Vehiculo agrgarVehiculo(Vehiculo vehiculo){
        return (Vehiculo) this.vehiculos.put(vehiculo.getPatente(), vehiculo);
    }
    
    //Metodos Geter y Seter

    public int getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }

    public String getNombreChofer() {
        return nombreChofer;
    }

    public void setNombreChofer(String nombreChofer) {
        this.nombreChofer = nombreChofer;
    }

    public String getRutChofer() {
        return rutChofer;
    }

    public void setRutChofer(String rutChofer) {
        this.rutChofer = rutChofer;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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

    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return ("ID Chofer        : "+this.idChofer+
              "\nNombre Chofer    : "+this.nombreChofer+
              "\nTipo de Licencia : "+this.licencia+
              "\n---------------------------------------\n");
    }
    
}//Fin Clase
