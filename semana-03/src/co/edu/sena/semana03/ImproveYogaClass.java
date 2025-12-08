package co.edu.sena.semana03;

public class ImproveYogaClass {
    // Atributos privados
    private String className;
    private String instructor;
    private int capacity;
    private int duracionHoras;
    private boolean activo;

    // Constructor por defecto
    public ImproveYogaClass() {
        this.className = "Clase desconocida";
        this.instructor = "Instructor desconocido";
        this.capacity = 0;
        this.duracionHoras = 1;
        this.activo = false;
    }

    // Constructor con parámetros
    public ImproveYogaClass(String className, String instructor, int capacity, int duracionHoras, boolean activo) {
        setClassName(className);
        setInstructor(instructor);
        setCapacity(capacity);
        setDuracionHoras(duracionHoras);
        setActivo(activo);
    }

    // Método para mostrar información
    public void showInfo() {
        System.out.println("Clase: " + getClassName());
        System.out.println("Instructor: " + getInstructor());
        System.out.println("Cupo: " + getCapacity() + " personas");
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Estado: " + (isActivo() ? "ACTIVO" : "INACTIVO"));
    }

    // Método que retorna valor calculado
    public double calcularCostoTotal() {
        return getDuracionHoras() * 10000; // $10,000 por hora
    }

    // Métodos Getter
    public String getClassName() {
        return className;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public boolean isActivo() {
        return activo;
    }

    // Métodos Setter con validaciones
    public void setClassName(String className) {
        if (className != null && !className.trim().isEmpty()) {
            this.className = className;
        } else {
            System.out.println("Error: El nombre de la clase no puede ser vacío.");
        }
    }

    public void setInstructor(String instructor) {
        if (instructor != null && !instructor.trim().isEmpty()) {
            this.instructor = instructor;
        } else {
            System.out.println("Error: El nombre del instructor no puede ser vacío.");
        }
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {  // Validación para asegurarse de que el cupo sea positivo
            this.capacity = capacity;
        } else {
            System.out.println("Error: El cupo debe ser mayor que 0.");
        }
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras > 0) {  // Validación para que la duración de la clase sea positiva
            this.duracionHoras = duracionHoras;
        } else {
            System.out.println("Error: La duración de la clase debe ser mayor a 0 horas.");
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos auxiliares privados (se pueden usar para validar o realizar cálculos internos)
    private boolean esInstructorValido(String instructor) {
        return instructor != null && !instructor.trim().isEmpty();
    }
}


