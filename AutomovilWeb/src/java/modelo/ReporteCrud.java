/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import web.service.Calificacion;

/**
 *
 * @author bellyoz
 */
public class ReporteCrud {

    public boolean insertarReporte(int arg0, java.lang.String arg1, int arg2, int arg3){
        return insertarClasificacion(arg0, arg1, arg2, arg3);
    }
    public int indice(){
        int rta = 0;
        List<Calificacion> cal = consultarListaClasificacion();
        ArrayList<Integer> entero = new ArrayList<>();
        for (int i = 0; i < cal.size(); i++) {
            entero.add(cal.get(i).getIdComparacion());
        }
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(entero, comparador);
        
        if(cal.isEmpty()){
            rta = 1;
        }else{
          
        rta = entero.get(0)+1;
            System.out.println("rta "+rta);
        }
        return rta;
    }
    public ArrayList<Integer> ids(){
        int rta = 0;
        List<Calificacion> cal = consultarListaClasificacion();
        ArrayList<Integer> entero = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        for (int i = 0; i < cal.size(); i++) {
            entero.add(cal.get(i).getIdComparacion());
        }
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(entero, comparador);
        for (int i = 0; i < entero.size(); i++) {
            if(cal.get(i).getIdComparacion() == entero.get(0)){
                id.add(cal.get(i).getIdClasificacion());
                System.out.println("cal.get(i).getIdComparacion() :"+cal.get(i).getIdClasificacion());
            }
        }
       
        return id;
    }
    public boolean actualizarCalificacion(int arg0, int arg1, java.lang.String arg2, int arg3, int arg4){
        return actualizarVehiculo(arg0, arg1, arg2, arg3, arg4);
    }
    public java.util.List<web.service.Calificacion> listadeCalificacion(){
        return consultarListaClasificacion();
    }
   

    private static java.util.List<web.service.Calificacion> consultarClasificacion(int arg0) {
        web.service.ResporteWS_Service service = new web.service.ResporteWS_Service();
        web.service.ResporteWS port = service.getResporteWSPort();
        return port.consultarClasificacion(arg0);
    }

    private static java.util.List<web.service.Calificacion> consultarListaClasificacion() {
        web.service.ResporteWS_Service service = new web.service.ResporteWS_Service();
        web.service.ResporteWS port = service.getResporteWSPort();
        return port.consultarListaClasificacion();
    }

    private static boolean insertarClasificacion(int arg0, java.lang.String arg1, int arg2, int arg3) {
        web.service.ResporteWS_Service service = new web.service.ResporteWS_Service();
        web.service.ResporteWS port = service.getResporteWSPort();
        return port.insertarClasificacion(arg0, arg1, arg2, arg3);
    }

    private static boolean actualizarVehiculo(int arg0, int arg1, java.lang.String arg2, int arg3, int arg4) {
        web.service.ResporteWS_Service service = new web.service.ResporteWS_Service();
        web.service.ResporteWS port = service.getResporteWSPort();
        return port.actualizarVehiculo(arg0, arg1, arg2, arg3, arg4);
    }
    
}
