/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.Service;

import Entidades.Calificacion;
import Modelo.Reporte;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author bellyoz
 */
@WebService(serviceName = "ResporteWS")
public class ResporteWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod()
    public boolean insertarClasificacion(int idVehiculo , String idUsuario , int idComparacion , int comparacion){
        Reporte re = new Reporte();
        return re.insertarCalificacion(new Calificacion(null, idVehiculo, idUsuario, idComparacion, comparacion));
    }   
    @WebMethod()
    public ArrayList<Calificacion> consultarClasificacion(int id ){
        Reporte re = new Reporte();
        return re.consultarCalificacion(id);
    }
     @WebMethod()
    public boolean actualizarVehiculo(int id ,int idVehiculo , String idUsuario , int idComparacion , int comparacion){
         Reporte re = new Reporte();
        return re.actualizarVehiculo(id, new Calificacion(idComparacion, idVehiculo, idUsuario, idComparacion, comparacion));
    }
    @WebMethod()
    public ArrayList<Calificacion> consultarListaClasificacion( ){
        Reporte re = new Reporte();
        return re.listaDeCalificacion();
    }
}
