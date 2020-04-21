package edesur.t1.srv.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.RoundingMode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "codCalle",
        "nomCalle",
        "altura",
        "piso",
        "depto",
        "partido",
        "localidad"
})

public class DirSumResponse {
    @Size(max=6)
    private String codCalle;

    @Size(max = 25)
    @NotNull
    private String nomCalle;

    @Size(max = 5)
    @NotNull
    private String altura;

    @Size(max=6)
    private String piso;

    @Size(max=6)
    private String depto;

    @Size(max=25)
    private String partido;

    @Size(max=25)
    private String localidad;


    public void setCodCalle(String codCalle){this.codCalle = codCalle; }
    public String getCodCallle(){ return this.codCalle;}

    public void setNomCalle(String nomCalle){this.nomCalle = nomCalle; }
    public String getNomCallle(){ return this.nomCalle;}

    public void setAltura(String altura){this.altura = altura; }
    public String getAltura(){ return this.altura;}

    public void setPiso(String piso){this.piso = piso; }
    public String getPiso(){ return this.piso;}

    public void setDepto(String depto){this.depto = depto; }
    public String getDepto(){ return this.depto;}

    public void setPartido(String partido){this.partido = partido; }
    public String getPartido(){ return this.partido;}

    public void setLocalidad(String localidad){this.localidad = localidad; }
    public String getLocalidad(){ return this.localidad;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DirSumResponse{");
        sb.append("codCalle='").append(codCalle).append('\'');
        sb.append(", nomCalle='").append(nomCalle).append('\'');
        sb.append(", altura='").append(altura).append('\'');
        sb.append(", piso='").append(piso).append('\'');
        sb.append(", depto='").append(depto).append('\'');
        sb.append(", partido='").append(partido).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
