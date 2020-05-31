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
public class Residuo{
    private String tipo;
    private String descripcion;

    public Residuo(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String mostrarDatosResiduo(){
        return "El tipo del residuo es : "+tipo
                +"\nDescripcion : "+descripcion;
    }

    @Override
    public String toString() {
        return "Residuo{" + "tipo=" + tipo + '}';
    }
    
    
}

