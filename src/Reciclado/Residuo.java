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
public class Residuo  implements IActivo{
    private String tipo;
    private String descripcion;
    private String indentificadorActivo;

    public Residuo(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.calcularIdentificadorActivo();
        toString();
    }

    Residuo() {
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

    

    public String getIndentificadorActivo() {
        return indentificadorActivo;
    }

    @Override
    public final void calcularIdentificadorActivo() {
        final String uuid = UUID.randomUUID().toString();
        StringBuilder identificador = new StringBuilder();
        identificador.append(Residuo.class.getName());
        identificador.append("-");
        identificador.append(uuid);
        this.indentificadorActivo = identificador.toString();
    }

    @Override
    public String toString() {
        return "Residuo{" + "tipo=" + tipo + ", descripcion=" + descripcion + ", indentificadorActivo=" + indentificadorActivo + '}';
    }
    
    
    
}

