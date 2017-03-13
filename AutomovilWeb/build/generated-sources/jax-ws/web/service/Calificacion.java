
package web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calificacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calificacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idClasificacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idComparacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idVehiculo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calificacion", propOrder = {
    "comparacion",
    "idClasificacion",
    "idComparacion",
    "idUsuario",
    "idVehiculo"
})
public class Calificacion {

    protected Integer comparacion;
    protected Integer idClasificacion;
    protected int idComparacion;
    protected String idUsuario;
    protected int idVehiculo;

    /**
     * Gets the value of the comparacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComparacion() {
        return comparacion;
    }

    /**
     * Sets the value of the comparacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComparacion(Integer value) {
        this.comparacion = value;
    }

    /**
     * Gets the value of the idClasificacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClasificacion() {
        return idClasificacion;
    }

    /**
     * Sets the value of the idClasificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClasificacion(Integer value) {
        this.idClasificacion = value;
    }

    /**
     * Gets the value of the idComparacion property.
     * 
     */
    public int getIdComparacion() {
        return idComparacion;
    }

    /**
     * Sets the value of the idComparacion property.
     * 
     */
    public void setIdComparacion(int value) {
        this.idComparacion = value;
    }

    /**
     * Gets the value of the idUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the idVehiculo property.
     * 
     */
    public int getIdVehiculo() {
        return idVehiculo;
    }

    /**
     * Sets the value of the idVehiculo property.
     * 
     */
    public void setIdVehiculo(int value) {
        this.idVehiculo = value;
    }

}
