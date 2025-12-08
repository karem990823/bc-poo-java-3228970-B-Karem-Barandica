package co.edu.sena.interfaces;

public interface Pagable {
    // Método para procesar el pago
    void procesarPago(double monto);

    // Método para verificar si el cliente ha pagado
    boolean verificarPago(String cliente);

    // Método para obtener el costo de la clase o servicio
    double obtenerCosto();
}