/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bellyoz
 */
@Entity
@Table(name = "caracteristicas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caracteristicas.findAll", query = "SELECT c FROM Caracteristicas c"),
    @NamedQuery(name = "Caracteristicas.findByIdCaracteristicas", query = "SELECT c FROM Caracteristicas c WHERE c.idCaracteristicas = :idCaracteristicas"),
    @NamedQuery(name = "Caracteristicas.findByVersion", query = "SELECT c FROM Caracteristicas c WHERE c.version = :version"),
    @NamedQuery(name = "Caracteristicas.findByCombustible", query = "SELECT c FROM Caracteristicas c WHERE c.combustible = :combustible"),
    @NamedQuery(name = "Caracteristicas.findByPotencimax", query = "SELECT c FROM Caracteristicas c WHERE c.potencimax = :potencimax"),
    @NamedQuery(name = "Caracteristicas.findByNocilindros", query = "SELECT c FROM Caracteristicas c WHERE c.nocilindros = :nocilindros"),
    @NamedQuery(name = "Caracteristicas.findByTraccion", query = "SELECT c FROM Caracteristicas c WHERE c.traccion = :traccion"),
    @NamedQuery(name = "Caracteristicas.findByCajacambios", query = "SELECT c FROM Caracteristicas c WHERE c.cajacambios = :cajacambios"),
    @NamedQuery(name = "Caracteristicas.findByNopuertas", query = "SELECT c FROM Caracteristicas c WHERE c.nopuertas = :nopuertas"),
    @NamedQuery(name = "Caracteristicas.findByVolumenmaletero", query = "SELECT c FROM Caracteristicas c WHERE c.volumenmaletero = :volumenmaletero"),
    @NamedQuery(name = "Caracteristicas.findByCapdeposito", query = "SELECT c FROM Caracteristicas c WHERE c.capdeposito = :capdeposito"),
    @NamedQuery(name = "Caracteristicas.findByAceleracion", query = "SELECT c FROM Caracteristicas c WHERE c.aceleracion = :aceleracion"),
    @NamedQuery(name = "Caracteristicas.findByVelmax", query = "SELECT c FROM Caracteristicas c WHERE c.velmax = :velmax"),
    @NamedQuery(name = "Caracteristicas.findByConsumou", query = "SELECT c FROM Caracteristicas c WHERE c.consumou = :consumou"),
    @NamedQuery(name = "Caracteristicas.findByConsumom", query = "SELECT c FROM Caracteristicas c WHERE c.consumom = :consumom"),
    @NamedQuery(name = "Caracteristicas.findByConsumeex", query = "SELECT c FROM Caracteristicas c WHERE c.consumeex = :consumeex"),
    @NamedQuery(name = "Caracteristicas.findByConsumem", query = "SELECT c FROM Caracteristicas c WHERE c.consumem = :consumem"),
    @NamedQuery(name = "Caracteristicas.findByEmisionesco2", query = "SELECT c FROM Caracteristicas c WHERE c.emisionesco2 = :emisionesco2")})
