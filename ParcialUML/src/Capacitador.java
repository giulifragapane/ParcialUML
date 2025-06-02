import java.util.Date;

public class Capacitador extends Persona{
    private String especialidad;
    //Relacion
    private Capacitacion capacitacion;

    public Capacitador(String nombre, String dni, String email, Domicilio domicilio, String especialidad) {
        super(nombre, dni, email, domicilio);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    @Override
    public String toString() {
        return "Capacitador{" +
                super.toString() +
                "especialidad='" + especialidad + '\'' +
                '}';
    }
}
