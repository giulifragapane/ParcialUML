import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Sector "Frutales"
        Sector sector = new Sector("Frutales", "Sector donde se cultivan frutas");
        //Sector "Aromáticas"
        Sector sector2 = new Sector("Aromáticas", "Sector donde se cultivan aromáticas");

        //Cultivo con 2 cosechas
        Cultivo manzana = new Cultivo("Manzana",  TipoCultivo.FRUTAL, new Date());
        Cultivo jazmin = new Cultivo("Jazmin",  TipoCultivo.AROMATICA, new Date());
        Cosecha cosecha1 = new Cosecha(LocalDate.now(), 1000);
        Cosecha cosecha2 = new Cosecha(LocalDate.now(), 2000);
        manzana.agregarCosecha(cosecha1);
        manzana.agregarCosecha(cosecha2);
        sector.agregarCultivo(manzana);
        sector2.agregarCultivo(jazmin);
        //Un voluntario con 2 tareas realizadas
        Domicilio domicilioV = new Domicilio("Calle 1", "1001", "Capital", "Mendoza");
        Voluntario voluntario = new Voluntario("Juana", "12345678", "juana@gmail.com", domicilioV);

        Tarea tarea1 = new Tarea("Sembrar", new Date(), sector);
        Tarea tarea2 = new Tarea("Cosechar", new Date(), sector2);
        voluntario.realizarTarea(tarea1);
        voluntario.realizarTarea(tarea2);

        //Un turno para el voluntario
        voluntario.getTurno().setFecha(new Date());
        voluntario.getTurno().setHorario("11:00");

        //Un capacitador con una capacitación
        Domicilio domicilioC = new Domicilio("Calle 2", "1002", "Godoy Cruz", "Mendoza");
        Capacitador capacitador = new Capacitador("Mariana", "12345678", "mariana@gmail.com", domicilioC, "Frutales");
        Capacitacion capacitacion = new Capacitacion("Frutales", new Date(), capacitador);
        //La capacitación tiene 2 voluntarios
        capacitacion.agregarVoluntario(voluntario);
           //Un voluntario más
        Domicilio domicilioV2 = new Domicilio("Calle 3", "3003", "Maipu", "Mendoza");
        Voluntario voluntario2 = new Voluntario("Pedro", "12565678", "pedrito@gmail.com", domicilioV2);
        capacitacion.agregarVoluntario(voluntario2);
        voluntario2.getTurno().setFecha(new Date());
        voluntario2.getTurno().setHorario("12:00");

        //Una donación realizada por el donante
        Domicilio domicilioD = new Domicilio("Calle 4", "4004", "Las Heras", "Mendoza");
        Donacion donacion = new Donacion(TipoDonacion.DINERO, "$80000", LocalDate.now());
        Donante donante = new Donante("Emilia", "12125678", "emi@gmail.com", domicilioD);
        donante.agregarDonacion(donacion);

        System.out.println("------DONANTE-------");
        System.out.println(donante);
        System.out.println("-----CAPACITADOR--------");
        System.out.println(capacitador);
        System.out.println("------VOLUNTARIO-------");
        System.out.println(voluntario);
        System.out.println("-------------");
        System.out.println(capacitacion);
        System.out.println("------TAREA 1-------");
        System.out.println(tarea1);
        System.out.println("-----TAREA 2--------");
        System.out.println(tarea2);
        System.out.println("-----DONACIONES--------");
        System.out.println(donacion);
    }
}