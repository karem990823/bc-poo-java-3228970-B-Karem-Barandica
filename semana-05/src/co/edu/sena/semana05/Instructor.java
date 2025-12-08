package co.edu.sena.semana05;


public class Instructor extends Person {
    private String especialidad;
    private String horario;

    public Instructor(String nombre, String direccion, String email, int identificacion, int edad, String especialidad, String horario) {
        super(nombre, direccion, email, identificacion, edad); // Llamada al constructor de Persona
        this.especialidad = especialidad;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidad: " + especialidad + ", Horario: " + horario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this.toString()); // Llamamos al toString() sobrescrito
    }

    // Sobrescribir el método inscribirEnActividad para los instructores
    @Override
    public void inscribirEnActividad(String actividad) {
        // Los instructores se inscriben en actividades especiales como "enseñar"
        System.out.println(name + " ha sido asignado para enseñar la actividad: " + actividad);
    }

    // Método adicional: mostrar especialidad
    public void mostrarEspecialidad() {
        System.out.println(name + " es especialista en: " + especialidad);
    }
}
