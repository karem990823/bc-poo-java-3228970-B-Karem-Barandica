package co.edu.sena.semana03;

public class ImproveInstructor {
    // Atributos privados
    private String nameInstructor;
    private int idIntructor;
    private String adress;
    private int cellphone;
    private String nameClass;
    private int entryTime;
    private int departureTime;
    private int numberOfClasses;

    // Constructor por defecto
    public ImproveInstructor() {
        this.nameInstructor = "Desconocido";
        this.idIntructor = 0;
        this.adress = "No especificada";
        this.cellphone = 0;
        this.nameClass = "Sin clase asignada";
        this.entryTime = 9; // Por defecto entrada a las 9 AM
        this.departureTime = 17; // Por defecto salida a las 5 PM
        this.numberOfClasses = 0;
    }

    // Constructor con parámetros
    public ImproveInstructor(String name, int id, String adress, int cellphone, String nameClass, int entry, int departure, int numberOfClasses) {
        setNameInstructor(name);
        setIdIntructor(id);
        setAdress(adress);
        setCellphone(cellphone);
        setNameClass(nameClass);
        setEntryTime(entry);
        setDepartureTime(departure);
        setNumberOfClasses(numberOfClasses);
    }

    // Método toString para mostrar el nombre del instructor de forma sencilla
    @Override
    public String toString() {
        return "Instructor: " + nameInstructor;
    }

    // Método para mostrar la información completa del instructor
    public void showInfo() {
        System.out.println("Instructor: " + getNameInstructor());
        System.out.println("Identificacion: " + getIdIntructor());
        System.out.println("Direccion: " + getAdress());
        System.out.println("Celular: " + getCellphone());
        System.out.println("Clase: " + getNameClass());
        System.out.println("Entrada: " + getEntryTime());
        System.out.println("Salida: " + getDepartureTime());
        System.out.println("Numero de clases al día: " + getNumberOfClasses());
    }

    // Método que retorna valor calculado: Horas trabajadas
    public double calcularHorastrabajadas() {
        if (departureTime < entryTime) {
            System.out.println("Error: La hora de salida no puede ser anterior a la de entrada.");
            return 0; // Si la hora de salida es menor a la de entrada, devolver 0
        }
        return departureTime - entryTime; // Máximo 8h diarias
    }

    // Métodos Getter
    public String getNameInstructor() {
        return nameInstructor;
    }

    public int getIdIntructor() {
        return idIntructor;
    }

    public String getAdress() {
        return adress;
    }

    public int getCellphone() {
        return cellphone;
    }

    public String getNameClass() {
        return nameClass;
    }

    public int getEntryTime() {
        return entryTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    // Métodos Setter con validaciones
    public void setNameInstructor(String nameInstructor) {
        if (nameInstructor != null && !nameInstructor.trim().isEmpty()) {
            this.nameInstructor = nameInstructor;
        } else {
            System.out.println("Error: El nombre del instructor no puede ser vacío.");
        }
    }

    public void setIdIntructor(int idIntructor) {
        if (idIntructor > 0) {
            this.idIntructor = idIntructor;
        } else {
            System.out.println("Error: La identificación del instructor debe ser mayor que 0.");
        }
    }

    public void setAdress(String adress) {
        if (adress != null && !adress.trim().isEmpty()) {
            this.adress = adress;
        } else {
            System.out.println("Error: La dirección no puede ser vacía.");
        }
    }

    public void setCellphone(int cellphone) {
        if (cellphone > 0) {
            this.cellphone = cellphone;
        } else {
            System.out.println("Error: El número de celular no puede ser negativo o cero.");
        }
    }

    public void setNameClass(String nameClass) {
        if (nameClass != null && !nameClass.trim().isEmpty()) {
            this.nameClass = nameClass;
        } else {
            System.out.println("Error: El nombre de la clase no puede ser vacío.");
        }
    }

    public void setEntryTime(int entryTime) {
        if (entryTime >= 0 && entryTime <= 24) { // Validación de hora de entrada
            this.entryTime = entryTime;
        } else {
            System.out.println("Error: La hora de entrada debe estar entre 0 y 24.");
        }
    }

    public void setDepartureTime(int departureTime) {
        if (departureTime >= 0 && departureTime <= 24) { // Validación de hora de salida
            this.departureTime = departureTime;
        } else {
            System.out.println("Error: La hora de salida debe estar entre 0 y 24.");
        }
    }

    public void setNumberOfClasses(int numberOfClasses) {
        if (numberOfClasses >= 0) {
            this.numberOfClasses = numberOfClasses;
        } else {
            System.out.println("Error: El número de clases no puede ser negativo.");
        }
    }


}
