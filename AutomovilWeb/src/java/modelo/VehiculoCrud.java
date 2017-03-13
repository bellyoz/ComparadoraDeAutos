/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.webservice.Caracteristicas;
import com.webservice.DetalleVehiculoPK;
import com.webservice.Vehiculo;
import java.util.List;

/**
 *
 * @author bellyoz
 */
public class VehiculoCrud {
    public static int id = 0;
    public List<Vehiculo> listaDeVehiculo(){
        return consultarListaVehiculo();
    }
    public  List<Vehiculo> vehiculo(int id){
        return consultarVehiculo(id);
    }
    public boolean actualizarVehiculo(int id ,java.lang.String arg0, java.lang.String arg1, java.lang.String arg2){
       
        return actualizarVehiculo_1(id ,arg0, arg1, arg2);
    }
    public boolean insertarVehiculo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2){
        return insertarVehiculo_1(arg0, arg1, arg2);
    }
    public boolean borrarVehiculo(int id){
        return borrarVehiculo_1(id);
    }
    //Caracteristicas
    public List<Caracteristicas> listaDeCaracteristicas(){
        return consultarListaCaracteristicas();
    }
    public  List<Caracteristicas> caracteristica(int id){
        return consultarCaracteristicas(id);
    }
    public boolean actualizarCaracteristicas(int arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, java.lang.String arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16){
       
        return actualizarCaracteristicas_1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
    }
    public boolean insertarCaracteristica(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, java.lang.String arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16){
        return insertarCaracteristicas_1(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
    }
    public boolean borrarCaracteristica(int id){
        return borrarCaracteristicas_1(id);
    }
   
    private static java.util.List<com.webservice.Vehiculo> consultarListaVehiculo() {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.consultarListaVehiculo();
    }

    private static java.util.List<com.webservice.Vehiculo> consultarVehiculo(int arg0) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.consultarVehiculo(arg0);
    }

   


    private static boolean insertarVehiculo_1(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.insertarVehiculo(arg0, arg1, arg2);
    }

    private static boolean actualizarVehiculo_1(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.actualizarVehiculo(arg0, arg1, arg2, arg3);
    }

  

    private static boolean borrarVehiculo_1(int arg0) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.borrarVehiculo(arg0);
    }

   //web caracteristicas



    private static java.util.List<com.webservice.Caracteristicas> consultarListaCaracteristicas() {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.consultarListaCaracteristicas();
    }

    private static java.util.List<com.webservice.Caracteristicas> consultarCaracteristicas(int arg0) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.consultarCaracteristicas(arg0);
    }

   


    private static boolean borrarCaracteristicas_1(int arg0) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.borrarCaracteristicas(arg0);
    }

  

    private static boolean insertarCaracteristicas_1(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3, java.lang.String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.insertarCaracteristicas(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

   

    private static boolean actualizarCaracteristicas_1(int arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, java.lang.String arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.actualizarCaracteristicas(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
    }
    // web detalleVehiculo
    public List<DetalleVehiculoPK> listaDeDetalleVehiculo(){
        return consultarListaDetalleVehiculo();
    }
    public  List<DetalleVehiculoPK> DetalleVehiculo(int id){
        return consultarDetalleVehiculo(id);
    }
    public boolean actualizarDetalleVehiculo(int arg0, int arg1, int arg2){
       
        return actualizarDetalleVehiculo_1(arg0, arg1, arg2);
    }
    public boolean insertarDetalleVehiculo(int arg0, int arg1){
        return insertarDetalleVehiculo_1(arg0, arg1);
    }
    public boolean borrardDetalleVehiculo(int id){
        return borrarDetalleVehiculo(id);
    }
   

    private static java.util.List<com.webservice.DetalleVehiculoPK> consultarListaDetalleVehiculo() {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.consultarListaDetalleVehiculo();
    }

    private static java.util.List<com.webservice.DetalleVehiculoPK> consultarDetalleVehiculo(int arg0) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.consultarDetalleVehiculo(arg0);
    }

    private static boolean borrarDetalleVehiculo(int arg0) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.borrarDetalleVehiculo(arg0);
    }

    private static boolean insertarDetalleVehiculo_1(int arg0, int arg1) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.insertarDetalleVehiculo(arg0, arg1);
    }

    private static boolean actualizarDetalleVehiculo_1(int arg0, int arg1, int arg2) {
        com.webservice.AutomovilWS_Service service = new com.webservice.AutomovilWS_Service();
        com.webservice.AutomovilWS port = service.getAutomovilWSPort();
        return port.actualizarDetalleVehiculo(arg0, arg1, arg2);
    }

   
   
    
}
