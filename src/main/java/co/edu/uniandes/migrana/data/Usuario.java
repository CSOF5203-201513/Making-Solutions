package co.edu.uniandes.migrana.data;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Usuario implements Serializable {

	private String nombreUsuario;
	private Date fechaNacimiento;
    private String genero;
    private String numeroTelefono;
    private String numeroIdentificacion;
    private Collection<Registro> registroCollection;
    
    public Usuario() {
    }

    public Usuario(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Usuario(String numeroIdentificacion, String nombreUsuario, Date fechaNacimiento) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombreUsuario = nombreUsuario;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    
    public Collection<Registro> getRegistroCollection() {
        return registroCollection;
    }

    public void setRegistroCollection(Collection<Registro> registroCollection) {
        this.registroCollection = registroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroIdentificacion != null ? numeroIdentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.numeroIdentificacion == null && other.numeroIdentificacion != null) || (this.numeroIdentificacion != null && !this.numeroIdentificacion.equals(other.numeroIdentificacion))) {
            return false;
        }
        return true;
    }

    
}
    
