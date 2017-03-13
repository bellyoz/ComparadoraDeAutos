/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Entidades.Calificacion;
import Modelo.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author bellyoz
 */
public class Reporte {
    public boolean insertarCalificacion(Calificacion cali){
        Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "insert into calificacion(idClasificacion,idVehiculo,idUsuario,idComparacion,comparacion) values(null,'"+cali.getIdVehiculo()+"','"+cali.getIdUsuario()+"','"+cali.getIdComparacion()+"','"+cali.getComparacion()+"')";
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    }
    public boolean actualizarVehiculo(int id , Calificacion cali){
         Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "UPDATE `calificacion` SET `idClasificacion`="+id+",`idVehiculo`="+cali.getIdVehiculo()+",`idUsuario`='"+cali.getIdUsuario()+"',`idComparacion`="+cali.getIdComparacion()+",`comparacion`="+cali.getComparacion()+" WHERE `idClasificacion`="+id+"";
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    
    }
    public ArrayList<Calificacion> consultarCalificacion(int id) {
  ArrayList< Calificacion> rta= new ArrayList< Calificacion>();
  Conexion conex= new Conexion();


  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM calificacion where idClasificacion = ? ");
   consulta.setInt(1, id);
   ResultSet res = consulta.executeQuery();
  
  if(res.next()){

   Calificacion vehi= new Calificacion(Integer.parseInt(res.getString("idClasificacion")),Integer.parseInt(res.getString("idVehiculo")),res.getString("idUsuario"), Integer.parseInt(res.getString("idComparacion")), Integer.parseInt(res.getString("comparacion")));
    rta.add(vehi);
          }
     
          res.close();
          
    
  } catch (Exception e) {
      System.out.println("Error al trae conversion : "+e);
  }
  return rta;
 }
    
    public ArrayList<Calificacion> listaDeCalificacion() {
  ArrayList<Calificacion> rta = new ArrayList<Calificacion>();
  Conexion conex= new Conexion();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM calificacion");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
       
    Calificacion vehi= new Calificacion(Integer.parseInt(res.getString("idClasificacion")),Integer.parseInt(res.getString("idVehiculo")),res.getString("idUsuario"), Integer.parseInt(res.getString("idComparacion")), Integer.parseInt(res.getString("comparacion")));
    rta.add(vehi);
    }
          
    
  } catch (Exception e) {
      System.out.println("Error no se pudo traer conversiones : "+e);
  }
  return rta;
 }
}
