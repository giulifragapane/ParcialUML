import java.util.ArrayList;
import java.util.List;

public class Sector {
    private String nombre;
    private String descripcion;

    //Relaciones
    private List<Cultivo> cultivos;
    private Tarea tarea;

    public Sector(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void agregarCultivo(Cultivo cultivo) {
        if(this.cultivos == null) this.cultivos = new ArrayList<Cultivo>();
        this.cultivos.add(cultivo);
    }

    public void eliminarCultivo(Cultivo cultivo) {
        this.cultivos.remove(cultivo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public List<Cosecha> getCosechasDelSector() {
        List<Cosecha> cosechas = new ArrayList<Cosecha>();
        for (Cultivo cultivo : this.cultivos) {
            cosechas.addAll(cultivo.getCosechas());
        }
        return cosechas;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cultivos=" + cultivos +
                '}';
    }
}
