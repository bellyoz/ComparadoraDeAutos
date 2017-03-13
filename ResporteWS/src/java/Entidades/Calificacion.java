/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bellyoz
 */
@Entity
@Table(name = "calificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calificacion.findAll", query = "SELECT c FROM Calificacion c"),
    @NamedQuery(name = "Calificacion.findByIdClasificacion", query = "SELECT c FROM Calificacion c WHERE c.idClasificacion = :idClasificacion"),
    @NamedQuery(name = "Calificacion.findByIdVehiculo", query = "SELECT c FROM Calificacion c WHERE c.idVehiculo = :idVehiculo"),
    @NamedQuery(name = "Calificacion.findByIdUsuario", query = "SELECT c FROM Calificacion c WHERE c.idUsuario = :idUsuario"),
    @NamedQuery(name = "Calificacion.findByIdComparacion", query = "SELECT c FROM Calificacion c WHERE c.idComparacion = :idComparacion"),
    @NamedQuery(name = "Calificacion.findByComparacion", query = "SELECT c FROM Calificacion c WHERE c.comparacion = :comparacion")})
public class Calificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idClasificacion")
    private Integer idClasificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVehiculo")
    private int idVehiculo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "idUsuario")
    private String idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idComparacion")
    private int idComparacion;
    @Column(name = "comparacion")
    private Integer comparacion;

    public Calificacion() {
    }

    public Calificacion(Integer idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public Calificacion(Integer idClasificacion, int idVehiculo, String idUsuario, int idComparacion, Integer comparacion) {
        this.idClasificacion = idClasificacion;
        this.idVehiculo = idVehiculo;
        this.idUsuario = idUsuario;
        this.idComparacion = idComparacion;
        this.comparacion = comparacion;
    }
    

    public Calificacion(Integer idClasificacion, int idVehiculo, String idUsuario, int idComparacion) {
        this.idClasificacion = idClasificacion;
        this.idVehiculo = idVehiculo;
        this.idUsuario = idUsuario;
        this.idComparacion = idComparacion;
    }

    public Integer getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(Integer idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdComparacion() {
        return idComparacion;
    }

    public void setIdComparacion(int idComparacion) {
        this.idComparacion = idComparacion;
    }

    public Integer getComparacion() {
        return comparacion;
    }

    public void setComparacion(Integer comparacion) {
        this.comparacion = comparacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClasificacion != null ? idClasificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calificacion)) {
            return false;
        }
        Calificacion other = (Calificacion) object;
        if ((this.idClasificacion == null && other.idClasificacion != null) || (this.idClasificacion != null && !this.idClasificacion.equals(other.idClasificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Calificacion[ idClasificacion=" + idClasificacion + " ]";
    }
    
}
