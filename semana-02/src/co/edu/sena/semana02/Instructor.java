package co.edu.sena.semana02;

public class Instructor {
    private String nameInstructor;
    private int idIntructor;
    private String adress;
    private int cellphone;
    private String nameClass;
    private int entryTime;
    private int departureTime;
    private int numberOfClasses;

    // Constructor
    public Instructor(String name, int id, String adress, int cell, String nameClass,int entry, int departure, int numberOfClasses) {
        this.nameInstructor = name;
        this.idIntructor = id;
        this.adress = adress;
        this.cellphone = cell;
        this.nameClass = nameClass;
        this.entryTime = entry;
        this.departureTime = departure;
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public String toString() {
        return "Instructor: " + nameInstructor ;
    }


    public void showInfo() {
        System.out.println("Instructor: " + nameInstructor);
        System.out.println("Identificacion: " + idIntructor);
        System.out.println("Direccion: " + adress);
        System.out.println("Celular: " + cellphone);
        System.out.println("Clase: " + nameClass);
        System.out.println("Entrada: " + entryTime);
        System.out.println("Salida: " + departureTime);
        System.out.println("Numero de clases al dia: " + numberOfClasses);
    }

    // Método que retorna valor calculado
    public double calcularHorastrabajadas() {
        return departureTime-entryTime; // maximo 8h diarias
    }

    // Getter
    public String getAdress() {return adress;
    }

    // Setter
    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

}