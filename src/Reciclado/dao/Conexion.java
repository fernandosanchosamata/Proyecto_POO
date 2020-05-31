/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciclado.dao;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion{
    private Statement enunciado;
    private ResultSet resultado;
    private Connection conn;

    private boolean error;
    private int errorCode;
    private String errorMessage;

    public Conexion() {
        this.error = false;
        this.conectar();
    }

    public void setError(boolean x){
        this.error = x;
    }

    public boolean getError(){
        return this.error;
    }

    public void setErrorCode(int x){
        this.errorCode = x;
    }

    public int getErrorCode(){
        return this.errorCode;
    }

    public void setErrorMessage(String x){
        this.errorMessage = x;
    }

    public String getErrorMessage(){
        return this.errorMessage;
    }
   
    public Connection get(){
        return this.conn;
    }

    private void conectar(){
        this.setError(false);

        try {
            Class.forName("com.mysql.jdbc.Driver");
           
            try {
                //System.out.println("CONECTAR: " + config.link + ", " + config.user + ", " + config.pass);
                
                //Obtener Conexion a la Base de datos 
                conn = DriverManager.getConnection("jdbc:mysql://localhost/reciclado", "root", "");

                try {
                    enunciado = conn.createStatement();
                } catch (SQLException e) {
                    this.errorMessage = "Ocurrio un error al crear el Statement.\n" + e.getMessage();
                    this.setError(true);
                }
            } catch (SQLException e) {
                this.errorMessage = "Error: No se pudo conectar con la base de datos. \n" + e.getMessage();
                this.setError(true);
            }
        }
        catch (Exception e) {
            this.errorMessage = "Error: Driver de Mysql connector. \n" + e.getMessage();
            this.setError(true);
        }

        if(this.getError()){
            JOptionPane.showMessageDialog(null, this.errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet hacerConsulta(String query) {
        try {
            System.out.println("QUERY -> " + query);
            resultado = enunciado.executeQuery(query);
            this.setError(false);
        } catch (SQLException e) {
            System.out.println("---------------------------------------------");
            System.out.println("QUERY ERROR -> " + query);
            System.out.println("QUERY MESSAGE -> " + e.getMessage());
            System.out.println("QUERY ERRORCODE -> " + e.getErrorCode());
            System.out.println("---------------------------------------------");
            this.setError(true);
            this.setErrorCode(e.getErrorCode());
            this.setErrorMessage(e.getMessage());
        }
        return resultado;
    }

    public int hacerEscritura(String query) {
        int id = 0;
        try {
            System.out.println("QUERY -> " + query);
            enunciado.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            
            try (ResultSet rs = enunciado.getGeneratedKeys()) {
                if (!rs.next()){
                    return 0;
                }
                id = rs.getInt(1);
            }
           
            this.setError(false);
            
        } catch (SQLException e) {
            System.out.println("---------------------------------------------");
            System.out.println("QUERY ERROR -> " + query);
            System.out.println("QUERY MESSAGE -> " + e.getMessage());
            System.out.println("QUERY ERRORCODE -> " + e.getErrorCode());
            System.out.println("---------------------------------------------");
            this.setError(true);
            this.setErrorCode(e.getErrorCode());
            this.setErrorMessage(e.getMessage());
        }
        
        return id;
    }

    public void cerrarConexion() {
        if (null != conn) {
            try {
                conn.close();
                this.setError(false);
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion con la base de datos.\n" + e.getMessage());
                this.setError(true);
            }
        }
    }
}
