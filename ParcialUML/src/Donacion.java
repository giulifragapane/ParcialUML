import java.time.LocalDate;

public class Donacion {
    private TipoDonacion tipo;
    private String descripcion;
    private LocalDate fecha;
    //Relacion
    private Donante donante;
    public Donacion(TipoDonacion tipo, String descripcion, LocalDate fecha) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public TipoDonacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDonacion tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Donante getDonante() {
        return donante;
    }

    public void setDonante(Donante donante) {
        this.donante = donante;
    }

    @Override
    public String toString() {
        return "Donacion{" +
                "tipo=" + tipo +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
