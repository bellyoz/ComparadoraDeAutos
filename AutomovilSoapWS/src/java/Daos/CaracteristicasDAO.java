/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Entidades.Caracteristicas;
import Entidades.DetalleVehiculo;
import Entidades.DetalleVehiculoPK;
import Modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author bellyoz
 */
public class CaracteristicasDAO {
    public boolean insertarCaracteristicas(Caracteristicas cara){
        Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
  
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "call guardarActualizarCarateristica(1, 0,'"+cara.getVersion()+"', '"+cara.getCombustible()+"',"+cara.getPotencimax()+","+cara.getNocilindros()+", '"+cara.getTraccion()+"', "+cara.getCajacambios()+", "+cara.getNopuertas()+", "+cara.getVolumenmaletero()+", "+cara.getCapdeposito()+" ,"+cara.getAceleracion()+", "+cara.getVelmax()+" , "+cara.getConsumou()+", "+cara.getConsumom()+", "+cara.getConsumeex()+", "+cara.getConsumem()+", "+cara.getEmisionesco2()+")";
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    }
    public boolean actualizarCaracteristicas(int id , Caracteristicas cara){
         Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "call guardarActualizarCarateristica(2,"+id+",'"+cara.getVersion()+"', '"+cara.getCombustible()+"',"+cara.getPotencimax()+","+cara.getNocilindros()+", '"+cara.getTraccion()+"', "+cara.getCajacambios()+", "+cara.getNopuertas()+", "+cara.getVolumenmaletero()+", "+cara.getCapdeposito()+" ,"+cara.getAceleracion()+", "+cara.getVelmax()+" , "+cara.getConsumou()+", "+cara.getConsumom()+", "+cara.getConsumeex()+", "+cara.getConsumem()+", "+cara.getEmisionesco2()+")";
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    
    }
    public boolean borrarCaracteristicas(int id){
         Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "DELETE FROM `caracteristicas` WHERE idCaracteristicas = "+id;
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    
    }
    public ArrayList<Caracteristicas> consultarCaracteristicas(int id) {
  ArrayList<Caracteristicas> rta= new ArrayList< Caracteristicas>();
  Conexion conex= new Conexion();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM caracteristicas where idCaracteristicas = ? ");
   consulta.setInt(1, id);
   ResultSet res = consulta.executeQuery();
  
  if(res.next()){

   Caracteristicas vehi= new Caracteristicas(Integer.parseInt(res.getString("idCaracteristicas")),res.getString("version"),res.getString("combustible"),Integer.parseInt(res.getString("potencimax")), Integer.parseInt(res.getString("nocilindros")),res.getString("traccion"), Integer.parseInt(res.getString("cajacambios")),  Integer.parseInt(res.getString("nopuertas")),  Integer.parseInt(res.getString("volumenmaletero")),Integer.parseInt(res.getString("capdeposito")), Integer.parseInt(res.getString("aceleracion")),Integer.parseInt(res.getString("velmax")),Integer.parseInt(res.getString("consumou")),Integer.parseInt(res.getString("consumom")),Integer.parseInt(res.getString("consumeex")),Integer.parseInt(res.getString("consumem")),Integer.parseInt(res.getString("emisionesco2")));
    rta.add(vehi);
          }
     
          res.close();
          
    
  } catch (Exception e) {
      System.out.println("Error al trae conversion : "+e);
  }
  return rta;
 }
    
    public ArrayList<Caracteristicas> listaDeCaracteristicas() {
  ArrayList<Caracteristicas> rta = new ArrayList<Caracteristicas>();
  Conexion conex= new Conexion();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM caracteristicas");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
       
    Caracteristicas vehi= new Caracteristicas(Integer.parseInt(res.getString("idCaracteristicas")),res.getString("version"),res.getString("combustible"),Integer.parseInt(res.getString("potencimax")), Integer.parseInt(res.getString("nocilindros")),res.getString("traccion"), Integer.parseInt(res.getString("cajacambios")),  Integer.parseInt(res.getString("nopuertas")),  Integer.parseInt(res.getString("volumenmaletero")),Integer.parseInt(res.getString("capdeposito")), Integer.parseInt(res.getString("aceleracion")),Integer.parseInt(res.getString("velmax")),Integer.parseInt(res.getString("consumou")),Integer.parseInt(res.getString("consumom")),Integer.parseInt(res.getString("consumeex")),Integer.parseInt(res.getString("consumem")),Integer.parseInt(res.getString("emisionesco2")));
    rta.add(vehi);
    }
          
    
  } catch (Exception e) {
      System.out.println("Error no se pudo traer conversiones : "+e);
  }
  return rta;
 }
}
