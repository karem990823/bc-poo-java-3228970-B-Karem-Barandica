package co.edu.sena.implementaciones;

import co.edu.sena.abstractas.WellnessClass;
import co.edu.sena.interfaces.Calificable;
import co.edu.sena.interfaces.Reservable;
import co.edu.sena.interfaces.Pagable;

// Subclase concreta que extiende la clase abstracta ClaseBienestar
public class YogaClass extends WellnessClass implements Reservable, Calificable, Pagable {
    private String typeYoga; // Hatha, Vinyasa, Ashtanga, etc.
    private int reservasRealizadas;
    private String estadoReserva;

    private int totalCalificaciones;
    private int numeroCalificaciones;
    private double montoClase;

    public YogaClass(String nombreClase, int capacidadMaxima, String descripcion, String tipoYoga, double montoClase) {
        super(nombreClase, capacidadMaxima, descripcion);
        this.typeYoga = tipoYoga;
        this.montoClase = montoClase;
        this.reservasRealizadas = 0;
        this.estadoReserva = "Disponible";
        this.totalCalificaciones = 0;
        this.numeroCalificaciones = 0;
    }

    @Override
    public void realizarClase() {
        System.out.println("Iniciando clase de Yoga (" + typeYoga + ")...");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Yoga: " + typeYoga);
        System.out.println("Costo: $" + montoClase);
    }

    @Override
    public void realizarReserva(String cliente, String fechaHora) {
        if (reservasRealizadas < maxCapacity) {
            reservasRealizadas++;
            estadoReserva = "Reservada";
            System.out.println("Reserva realizada para " + cliente + " en " + fechaHora);
        } else {
            System.out.println("No hay disponibilidad para la clase en este horario.");
        }
    }

    @Override
    public void cancelarReserva(String cliente) {
        if (estadoReserva.equals("Reservada")) {
            reservasRealizadas--;
            estadoReserva = "Disponible";
            System.out.println("Reserva cancelada para " + cliente);
        }
    }

    @Override
    public boolean verificarDisponibilidad(String fechaHora) {
        return reservasRealizadas < maxCapacity;
    }

    @Override
    public int obtenerCapacidadMaxima() {
        return maxCapacity;
    }

    @Override
    public String obtenerEstadoReserva() {
        return estadoReserva;
    }

    @Override
    public void calificar(int puntuacion) {
        totalCalificaciones += puntuacion;
        numeroCalificaciones++;
    }

    @Override
    public double obtenerCalificacionPromedio() {
        return numeroCalificaciones == 0 ? 0 : (double) totalCalificaciones / numeroCalificaciones;
    }

    @Override
    public int obtenerTotalCalificaciones() {
        return numeroCalificaciones;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado para la clase de Yoga.");
    }

    @Override
    public boolean verificarPago(String cliente) {
        System.out.println("Verificando pago de " + cliente);
        return true; // Suponemos que el pago siempre es exitoso
    }

    @Override
    public double obtenerCosto() {
        return montoClase;
    }
}
