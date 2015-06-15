package co.edu.uniandes.migrana.data;

import java.math.BigDecimal;
import java.util.Collection;

public class RespuestaRegistro {
	
	private BigDecimal idRegistroRespuesta;
	private String textoOtro;
	private Registro idRegistro;
	private Collection<Respuesta> respuestaCollection;
	
    public RespuestaRegistro() {
    }

    public RespuestaRegistro(BigDecimal idRegistroRespuesta) {
        this.idRegistroRespuesta = idRegistroRespuesta;
    }

    public BigDecimal getIdRegistroRespuesta() {
        return idRegistroRespuesta;
    }

    public void setIdRegistroRespuesta(BigDecimal idRegistroRespuesta) {
        this.idRegistroRespuesta = idRegistroRespuesta;
    }

    public String getTextoOtro() {
        return textoOtro;
    }

    public void setTextoOtro(String textoOtro) {
        this.textoOtro = textoOtro;
    }

    public Registro getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Registro idRegistro) {
        this.idRegistro = idRegistro;
    }
    
    public Collection<Respuesta> getRespuestaCollection() {
        return respuestaCollection;
    }

    public void setRespuestaCollection(Collection<Respuesta> respuestaCollection) {
        this.respuestaCollection = respuestaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistroRespuesta != null ? idRegistroRespuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespuestaRegistro)) {
            return false;
        }
        RespuestaRegistro other = (RespuestaRegistro) object;
        if ((this.idRegistroRespuesta == null && other.idRegistroRespuesta != null) || (this.idRegistroRespuesta != null && !this.idRegistroRespuesta.equals(other.idRegistroRespuesta))) {
            return false;
        }
        return true;
    }

    
}
	
