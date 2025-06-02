import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Capacitacion {
    private String tema;
    private Date fecha;

    //Relaciones
    private Capacitador capacitador;
    private List<Voluntario> voluntarios;

    public Capacitacion(String tema, Date fecha, Capacitador capacitador) {
        this.tema = tema;
        this.fecha = fecha;
        this.capacitador = capacitador;
        capacitador.setCapacitacion(this);
    }

    public void agregarVoluntario(Voluntario voluntario) {
        if(this.voluntarios == null) this.voluntarios = new ArrayList<Voluntario>();
        this.voluntarios.add(voluntario);
        voluntario.setCapacitacion(this);
    }
    public void eliminarVoluntario(Voluntario voluntario) {
        this.voluntarios.remove(voluntario);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Capacitador getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(Capacitador capacitador) {
        this.capacitador = capacitador;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(List<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public void mostrarAsistentes(){
        for (Voluntario voluntario : voluntarios) {
            System.out.println("Nombre: " + voluntario.getNombre());
            System.out.println("DNI: " + voluntario.getDni());
        }
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "tema='" + tema + '\'' +
                ", fecha=" + fecha +
                ", capacitador=" + capacitador +
                ", voluntarios=" + voluntarios +
                '}';
    }
}
