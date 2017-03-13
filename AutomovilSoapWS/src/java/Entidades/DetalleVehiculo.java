/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bellyoz
 */
@Entity
@Table(name = "detalleVehiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleVehiculo.findAll", query = "SELECT d FROM DetalleVehiculo d"),
    @NamedQuery(name = "DetalleVehiculo.findByIdDetalleVehiculo", query = "SELECT d FROM DetalleVehiculo d WHERE d.detalleVehiculoPK.idDetalleVehiculo = :idDetalleVehiculo"),
    @NamedQuery(name = "DetalleVehiculo.findByCodigoVehiculo", query = "SELECT d FROM DetalleVehiculo d WHERE d.detalleVehiculoPK.codigoVehiculo = :codigoVehiculo"),
    @NamedQuery(name = "DetalleVehiculo.findByCodigoCaracteristicas", query = "SELECT d FROM DetalleVehiculo d WHERE d.detalleVehiculoPK.codigoCaracteristicas = :codigoCaracteristicas")})
public class DetalleVehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleVehiculoPK detalleVehiculoPK;
    @JoinColumn(name = "codigoCaracteristicas", referencedColumnName = "idCaracteristicas", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Caracteristicas caracteristicas;
    @JoinColumn(name = "codigoVehiculo", referencedColumnName = "idVehiculo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Vehiculo vehiculo;

    public DetalleVehiculo() {
    }

    public DetalleVehiculo(DetalleVehiculoPK detalleVehiculoPK) {
        this.detalleVehiculoPK = detalleVehiculoPK;
    }

    public DetalleVehiculo(int idDetalleVehiculo, int codigoVehiculo, int codigoCaracteristicas) {
        this.detalleVehiculoPK = new DetalleVehiculoPK(idDetalleVehiculo, codigoVehiculo, codigoCaracteristicas);
    }

    public DetalleVehiculoPK getDetalleVehiculoPK() {
        return detalleVehiculoPK;
    }

    public void setDetalleVehiculoPK(DetalleVehiculoPK detalleVehiculoPK) {
        this.detalleVehiculoPK = detalleVehiculoPK;
    }

    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleVehiculoPK != null ? detalleVehiculoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVehiculo)) {
            return false;
        }
        DetalleVehiculo other = (DetalleVehiculo) object;
        if ((this.detalleVehiculoPK == null && other.detalleVehiculoPK != null) || (this.detalleVehiculoPK != null && !this.detalleVehiculoPK.equals(other.detalleVehiculoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DetalleVehiculo[ detalleVehiculoPK=" + detalleVehiculoPK + " ]";
    }
    
}
