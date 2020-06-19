/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado.dao;

import java.sql.ResultSet;

public interface Database {
    
    ResultSet hacerConsulta(String query);
    
    int hacerEscritura(String query);
    
    void cerrarConexion();
    
}
