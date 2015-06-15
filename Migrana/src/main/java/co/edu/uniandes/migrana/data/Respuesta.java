package co.edu.uniandes.migrana.data;

import java.math.BigDecimal;
import java.util.Collection;

public class Respuesta {

	private static final long serialVersionUID = 1L;
	private BigDecimal idRespuesta;;
	private String respuesta;
	private RespuestaRegistro idRegistroRespuesta;
	private Pregunta idPregunta;
    
    public Respuesta() {
    }

    public Respuesta(BigDecimal idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public Respuesta(BigDecimal idRespuesta, String respuesta) {
        this.idRespuesta = idRespuesta;
        this.respuesta = respuesta;
    }

    public BigDecimal getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(BigDecimal idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public RespuestaRegistro getIdRegistroRespuesta() {
        return idRegistroRespuesta;
    }

    public void setIdRegistroRespuesta(RespuestaRegistro idRegistroRespuesta) {
        this.idRegistroRespuesta = idRegistroRespuesta;
    }

    public Pregunta getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Pregunta idPregunta) {
        this.idPregunta = idPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRespuesta != null ? idRespuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Respuesta)) {
            return false;
        }
        Respuesta other = (Respuesta) object;
        if ((this.idRespuesta == null && other.idRespuesta != null) || (this.idRespuesta != null && !this.idRespuesta.equals(other.idRespuesta))) {
            return false;
        }
        return true;
    }

}
