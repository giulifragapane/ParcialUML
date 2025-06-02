import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cultivo {
    private String especie;
    private TipoCultivo tipo;
    private Date fechaSiembra;

    //Relaciones
    private List<Cosecha> cosechas;

    public Cultivo(String especie, TipoCultivo tipo, Date fechaSiembra) {
        this.especie = especie;
        this.tipo = tipo;
        this.fechaSiembra = fechaSiembra;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoCultivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoCultivo tipo) {
        this.tipo = tipo;
    }

    public Date getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(Date fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public List<Cosecha> getCosechas() {
        return cosechas;
    }

    public void setCosechas(List<Cosecha> cosechas) {
        this.cosechas = cosechas;
    }

    public void agregarCosecha(Cosecha cosecha) {
        if(this.cosechas == null) this.cosechas = new ArrayList<Cosecha>();
        this.cosechas.add(cosecha);
        cosecha.setCultivo(this);
    }

    public void eliminarCosecha(Cosecha cosecha) {
        this.cosechas.remove(cosecha);
    }

    @Override
    public String toString() {
        return "Cultivo{" +
                "especie='" + especie + '\'' +
                ", tipo=" + tipo +
                ", fechaSiembra=" + fechaSiembra +
                ", cosechas=" + cosechas +
                '}';
    }
}
