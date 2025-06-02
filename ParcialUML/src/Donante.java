import java.util.ArrayList;
import java.util.List;

public class Donante extends Persona {
    //Relaciones
    private List<Donacion> donaciones;

    public Donante(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
    }

    public void agregarDonacion(Donacion donacion) {
        if (this.donaciones == null) this.donaciones = new ArrayList<Donacion>();
        this.donaciones.add(donacion);
        donacion.setDonante(this);
    }

    public void eliminarDonacion(Donacion donacion) {
        this.donaciones.remove(donacion);
    }

    //Imprimir lista de donaciones realizadas por el donante
    public void mostrarDonaciones() {
        for (Donacion donacion : this.donaciones) {
            System.out.println(donacion.toString());
        }
    }

    @Override
    public String toString() {
        return "Donante{" +
                super.toString() +
                "donaciones=" + donaciones +
                '}';
    }
}
