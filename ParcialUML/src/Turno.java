import java.util.Date;

public class Turno {
    private Date fecha;
    private String horario;

    public Turno() {
    }

    public Turno(Date fecha, String horario) {
        this.fecha = fecha;
        this.horario = horario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "fecha=" + fecha +
                ", horario='" + horario + '\'' +
                '}';
    }
}
