/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebService;

import Daos.AutomovilDAO;
import Daos.CaracteristicasDAO;
import Daos.detalleVehiculosDAO;
import Entidades.Caracteristicas;
import Entidades.DetalleVehiculo;
import Entidades.DetalleVehiculoPK;
import Entidades.Vehiculo;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author bellyoz
 */
@WebService(serviceName = "AutomovilWS")
public class AutomovilWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod()
    public boolean insertarVehiculo(String modelo , String marca , String serie){
        AutomovilDAO vehiculoDao = new AutomovilDAO();
        return vehiculoDao.insertarAutomovil(new Vehiculo(null, modelo, marca, serie));
    }
    @WebMethod()
    public boolean actualizarVehiculo(int id , String modelo , String marca , String serie){
        AutomovilDAO vehiculoDao = new AutomovilDAO();
        return vehiculoDao.actualizarVehiculo(id, new Vehiculo(null, modelo, marca, serie));
    }
    @WebMethod()
    public boolean borrarVehiculo(int id ){
        AutomovilDAO vehiculoDao = new AutomovilDAO();
        return vehiculoDao.borrarVehiculo(id);
    }
    
    @WebMethod()
    public ArrayList< Vehiculo> consultarVehiculo(int id ){
        AutomovilDAO vehiculoDao = new AutomovilDAO();
        return vehiculoDao.consultarVehiculo(id);
    }
    @WebMethod()
    public ArrayList< Vehiculo> consultarListaVehiculo( ){
        AutomovilDAO vehiculoDao = new AutomovilDAO();
        return vehiculoDao.listaDeVehiculo();
    }
    //detalleVehiculo
     @WebMethod()
    public boolean insertarDetalleVehiculo(int codigoVehiculo , int  codigoCaracteristicas){
       detalleVehiculosDAO Dao = new detalleVehiculosDAO();
        return Dao.insertarDetalleVehiculo(new DetalleVehiculoPK(0, codigoVehiculo, codigoCaracteristicas));
    }
    @WebMethod()
    public boolean actualizarDetalleVehiculo(int id , int codigoVehiculo , int  codigoCaracteristicas){
        detalleVehiculosDAO Dao = new detalleVehiculosDAO();
        return Dao.actualizarDetalleVehiculo(id, new DetalleVehiculoPK(0, codigoVehiculo, codigoCaracteristicas));
    }
    @WebMethod()
    public boolean borrarDetalleVehiculo(int id ){
        detalleVehiculosDAO Dao = new detalleVehiculosDAO();
        return Dao.borrarDetalleVehiculo(id);
    }
    
    @WebMethod()
    public ArrayList<DetalleVehiculoPK> consultarDetalleVehiculo(int id ){
        detalleVehiculosDAO Dao = new detalleVehiculosDAO();
        return Dao.consultarDetalleVehiculo(id);
    }
    @WebMethod()
    public ArrayList<DetalleVehiculoPK> consultarListaDetalleVehiculo( ){
        detalleVehiculosDAO Dao = new detalleVehiculosDAO();
        return Dao.listaDeDetalleVehiculo();
    }
    //Caracteristicas
    
     @WebMethod()
    public boolean insertarCaracteristicas(String version , String combustible , int potencimax , int nocilindros , String traccion , int cajacambios, int nopuertas, int volumenmaletero , int capdeposito, int aceleracion , int velmax , int consumou , int consumom  , int consumeex , int consumem , int emisionesco2 ){
       CaracteristicasDAO Dao = new CaracteristicasDAO();
        return Dao.insertarCaracteristicas(new Caracteristicas(0, version, combustible, potencimax, nocilindros, traccion, cajacambios, nopuertas, volumenmaletero, capdeposito, aceleracion, velmax, consumou, consumom, consumeex, consumem, emisionesco2));
    }
    @WebMethod()
    public boolean actualizarCaracteristicas(int id ,String version , String combustible , int potencimax , int nocilindros , String traccion , int cajacambios, int nopuertas, int volumenmaletero , int capdeposito, int aceleracion , int velmax , int consumou , int consumom  , int consumeex , int consumem , int emisionesco2){
        CaracteristicasDAO Dao = new CaracteristicasDAO();
        return Dao.actualizarCaracteristicas(id, new Caracteristicas(0, version, combustible, potencimax, nocilindros, traccion, cajacambios, nopuertas, volumenmaletero, capdeposito, aceleracion, velmax, consumou, consumom, consumeex, consumem, emisionesco2));
    }
    @WebMethod()
    public boolean borrarCaracteristicas(int id ){
        CaracteristicasDAO Dao = new CaracteristicasDAO();
        return Dao.borrarCaracteristicas(id);
    }
    
    @WebMethod()
    public ArrayList<Caracteristicas> consultarCaracteristicas(int id ){
        CaracteristicasDAO Dao = new CaracteristicasDAO();
        return Dao.consultarCaracteristicas(id);
    }
    @WebMethod()
    public ArrayList<Caracteristicas> consultarListaCaracteristicas( ){
        CaracteristicasDAO Dao = new CaracteristicasDAO();
        return Dao.listaDeCaracteristicas();
    }
}
