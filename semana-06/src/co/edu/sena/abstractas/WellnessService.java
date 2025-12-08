package co.edu.sena.abstractas;

import co.edu.sena.semana05.Person;

// Clase abstracta
public abstract class WellnessService {
    // Atributos protegidos
    protected String nombreServicio;
    protected int duracionMinutos; // Duración en minutos
    protected double costo;

    // Constructor que inicializa los atributos
    public WellnessService(String nombreServicio, int duracionMinutos, double costo) {
        this.nombreServicio = nombreServicio;
        this.duracionMinutos = duracionMinutos;
        this.costo = costo;
    }

    // Método abstracto: las subclases deben implementarlo
    public abstract void brindarServicio();

    // Método concreto que muestra información común de todos los servicios
    public void mostrarInformacion() {
        System.out.println("Servicio: " + nombreServicio);
        System.out.println("Duración: " + duracionMinutos + " minutos");
        System.out.println("Costo: $" + costo);
    }
}

