package co.edu.sena.semana05;

public class Person {
    protected String name;
    protected String direccion;
    protected String email;
    protected int identificacion;
    private int edad;

    // Constructor
    public Person(String name, String direccion, String email, int identificacion, int edad) {
        this.name = name;
        this.direccion = direccion;
        this.email = email;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    // Método para mostrar la información general
    public void mostrarInformacion() {
        System.out.println("Nombre: " + name);
        System.out.println("Direccion: " + direccion);
        System.out.println("Email: " + email);
        System.out.println("Identificacion: " + identificacion);
    }
    @Override
    public String toString() {
        return "Nombre: " + name + ", Dirección: " + direccion + ", Email: " + email + ", Identificación: " + identificacion + ", Edad: " + edad;
    }


    // Método para determinar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18; // Regresa true si la persona tiene 18 años o más
    }

    // Método para inscribir en una actividad
    public void inscribirEnActividad(String actividad) {
        System.out.println(name + " ha sido inscrito en la actividad: " + actividad);
    }
}
