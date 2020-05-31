/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando Sancho
 */
public class PlantaDao {
    
    Conexion conexion = new Conexion();
    
    public HashMap<Integer,String> obtenerPlantas(){
        String query = "select * from planta";
        ResultSet result = conexion.hacerConsulta(query);
        HashMap<Integer,String> residuos = new HashMap();
        try {
            while(result.next()){
                //obtiene desde las columnas de las base de datos
                int id        =   result.getInt("id");
                String nombre        =   result.getString("nombre");
                residuos.put(id, nombre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlantaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return residuos;
    }
    
}
