package co.edu.sena.semana01;


public class Student {
    // Atributos (5 mínimo)
    private String nombre;
    private String direccion;
    private String email;
    private int identificacion;
    private int edad;
    private int clasesActivas;
    private boolean activo;

    // Constructor
    public Student(String nombre, String direccion, String email, int identificacion, int edad, int clasesActivas, boolean activo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.identificacion = identificacion;
        this.edad = edad;
        this.clasesActivas= clasesActivas;
        this.activo = true;
    }


    // Método void (imprime información)
    public void mostrarInformacion() {
        System.out.println("=== CURSO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Email: " + email);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Edad: " + edad);
        System.out.println("Clases: " + clasesActivas);
        System.out.println("Estado: " + (activo ? "ACTIVO" : "INACTIVO"));
    }

    // Método que retorna valor calculado
    public double calcularCostoMensualidad(int clasesActivas) {
        double costoTotal;
        if (clasesActivas>4) {
            costoTotal = clasesActivas * 30000;
        }
        else {
            costoTotal = clasesActivas * 50000;
        }
        //
        return costoTotal;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
