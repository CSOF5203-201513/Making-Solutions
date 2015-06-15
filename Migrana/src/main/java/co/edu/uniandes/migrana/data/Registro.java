package co.edu.uniandes.migrana.data;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

public class Registro {

	private static final long serialVersionUID = 1L;
    private BigDecimal idRegistro;
    private Date fechaRegistro;
    private Usuario numeroIdentificacion;
    private Collection<RespuestaRegistro> respuestaRegistroCollection;
    private Audio idAudio;
	
    public Registro() {
    }

    public Registro(BigDecimal idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Registro(BigDecimal idRegistro, Date fechaRegistro) {
        this.idRegistro = idRegistro;
        this.fechaRegistro = fechaRegistro;
    }

    public BigDecimal getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(BigDecimal idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Usuario getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Usuario numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Audio getIdAudio() {
        return idAudio;
    }

    public void setIdAudio(Audio idAudio) {
        this.idAudio = idAudio;
    }
    
    public Collection<RespuestaRegistro> getRespuestaRegistroCollection() {
        return respuestaRegistroCollection;
    }

    public void setRespuestaRegistroCollection(Collection<RespuestaRegistro> respuestaRegistroCollection) {
        this.respuestaRegistroCollection = respuestaRegistroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }
    
}
