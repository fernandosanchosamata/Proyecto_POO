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
public class Planta{
    private String nombrePlana;
    private String direccionPlanta;
    private String ciudad;
    private double capacidadMaxKilos;
    private double cantidadKilos;    
    private int cantidadSolicitudes;
    private ArrayList residuos;
    private ArrayList choferes;

    
    public Planta(String nombrePlana, String direccionPlanta, String ciudad, double capacidadMaxKilos) {
        this.nombrePlana = nombrePlana;
        this.direccionPlanta = direccionPlanta;
        this.ciudad = ciudad;
        this.capacidadMaxKilos = capacidadMaxKilos;
        this.cantidadKilos = 0;
        this.cantidadSolicitudes = 0;
        this.residuos = new ArrayList();
        this.choferes = new ArrayList<Chofer>();
    }
    
    //Agregar Objeto RRESIDUO al ArrayList
    public void agrgarResiduos(Residuo residuo){
        this.residuos.add(residuo);
    }
    
    //Agrega Objeto CHOFER al ArrayList
    public void agregarChofer(Chofer chofer){
        this.choferes.add(chofer);
    }
    
    //Metodos Geter y Seter
    public String getNombrePlana() {
        return nombrePlana;
    }

    public void setNombrePlana(String nombrePlana) {
        this.nombrePlana = nombrePlana;
    }

    public String getDireccionPlanta() {
        return direccionPlanta;
    }

    public void setDireccionPlanta(String direccionPlanta) {
        this.direccionPlanta = direccionPlanta;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getCapacidadMaxKilos() {
        return capacidadMaxKilos;
    }

    public void setCapacidadMaxKilos(double capacidadMaxKilos) {
        this.capacidadMaxKilos = capacidadMaxKilos;
    }

    public double getCantidadKilos() {
        return cantidadKilos;
    }

    public void setCantidadKilos(double cantidadKilos) {
        this.cantidadKilos = cantidadKilos;
    }

    public int getCantidadSolicitudes() {
        return cantidadSolicitudes;
    }

    public void setCantidadSolicitudes(int cantidadSolicitudes) {
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public ArrayList getResiduos() {
        return residuos;
    }

    public void setResiduos(ArrayList residuos) {
        this.residuos = residuos;
    }

    
    
    
    ///*
    public ArrayList getChoferes() {
        return choferes;
    }

    public void setChoferes(ArrayList choferes) {
        this.choferes = choferes;
    }
    //*/

    //Metodos Opcionales
    public void agregarCargaKilos(double ingresoCarga){
        cantidadKilos += ingresoCarga;
    }
    
    public void retirarCargaKilos(double retirarCarga){
        cantidadKilos -= retirarCarga;
    }
   
    public void comprobarCapacidad(){
        if(cantidadKilos <= capacidadMaxKilos){
            System.out.println("Espacio Disponible");
        }else {
            System.out.println("No hay espacio");
        }
    }
    
    public void mostarDatosPlanta(){
        System.out.println("Planta Nombre : "+nombrePlana+
                         "\nDireccion     : "+direccionPlanta+
                         "\nCiudad        : "+ciudad+
                         "\n-------------------------------------------"  );
    }
    
}


