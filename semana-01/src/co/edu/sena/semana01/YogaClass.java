package co.edu.sena.semana01;

public class YogaClass {
    private String className;
    private String instructor;
    private int capacity;
    private int duracionHoras;
    private boolean activo;

    // Constructor
    public YogaClass(String className, String instructor, int capacity, int horas, boolean activo) {
        this.className = className;
        this.instructor = instructor;
        this.capacity = capacity;
        this.duracionHoras = horas;
        this.activo = true;
    }

    // Método para mostrar información
    public void showInfo() {
        System.out.println("Clase: " + className);
        System.out.println("Instructor: " + instructor);
        System.out.println("Cupo: " + capacity + " personas");
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Estado: " + (activo ? "ACTIVO" : "INACTIVO"));
    }

    // Método que retorna valor calculado
    public double calcularCostoTotal() {
        return duracionHoras * 10000; // $10,000 por hora
    }

    // Getter
    public String getClassName() {
        return className;
    }

    // Setter
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
