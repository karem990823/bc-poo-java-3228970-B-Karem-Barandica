package co.edu.sena.implementaciones;

import co.edu.sena.abstractas.WellnessClass;

// Subclase concreta que extiende la clase abstracta ClaseBienestar
public class MeditationClass extends WellnessClass {
    private String typeMeditacion; // Meditación guiada, mindfulness, trascendental, etc.

    // Constructor que llama al constructor de la clase padre
    public MeditationClass(String nombreClase, int capacidadMaxima, String descripcion, String tipoMeditacion) {
        super(nombreClase, capacidadMaxima, descripcion); // Llamada al constructor padre
        this.typeMeditacion = tipoMeditacion;
    }

    // Implementación del método abstracto
    @Override
    public void realizarClase() {
        System.out.println("Iniciando clase de Meditación (" + typeMeditacion + ")...");
        // Lógica para la clase de meditación, como la concentración, respiración, etc.
        System.out.println("La clase de Meditación está en progreso...");
    }

    // Método para mostrar la información de la clase de Meditación
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método concreto de la clase padre
        System.out.println("Tipo de Meditación: " + typeMeditacion);
    }
}
