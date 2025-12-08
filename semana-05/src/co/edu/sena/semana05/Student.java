package co.edu.sena.semana05;
public class Student extends Person {
    private int clasesActivas;
    private boolean activo;

    public Student(String nombre, String direccion, String email, int identificacion, int edad, int clasesActivas, boolean activo) {
        super(nombre, direccion, email, identificacion, edad); // Llamada al constructor de Persona
        this.clasesActivas = clasesActivas;
        this.activo = activo;
    }

    // Sobrescribir el método para mostrar la información
    @Override
    public String toString() {
        return super.toString() + ", Clases activas: " + clasesActivas + ", Estado: " + (activo ? "ACTIVO" : "INACTIVO");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this.toString()); // Llamamos al toString() sobrescrito
    }


    // Sobrescribir el método inscribirEnActividad para los estudiantes
    @Override
    public void inscribirEnActividad(String actividad) {
        // Los estudiantes son inscritos a actividades académicas
        if (activo) {
            System.out.println(name + " ha sido inscrito en la actividad académica: " + actividad);
        } else {
            System.out.println(name + " no está activo, no puede ser inscrito en la actividad: " + actividad);
        }
    }

    // Método adicional: mostrar si el estudiante está activo
    public void mostrarEstadoActivo() {
        if (activo) {
            System.out.println(name + " está activo en el sistema.");
        } else {
            System.out.println(name + " no está activo en el sistema.");
        }
    }
}
