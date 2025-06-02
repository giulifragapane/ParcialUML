import java.time.LocalDate;

public class Cosecha {
    private LocalDate fecha;
    private double cantidadKg;
    //Relaciones
    private Cultivo cultivo;

    public Cosecha(LocalDate fecha, double cantidadKg) {
        this.fecha = fecha;
        this.cantidadKg = cantidadKg;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCantidadKg() {
        return cantidadKg;
    }

    public void setCantidadKg(double cantidadKg) {
        this.cantidadKg = cantidadKg;
    }

    public Cultivo getCultivo() {
        return cultivo;
    }

    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    @Override
    public String toString() {
        return "Cosecha{" +
                "fecha=" + fecha +
                ", cantidadKg=" + cantidadKg +
                '}';
    }
}
