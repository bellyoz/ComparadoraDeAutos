/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

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
public class detalleVehiculosDAO {
    public boolean insertarDetalleVehiculo(DetalleVehiculoPK detalle){
        Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        System.out.println("detale vehicu "+detalle.getCodigoVehiculo());
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "INSERT INTO `detalleVehiculo`(`idDetalleVehiculo`, `codigoVehiculo`, `codigoCaracteristicas`)  values (null,+"+detalle.getCodigoVehiculo()+","+detalle.getCodigoCaracteristicas()+")";
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    }
    public boolean actualizarDetalleVehiculo(int id , DetalleVehiculoPK detalle){
         Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "UPDATE `detalleVehiculo` SET `idDetalleVehiculo`="+id+",`codigoVehiculo`="+detalle.getCodigoVehiculo()+",`codigoCaracteristicas`="+detalle.getCodigoCaracteristicas()+" WHERE `idDetalleVehiculo`="+id+"";
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    
    }
    public boolean borrarDetalleVehiculo(int id){
         Conexion conex = new Conexion();
        boolean entro = false;
        String sql = "";
        try {
            Statement estatuto = conex.getConnection().createStatement();
            sql = "DELETE FROM detalleVehiculo WHERE idDetalleVehiculo ="+id;
            estatuto.executeUpdate(sql);
            entro = true;
            return entro;
        } catch (Exception e) {
            System.out.println("no se  puedo insertar : "+e);
        }
        return entro;
    
    }
    public ArrayList<DetalleVehiculoPK> consultarDetalleVehiculo(int id) {
  ArrayList<DetalleVehiculoPK> rta= new ArrayList< DetalleVehiculoPK>();
  Conexion conex= new Conexion();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM detalleVehiculo where idDetalleVehiculo = ? ");
   consulta.setInt(1, id);
   ResultSet res = consulta.executeQuery();
  
  if(res.next()){

   DetalleVehiculoPK vehi= new DetalleVehiculoPK(Integer.parseInt(res.getString("idDetalleVehiculo")),Integer.parseInt(res.getString("codigoVehiculo")),Integer.parseInt(res.getString("codigoCaracteristicas")));
    rta.add(vehi);
          }
     
          res.close();
          
    
  } catch (Exception e) {
      System.out.println("Error al trae conversion : "+e);
  }
  return rta;
 }
    
    public ArrayList<DetalleVehiculoPK> listaDeDetalleVehiculo() {
  ArrayList<DetalleVehiculoPK> rta = new ArrayList<DetalleVehiculoPK>();
  Conexion conex= new Conexion();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM detalleVehiculo");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
       
    DetalleVehiculoPK vehi= new DetalleVehiculoPK(Integer.parseInt(res.getString("idDetalleVehiculo")),Integer.parseInt(res.getString("codigoVehiculo")),Integer.parseInt(res.getString("codigoCaracteristicas")));
    rta.add(vehi);
    }
          
    
  } catch (Exception e) {
      System.out.println("Error no se pudo traer conversiones : "+e);
  }
  return rta;
 }
}
