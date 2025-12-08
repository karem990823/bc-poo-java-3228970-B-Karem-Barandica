package co.edu.sena.interfaces;

public interface Calificable {
    // Método para calificar una clase o servicio
    void calificar(int puntuacion);

    // Método para obtener la calificación promedio de la clase o servicio
    double obtenerCalificacionPromedio();

    // Método para obtener el total de calificaciones
    int obtenerTotalCalificaciones();
}