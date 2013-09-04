/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ascuntar.prestamos.dm.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "tbl_inversiones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inversiones.findAll", query = "SELECT i FROM Inversiones i"),
    @NamedQuery(name = "Inversiones.findById", query = "SELECT i FROM Inversiones i WHERE i.id = :id"),
    @NamedQuery(name = "Inversiones.findByMontoInvertido", query = "SELECT i FROM Inversiones i WHERE i.montoInvertido = :montoInvertido"),
    @NamedQuery(name = "Inversiones.findByFechaInversion", query = "SELECT i FROM Inversiones i WHERE i.fechaInversion = :fechaInversion")})
public class Inversiones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_invertido")
    private int montoInvertido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inversion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInversion;
    @JoinColumn(name = "id_socio", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Socio idSocio;

    public Inversiones() {
    }

    public Inversiones(Integer id) {
        this.id = id;
    }

    public Inversiones(Integer id, int montoInvertido, Date fechaInversion) {
        this.id = id;
        this.montoInvertido = montoInvertido;
        this.fechaInversion = fechaInversion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMontoInvertido() {
        return montoInvertido;
    }

    public void setMontoInvertido(int montoInvertido) {
        this.montoInvertido = montoInvertido;
    }

    public Date getFechaInversion() {
        return fechaInversion;
    }

    public void setFechaInversion(Date fechaInversion) {
        this.fechaInversion = fechaInversion;
    }

    public Socio getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Socio idSocio) {
        this.idSocio = idSocio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inversiones)) {
            return false;
        }
        Inversiones other = (Inversiones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ascuntar.prestamos.dm.entidades.Inversiones[ id=" + id + " ]";
    }
    
}