public class Caracteristicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCaracteristicas")
    private Integer idCaracteristicas;
    @Size(max = 100)
    @Column(name = "version")
    private String version;
    @Size(max = 100)
    @Column(name = "combustible")
    private String combustible;
    @Column(name = "potencimax")
    private Integer potencimax;
    @Column(name = "nocilindros")
    private Integer nocilindros;
    @Size(max = 100)
    @Column(name = "traccion")
    private String traccion;
    @Column(name = "cajacambios")
    private Integer cajacambios;
    @Column(name = "nopuertas")
    private Integer nopuertas;
    @Column(name = "volumenmaletero")
    private Integer volumenmaletero;
    @Column(name = "capdeposito")
    private Integer capdeposito;
    @Column(name = "aceleracion")
    private Integer aceleracion;
    @Column(name = "velmax")
    private Integer velmax;
    @Column(name = "consumou")
    private Integer consumou;
    @Column(name = "consumom")
    private Integer consumom;
    @Column(name = "consumeex")
    private Integer consumeex;
    @Column(name = "consumem")
    private Integer consumem;
    @Column(name = "emisionesco2")
    private Integer emisionesco2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caracteristicas")
    private List<DetalleVehiculo> detalleVehiculoList;

    public Caracteristicas() {
    }

    public Caracteristicas(Integer idCaracteristicas, String version, String combustible, Integer potencimax, Integer nocilindros, String traccion, Integer cajacambios, Integer nopuertas, Integer volumenmaletero, Integer capdeposito, Integer aceleracion, Integer velmax, Integer consumou, Integer consumom, Integer consumeex, Integer consumem, Integer emisionesco2) {
        this.idCaracteristicas = idCaracteristicas;
        this.version = version;
        this.combustible = combustible;
        this.potencimax = potencimax;
        this.nocilindros = nocilindros;
        this.traccion = traccion;
        this.cajacambios = cajacambios;
        this.nopuertas = nopuertas;
        this.volumenmaletero = volumenmaletero;
        this.capdeposito = capdeposito;
        this.aceleracion = aceleracion;
        this.velmax = velmax;
        this.consumou = consumou;
        this.consumom = consumom;
        this.consumeex = consumeex;
        this.consumem = consumem;
        this.emisionesco2 = emisionesco2;
        
    }
    
    public Caracteristicas(Integer idCaracteristicas) {
        this.idCaracteristicas = idCaracteristicas;
    }

    public Integer getIdCaracteristicas() {
        return idCaracteristicas;
    }

    public void setIdCaracteristicas(Integer idCaracteristicas) {
        this.idCaracteristicas = idCaracteristicas;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Integer getPotencimax() {
        return potencimax;
    }

    public void setPotencimax(Integer potencimax) {
        this.potencimax = potencimax;
    }

    public Integer getNocilindros() {
        return nocilindros;
    }

    public void setNocilindros(Integer nocilindros) {
        this.nocilindros = nocilindros;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Integer getCajacambios() {
        return cajacambios;
    }

    public void setCajacambios(Integer cajacambios) {
        this.cajacambios = cajacambios;
    }

    public Integer getNopuertas() {
        return nopuertas;
    }

    public void setNopuertas(Integer nopuertas) {
        this.nopuertas = nopuertas;
    }

    public Integer getVolumenmaletero() {
        return volumenmaletero;
    }

    public void setVolumenmaletero(Integer volumenmaletero) {
        this.volumenmaletero = volumenmaletero;
    }

    public Integer getCapdeposito() {
        return capdeposito;
    }

    public void setCapdeposito(Integer capdeposito) {
        this.capdeposito = capdeposito;
    }

    public Integer getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(Integer aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Integer getVelmax() {
        return velmax;
    }

    public void setVelmax(Integer velmax) {
        this.velmax = velmax;
    }

    public Integer getConsumou() {
        return consumou;
    }

    public void setConsumou(Integer consumou) {
        this.consumou = consumou;
    }

    public Integer getConsumom() {
        return consumom;
    }

    public void setConsumom(Integer consumom) {
        this.consumom = consumom;
    }

    public Integer getConsumeex() {
        return consumeex;
    }

    public void setConsumeex(Integer consumeex) {
        this.consumeex = consumeex;
    }

    public Integer getConsumem() {
        return consumem;
    }

    public void setConsumem(Integer consumem) {
        this.consumem = consumem;
    }

    public Integer getEmisionesco2() {
        return emisionesco2;
    }

    public void setEmisionesco2(Integer emisionesco2) {
        this.emisionesco2 = emisionesco2;
    }

    @XmlTransient
    public List<DetalleVehiculo> getDetalleVehiculoList() {
        return detalleVehiculoList;
    }

    public void setDetalleVehiculoList(List<DetalleVehiculo> detalleVehiculoList) {
        this.detalleVehiculoList = detalleVehiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaracteristicas != null ? idCaracteristicas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caracteristicas)) {
            return false;
        }
        Caracteristicas other = (Caracteristicas) object;
        if ((this.idCaracteristicas == null && other.idCaracteristicas != null) || (this.idCaracteristicas != null && !this.idCaracteristicas.equals(other.idCaracteristicas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Caracteristicas[ idCaracteristicas=" + idCaracteristicas + " ]";
    }
    
}
