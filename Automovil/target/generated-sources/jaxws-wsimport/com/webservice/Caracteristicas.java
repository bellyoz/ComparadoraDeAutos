
package com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for caracteristicas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="caracteristicas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aceleracion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cajacambios" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="capdeposito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="combustible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumeex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consumem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consumom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consumou" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="emisionesco2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idCaracteristicas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nocilindros" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nopuertas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="potencimax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="traccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="velmax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumenmaletero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "caracteristicas", propOrder = {
    "aceleracion",
    "cajacambios",
    "capdeposito",
    "combustible",
    "consumeex",
    "consumem",
    "consumom",
    "consumou",
    "emisionesco2",
    "idCaracteristicas",
    "nocilindros",
    "nopuertas",
    "potencimax",
    "traccion",
    "velmax",
    "version",
    "volumenmaletero"
})
public class Caracteristicas {

    protected Integer aceleracion;
    protected Integer cajacambios;
    protected Integer capdeposito;
    protected String combustible;
    protected Integer consumeex;
    protected Integer consumem;
    protected Integer consumom;
    protected Integer consumou;
    protected Integer emisionesco2;
    protected Integer idCaracteristicas;
    protected Integer nocilindros;
    protected Integer nopuertas;
    protected Integer potencimax;
    protected String traccion;
    protected Integer velmax;
    protected String version;
    protected Integer volumenmaletero;

    /**
     * Gets the value of the aceleracion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAceleracion() {
        return aceleracion;
    }

    /**
     * Sets the value of the aceleracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAceleracion(Integer value) {
        this.aceleracion = value;
    }

    /**
     * Gets the value of the cajacambios property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCajacambios() {
        return cajacambios;
    }

    /**
     * Sets the value of the cajacambios property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCajacambios(Integer value) {
        this.cajacambios = value;
    }

    /**
     * Gets the value of the capdeposito property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapdeposito() {
        return capdeposito;
    }

    /**
     * Sets the value of the capdeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapdeposito(Integer value) {
        this.capdeposito = value;
    }

    /**
     * Gets the value of the combustible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * Sets the value of the combustible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombustible(String value) {
        this.combustible = value;
    }

    /**
     * Gets the value of the consumeex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsumeex() {
        return consumeex;
    }

    /**
     * Sets the value of the consumeex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsumeex(Integer value) {
        this.consumeex = value;
    }

    /**
     * Gets the value of the consumem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsumem() {
        return consumem;
    }

    /**
     * Sets the value of the consumem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsumem(Integer value) {
        this.consumem = value;
    }

    /**
     * Gets the value of the consumom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsumom() {
        return consumom;
    }

    /**
     * Sets the value of the consumom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsumom(Integer value) {
        this.consumom = value;
    }

    /**
     * Gets the value of the consumou property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsumou() {
        return consumou;
    }

    /**
     * Sets the value of the consumou property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsumou(Integer value) {
        this.consumou = value;
    }

    /**
     * Gets the value of the emisionesco2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmisionesco2() {
        return emisionesco2;
    }

    /**
     * Sets the value of the emisionesco2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmisionesco2(Integer value) {
        this.emisionesco2 = value;
    }

    /**
     * Gets the value of the idCaracteristicas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCaracteristicas() {
        return idCaracteristicas;
    }

    /**
     * Sets the value of the idCaracteristicas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCaracteristicas(Integer value) {
        this.idCaracteristicas = value;
    }

    /**
     * Gets the value of the nocilindros property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNocilindros() {
        return nocilindros;
    }

    /**
     * Sets the value of the nocilindros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNocilindros(Integer value) {
        this.nocilindros = value;
    }

    /**
     * Gets the value of the nopuertas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNopuertas() {
        return nopuertas;
    }

    /**
     * Sets the value of the nopuertas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNopuertas(Integer value) {
        this.nopuertas = value;
    }

    /**
     * Gets the value of the potencimax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPotencimax() {
        return potencimax;
    }

    /**
     * Sets the value of the potencimax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPotencimax(Integer value) {
        this.potencimax = value;
    }

    /**
     * Gets the value of the traccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraccion() {
        return traccion;
    }

    /**
     * Sets the value of the traccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraccion(String value) {
        this.traccion = value;
    }

    /**
     * Gets the value of the velmax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelmax() {
        return velmax;
    }

    /**
     * Sets the value of the velmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelmax(Integer value) {
        this.velmax = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the volumenmaletero property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVolumenmaletero() {
        return volumenmaletero;
    }

    /**
     * Sets the value of the volumenmaletero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVolumenmaletero(Integer value) {
        this.volumenmaletero = value;
    }

}
