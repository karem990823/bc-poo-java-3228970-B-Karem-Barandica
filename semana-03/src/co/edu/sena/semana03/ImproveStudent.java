package co.edu.sena.semana03;

public class ImproveStudent {
    // Atributos (todos privados)
    private String nombre;
    private String direccion;
    private String email;
    private int identificacion;
    private int edad;
    private int clasesActivas;
    private boolean activo;

    // Constructor por defecto (sin parámetros)
    public ImproveStudent() {
        this.nombre = "Desconocido";
        this.direccion = "No especificada";
        this.email = "no-email@example.com";
        this.identificacion = 0;
        this.edad = 18;
        this.clasesActivas = 0;
        this.activo = false; // Por defecto el estudiante está inactivo
    }

    // Constructor con parámetros básicos
    public ImproveStudent(String nombre, String email, int identificacion) {
        this.nombre = nombre;
        setEmail(email);  // Usamos el setter para validación
        setIdentificacion(identificacion); // Usamos el setter para validación
        this.direccion = "No especificada";  // Valor por defecto
        this.edad = 18;  // Edad por defecto
        this.clasesActivas = 0;  // No tiene clases activas al principio
        this.activo = false;  // Estudiante inactivo por defecto
    }

    // Constructor completo (con todos los atributos)
    public ImproveStudent(String nombre, String direccion, String email, int identificacion, int edad, int clasesActivas, boolean activo) {
        setNombre(nombre);  // Usamos el setter para validación
        setDireccion(direccion);  // Usamos el setter para validación
        setEmail(email);  // Usamos el setter para validación
        setIdentificacion(identificacion);  // Usamos el setter para validación
        setEdad(edad);  // Usamos el setter para validación
        setClasesActivas(clasesActivas);  // Usamos el setter para validación
        setActivo(activo);
    }

    // Método void (imprime información)
    public void mostrarInformacion() {
        System.out.println("=== CURSO ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Email: " + getEmail());
        System.out.println("Identificacion: " + getIdentificacion());
        System.out.println("Edad: " + getEdad());
        System.out.println("Clases: " + getClasesActivas());
        System.out.println("Estado: " + (isActivo() ? "ACTIVO" : "INACTIVO"));
    }

    // Método que retorna valor calculado (Costo mensualidad)
    public double calcularCostoMensualidad() {
        return calcularCostoMensualidad(getClasesActivas());
    }

    // Método calculador de costo
    private double calcularCostoMensualidad(int clasesActivas) {
        double costoTotal;
        if (clasesActivas > 4) {
            costoTotal = clasesActivas * 30000;
        } else {
            costoTotal = clasesActivas * 50000;
        }
        return costoTotal;
    }

    // Métodos Getter (tienen acceso público)
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public int getClasesActivas() {
        return clasesActivas;
    }

    public boolean isActivo() {
        return activo;
    }

    // Métodos Setter con validaciones (tienen acceso público)

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede ser vacío.");
        }
    }

    public void setDireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        } else {
            System.out.println("Error: La dirección no puede ser vacía.");
        }
    }

    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty() && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: El email debe ser válido.");
        }
    }

    public void setIdentificacion(int identificacion) {
        if (identificacion > 0) {
            this.identificacion = identificacion;
        } else {
            System.out.println("Error: La identificación debe ser positiva.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 100) { // Validación de edad entre 18 y 100 años
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser válida (18-100).");
        }
    }

    public void setClasesActivas(int clasesActivas) {
        if (clasesActivas >= 0) { // Validación para evitar números negativos
            this.clasesActivas = clasesActivas;
        } else {
            System.out.println("Error: El número de clases activas no puede ser negativo.");
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos auxiliares privados (pueden ser usados para validaciones internas)
    private boolean esEmailValido(String email) {
        return email != null && email.contains("@");
    }

    private boolean esEdadValida(int edad) {
        return edad >= 18 && edad <= 100;
    }
}


