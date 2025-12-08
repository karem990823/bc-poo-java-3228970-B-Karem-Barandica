package co.edu.sena.semana03;

public class ImproveYogaRoom {
    // Atributos privados
    private String nameRoom;
    private int idRoom;
    private ImproveInstructor nameInstructor;
    private int capacity;
    private boolean availability;
    private String equipment;
    private int equipmentQuantity;

    // Constructor por defecto
    public ImproveYogaRoom() {
        this.nameRoom = "Salón desconocido";
        this.idRoom = 0;
        this.nameInstructor = new ImproveInstructor();  // Usamos un instructor por defecto
        this.capacity = 0;
        this.availability = true;
        this.equipment = "No especificado";
        this.equipmentQuantity = 0;
    }

    // Constructor con parámetros
    public ImproveYogaRoom(String nameRoom, int idRoom, ImproveInstructor nameInstructor, int capacity, boolean availability, String equipment, int equipmentQuantity) {
        setNameRoom(nameRoom);  // Usamos el setter para validar
        setIdRoom(idRoom);  // Usamos el setter para validar
        setNameInstructor(nameInstructor);  // Usamos el setter para validar
        setCapacity(capacity);  // Usamos el setter para validar
        setAvailability(availability);  // Usamos el setter para validar
        setEquipment(equipment);  // Usamos el setter para validar
        setEquipmentQuantity(equipmentQuantity);  // Usamos el setter para validar
    }

    // Método toString para mostrar información básica del salón de yoga
    @Override
    public String toString() {
        return "Salón: " + nameRoom + ", Instructor: " + nameInstructor.getNameInstructor();
    }

    // Método para mostrar la información completa del salón
    public void showInfo() {
        System.out.println("Nombre salón: " + getNameRoom());
        System.out.println("Número de salón: " + getIdRoom());
        System.out.println("Instructor: " + getNameInstructor().getNameInstructor());
        System.out.println("Capacidad: " + getCapacity());
        System.out.println("Disponibilidad: " + (isAvailability() ? "Disponible" : "No disponible"));
        System.out.println("Equipamiento: " + getEquipment());
        System.out.println("Cantidad de equipos: " + getEquipmentQuantity());
    }

    // Método para obtener la información del salón
    public String obtenerInformacion() {
        return getNameInstructor().getNameInstructor() + ", " + getNameRoom();
    }

    // Métodos Getter
    public String getNameRoom() {
        return nameRoom;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public ImproveInstructor getNameInstructor() {
        return nameInstructor;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public String getEquipment() {
        return equipment;
    }

    public int getEquipmentQuantity() {
        return equipmentQuantity;
    }

    // Métodos Setter con validaciones
    public void setNameRoom(String nameRoom) {
        if (nameRoom != null && !nameRoom.trim().isEmpty()) {
            this.nameRoom = nameRoom;
        } else {
            System.out.println("Error: El nombre del salón no puede ser vacío.");
        }
    }

    public void setIdRoom(int idRoom) {
        if (idRoom > 0) {  // Validación para asegurarse de que el ID sea positivo
            this.idRoom = idRoom;
        } else {
            System.out.println("Error: El número del salón debe ser positivo.");
        }
    }

    public void setNameInstructor(ImproveInstructor nameInstructor) {
        if (nameInstructor != null) {
            this.nameInstructor = nameInstructor;
        } else {
            System.out.println("Error: El instructor no puede ser nulo.");
        }
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {  // Validación para asegurarse de que la capacidad sea positiva
            this.capacity = capacity;
        } else {
            System.out.println("Error: La capacidad debe ser mayor que 0.");
        }
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setEquipment(String equipment) {
        if (equipment != null && !equipment.trim().isEmpty()) {
            this.equipment = equipment;
        } else {
            System.out.println("Error: El equipamiento no puede ser vacío.");
        }
    }

    public void setEquipmentQuantity(int equipmentQuantity) {
        if (equipmentQuantity >= 0) {  // Validación para asegurarse de que la cantidad de equipos no sea negativa
            this.equipmentQuantity = equipmentQuantity;
        } else {
            System.out.println("Error: La cantidad de equipos no puede ser negativa.");
        }
    }
}

