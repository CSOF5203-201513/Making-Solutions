package co.edu.uniandes.migrana.data;

import java.math.BigDecimal;
import java.util.Collection;

public class Pregunta {
	
	private BigDecimal idPregunta;
    private String pregunta;	
    private Collection<Respuesta> respuestaCollection;
    
    public Pregunta() {
    }

    public Pregunta(BigDecimal idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Pregunta(BigDecimal idPregunta, String pregunta) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
    }

    public BigDecimal getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(BigDecimal idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
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
        hash += (idPregunta != null ? idPregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.idPregunta == null && other.idPregunta != null) || (this.idPregunta != null && !this.idPregunta.equals(other.idPregunta))) {
            return false;
        }
        return true;
    }
       
}
