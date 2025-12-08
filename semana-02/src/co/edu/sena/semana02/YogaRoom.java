package co.edu.sena.semana02;

public class YogaRoom {
    private String nameRoom;
    private int idRoom;
    private Instructor instructor;
    private int capacity;
    private boolean availability;
    private String equipment;
    private int equipmentQuantity;

    // Constructor
    public YogaRoom(String name, int id, Instructor instructor, int capacity, Boolean availability, String equipment, int quantity) {
        this.nameRoom = name;
        this.idRoom = id;
        this.instructor = instructor;
        this.capacity = capacity;
        this.availability = availability;
        this.equipment = equipment;
        this.equipmentQuantity = quantity;
    }


    public void showInfo() {
        System.out.println("Nombre salon: " + nameRoom);
        System.out.println("Numero de salon: " + idRoom);
        System.out.println("Instructor: " + instructor);
        System.out.println("Capacidad: " + capacity);
        System.out.println("Disponibilidad: " + availability);
        System.out.println("Equipos: " + equipment);
        System.out.println("Cantidad de equipos: " + equipmentQuantity);
    }

    // Método de negocio
    public String obtenerInformacion() {
        return nameRoom + " ," + instructor;
    }

 // Getter
    public String getEquipment() {return equipment;}

    public int getIdRoom() {
        return idRoom;
    }
    public boolean isAvailability() {
        return availability;
    }
        // Setter
        public void setAvailability(boolean availability) {
            this.availability = availability;
        }
    public void setNameInstructor(Instructor nameInstructor) { this.instructor = instructor;}

}
