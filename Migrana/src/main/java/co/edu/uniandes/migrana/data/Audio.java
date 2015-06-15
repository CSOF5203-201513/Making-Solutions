package co.edu.uniandes.migrana.data;

import java.math.BigDecimal;
import java.util.Collection;



public class Audio {
	
	private BigDecimal idAudio;
	private String binaryAudio;
    private String tipoAudio;
    private Collection<Registro> registroCollection;
    
    public Audio() {
    }

    public Audio(BigDecimal idAudio) {
        this.idAudio = idAudio;
    }

    public Audio(BigDecimal idAudio, String binaryAudio, String tipoAudio) {
        this.idAudio = idAudio;
        this.binaryAudio = binaryAudio;
        this.tipoAudio = tipoAudio;
    }

    public BigDecimal getIdAudio() {
        return idAudio;
    }

    public void setIdAudio(BigDecimal idAudio) {
        this.idAudio = idAudio;
    }

    public String getBinaryAudio() {
        return binaryAudio;
    }

    public void setBinaryAudio(String binaryAudio) {
        this.binaryAudio = binaryAudio;
    }

    public String getTipoAudio() {
        return tipoAudio;
    }

    public void setTipoAudio(String tipoAudio) {
        this.tipoAudio = tipoAudio;
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
        hash += (idAudio != null ? idAudio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Audio)) {
            return false;
        }
        Audio other = (Audio) object;
        if ((this.idAudio == null && other.idAudio != null) || (this.idAudio != null && !this.idAudio.equals(other.idAudio))) {
            return false;
        }
        return true;
    }

    
}
