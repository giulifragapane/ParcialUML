import java.util.ArrayList;
import java.util.List;

public class Voluntario extends Persona {

    //Relacion
    private List<Tarea> tareasRealizadas;
    private Turno turno;
    private Capacitacion capacitacion;

    public Voluntario(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
        this.turno = new Turno();
    }

    public void realizarTarea(Tarea tarea) {
        if(this.tareasRealizadas == null) this.tareasRealizadas = new ArrayList<>();
        this.tareasRealizadas.add(tarea);
        tarea.agregarVoluntario(this);
    }

    public void eliminarTareaRealizada(Tarea tarea) {
        this.tareasRealizadas.remove(tarea);
    }

    public List<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(List<Tarea> tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                super.toString() +
                "tareasRealizadas=" + tareasRealizadas +
                ", turno=" + turno +
                '}';
    }
}
