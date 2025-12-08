package co.edu.sena.interfaces;

public interface Reservable {
    // Método para hacer una reserva
    void realizarReserva(String cliente, String fechaHora);

    // Método para cancelar una reserva
    void cancelarReserva(String cliente);

    // Método para verificar si hay disponibilidad
    boolean verificarDisponibilidad(String fechaHora);

    // Método para obtener la capacidad máxima (puede ser útil tanto para clases como para terapias)
    int obtenerCapacidadMaxima();

    // Método para obtener el estado de la reserva
    String obtenerEstadoReserva();
}

