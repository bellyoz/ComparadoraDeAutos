/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Entidades.Vehiculo;
import Modelo.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author bellyoz
 */
public class AutomovilDAO {
    public boolean insertarAutomovil(Vehiculo vehiculo){
        Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "call guardar('"+vehiculo.getModelo()+"','"+vehiculo.getMarca()+"','"+vehiculo.getSerie()+"');";
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    }
    public boolean actualizarVehiculo(int id , Vehiculo vehiculo){
         Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "call actualizar('"+id+"','"+vehiculo.getModelo()+"', '"+vehiculo.getMarca()+"', '"+vehiculo.getSerie()+"')";
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    
    }
    public boolean borrarVehiculo(int id){
         Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "call borrar("+id+",1)";
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    
    }
    public ArrayList<Vehiculo> consultarVehiculo(int id) {
  ArrayList< Vehiculo> rta= new ArrayList< Vehiculo>();
  Conexion conex= new Conexion();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM vehiculo where idVehiculo = ? ");
   consulta.setInt(1, id);
   ResultSet res = consulta.executeQuery();
  
  if(res.next()){

   Vehiculo vehi= new Vehiculo(Integer.parseInt(res.getString("idVehiculo")),res.getString("modelo"),res.getString("marca"), res.getString("serie"));
    rta.add(vehi);
          }
     
          res.close();
          
    
  } catch (Exception e) {
      System.out.println("Error al trae conversion : "+e);
  }
  return rta;
 }
    
    public ArrayList<Vehiculo> listaDeVehiculo() {
  ArrayList<Vehiculo> rta = new ArrayList<Vehiculo>();
  Conexion conex= new Conexion();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM vehiculo");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
       
    Vehiculo vehi= new Vehiculo(Integer.parseInt(res.getString("idVehiculo")),res.getString("modelo"),res.getString("marca"), res.getString("serie"));
    rta.add(vehi);
    }
          
    
  } catch (Exception e) {
      System.out.println("Error no se pudo traer conversiones : "+e);
  }
  return rta;
 }
}
