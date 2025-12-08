package co.edu.sena.semana04;

public class Persona {
    private String nombre;
    private String direccion;
    private String email;
    private int identificacion;

    // Constructor
    public Persona(String nombre, String direccion, String email, int identificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.identificacion = identificacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Email: " + email);
        System.out.println("Identificacion: " + identificacion);
    }


}
