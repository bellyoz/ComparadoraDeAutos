
package com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detalleVehiculoPK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detalleVehiculoPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoCaracteristicas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codigoVehiculo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idDetalleVehiculo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleVehiculoPK", propOrder = {
    "codigoCaracteristicas",
    "codigoVehiculo",
    "idDetalleVehiculo"
})
public class DetalleVehiculoPK {

    protected int codigoCaracteristicas;
    protected int codigoVehiculo;
    protected int idDetalleVehiculo;

    /**
     * Gets the value of the codigoCaracteristicas property.
     * 
     */
    public int getCodigoCaracteristicas() {
        return codigoCaracteristicas;
    }

    /**
     * Sets the value of the codigoCaracteristicas property.
     * 
     */
    public void setCodigoCaracteristicas(int value) {
        this.codigoCaracteristicas = value;
    }

    /**
     * Gets the value of the codigoVehiculo property.
     * 
     */
    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    /**
     * Sets the value of the codigoVehiculo property.
     * 
     */
    public void setCodigoVehiculo(int value) {
        this.codigoVehiculo = value;
    }

    /**
     * Gets the value of the idDetalleVehiculo property.
     * 
     */
    public int getIdDetalleVehiculo() {
        return idDetalleVehiculo;
    }

    /**
     * Sets the value of the idDetalleVehiculo property.
     * 
     */
    public void setIdDetalleVehiculo(int value) {
        this.idDetalleVehiculo = value;
    }

}
