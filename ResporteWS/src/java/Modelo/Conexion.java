/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author bellyoz
 */
public class Conexion {
    private String bd = "calificaciondb";
    private String user ="root";
    private String pass = "uchiha01";
    private String url = "jdbc:mysql://localhost:3306/"+bd;
    Connection connection = null;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,pass);
             if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
            }
        } catch (Exception e) {
            System.out.println("No se pudo conectar : "+e);
        }
    }
    public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
}
