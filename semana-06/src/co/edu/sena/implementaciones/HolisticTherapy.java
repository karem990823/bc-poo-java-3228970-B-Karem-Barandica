package co.edu.sena.implementaciones;

import co.edu.sena.abstractas.WellnessService;
import co.edu.sena.interfaces.Calificable;
import co.edu.sena.interfaces.Reservable;
import co.edu.sena.interfaces.Pagable;

// Subclase concreta que extiende la clase abstracta ServicioBienestar
public class HolisticTherapy extends WellnessService implements Reservable, Calificable, Pagable {
    private String typeTerapia;
    private int reservasRealizadas;
    private String estadoReserva;

    private int totalCalificaciones;
    private int numeroCalificaciones;

    public HolisticTherapy(String nombreServicio, int duracionMinutos, double costo, String tipoTerapia) {
        super(nombreServicio, duracionMinutos, costo);
        this.typeTerapia = tipoTerapia;
        this.reservasRealizadas = 0;
        this.estadoReserva = "Disponible";
        this.totalCalificaciones = 0;
        this.numeroCalificaciones = 0;
    }

    @Override
    public void brindarServicio() {
        System.out.println("Realizando terapia holística de tipo: " + typeTerapia + "...");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Terapia: " + typeTerapia);
    }

    @Override
    public void realizarReserva(String cliente, String fechaHora) {
        reservasRealizadas++;
        estadoReserva = "Reservada";
        System.out.println("Reserva realizada para " + cliente + " en " + fechaHora);
    }

    @Override
    public void cancelarReserva(String cliente) {
        reservasRealizadas--;
        estadoReserva = "Disponible";
        System.out.println("Reserva cancelada para " + cliente);
    }

    @Override
    public boolean verificarDisponibilidad(String fechaHora) {
        return reservasRealizadas == 0;
    }

    @Override
    public int obtenerCapacidadMaxima() {
        return 1; // Solo se puede reservar una persona por terapia
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
        System.out.println("Pago de $" + monto + " procesado para la terapia holística.");
    }

    @Override
    public boolean verificarPago(String cliente) {
        return true; // Suponemos que el pago siempre es exitoso
    }

    @Override
    public double obtenerCosto() {
        return costo;
    }
}
