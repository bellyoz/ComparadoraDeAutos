/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author bellyoz
 */
@Embeddable
public class DetalleVehiculoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idDetalleVehiculo")
    private int idDetalleVehiculo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoVehiculo")
    private int codigoVehiculo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoCaracteristicas")
    private int codigoCaracteristicas;

    public DetalleVehiculoPK() {
    }

    public DetalleVehiculoPK(int idDetalleVehiculo, int codigoVehiculo, int codigoCaracteristicas) {
        this.idDetalleVehiculo = idDetalleVehiculo;
        this.codigoVehiculo = codigoVehiculo;
        this.codigoCaracteristicas = codigoCaracteristicas;
    }

    public int getIdDetalleVehiculo() {
        return idDetalleVehiculo;
    }

    public void setIdDetalleVehiculo(int idDetalleVehiculo) {
        this.idDetalleVehiculo = idDetalleVehiculo;
    }

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public int getCodigoCaracteristicas() {
        return codigoCaracteristicas;
    }

    public void setCodigoCaracteristicas(int codigoCaracteristicas) {
        this.codigoCaracteristicas = codigoCaracteristicas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idDetalleVehiculo;
        hash += (int) codigoVehiculo;
        hash += (int) codigoCaracteristicas;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVehiculoPK)) {
            return false;
        }
        DetalleVehiculoPK other = (DetalleVehiculoPK) object;
        if (this.idDetalleVehiculo != other.idDetalleVehiculo) {
            return false;
        }
        if (this.codigoVehiculo != other.codigoVehiculo) {
            return false;
        }
        if (this.codigoCaracteristicas != other.codigoCaracteristicas) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DetalleVehiculoPK[ idDetalleVehiculo=" + idDetalleVehiculo + ", codigoVehiculo=" + codigoVehiculo + ", codigoCaracteristicas=" + codigoCaracteristicas + " ]";
    }
    
}
