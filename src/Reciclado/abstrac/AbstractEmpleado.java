/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado.abstrac;

/**
 *
 * @author Fernando Sancho
 */
public abstract class AbstractEmpleado {
    private int id;
    private String nombre;
    private String rut;
    private String telefono;
    private String email;
    private String licencia;
    private double sueldo;

    /**
     * Sueldo base chile
     */
    public static final double SUELDO_BASE = 320500;

    public AbstractEmpleado() {
    }

    
    
    public AbstractEmpleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public AbstractEmpleado(int id, String nombre, String rut, String telefono, String email, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.email = email;
        this.sueldo = sueldo;
    }

    public AbstractEmpleado(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId() {
        this.id = (int) ((Math.random()*25+1));
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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
    /* *
     * Metodo abstracto calcula el sueldo por empleado
     * */
    public abstract double calcularSueldo();
    
    public abstract double obtenetHorario();
    

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", rut=" + rut + ", telefono=" + telefono + ", email=" + email + ", licencia=" + licencia + ", sueldo=" + sueldo + '}';
    }
    
    
}
