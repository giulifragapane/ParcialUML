import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tarea {
    private String descripcion;
    private Date fecha;

    //Relaciones
    private Sector sector;
    private List<Voluntario> voluntarios;

    public Tarea(String descripcion, Date fecha, Sector sector) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.sector = sector;
    }

    public void agregarVoluntario(Voluntario voluntario) {
        if(this.voluntarios == null) this.voluntarios = new ArrayList<Voluntario>();
        this.voluntarios.add(voluntario);
    }

    public void eliminarVoluntario(Voluntario voluntario) {
        this.voluntarios.remove(voluntario);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(List<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", sector=" + sector +
                '}';
    }
}
