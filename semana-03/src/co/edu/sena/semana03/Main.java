package co.edu.sena.semana03;

public class Main {
public static void main(String[] args) {
    // Crear un estudiante
    ImproveStudent student1 = new ImproveStudent("Juan Pérez", "Calle Ficticia 123", "juan@example.com", 12345, 25, 5, true);

    // Mostrar información
    student1.mostrarInformacion();

    // Cambiar el estado a inactivo
    student1.setActivo(false);

    // Mostrar nuevamente la información
    student1.mostrarInformacion();

    // Calcular el costo de la mensualidad
    double costo = student1.calcularCostoMensualidad();

    ImproveYogaClass yogaClass1 = new ImproveYogaClass("Yoga para principiantes", "Daniela Ardila", 20, 1, true);
    yogaClass1.showInfo();
    System.out.println("Costo total: " + yogaClass1.calcularCostoTotal());

    // Crear una clase de yoga usando el constructor por defecto
    ImproveYogaClass yogaClass2 = new ImproveYogaClass();
    yogaClass2.showInfo();
    System.out.println("Costo total: " + yogaClass2.calcularCostoTotal());

    // Modificar la clase usando los setters
    yogaClass2.setClassName("Yoga avanzado");
    yogaClass2.setInstructor("Ana Rodríguez");
    yogaClass2.setCapacity(30);
    yogaClass2.setDuracionHoras(2);
    yogaClass2.setActivo(true);
    yogaClass2.showInfo();
    System.out.println("Costo total: " + yogaClass2.calcularCostoTotal());

    ImproveInstructor instructor1 = new ImproveInstructor("Juan Pérez", 12345, "Calle Ficticia 123", 987654321, "Yoga para todos", 9, 17, 5);
    instructor1.showInfo();
    System.out.println("Horas trabajadas: " + instructor1.calcularHorastrabajadas());

    // Crear un instructor usando el constructor por defecto
    ImproveInstructor instructor2 = new ImproveInstructor();
    instructor2.showInfo();
    System.out.println("Horas trabajadas: " + instructor2.calcularHorastrabajadas());

    // Modificar los datos usando setters
    instructor2.setNameInstructor("Ana Rodríguez");
    instructor2.setEntryTime(8);
    instructor2.setDepartureTime(16);
    instructor2.setNumberOfClasses(4);
    instructor2.showInfo();
    System.out.println("Horas trabajadas: " + instructor2.calcularHorastrabajadas());

    ImproveYogaRoom yogaRoom1 = new ImproveYogaRoom("Salón A", 101, instructor1, 25, true, "Colchonetas", 20);
    yogaRoom1.showInfo();
    System.out.println("Información del salón: " + yogaRoom1.obtenerInformacion());

    // Crear un salón de yoga usando el constructor por defecto
    ImproveYogaRoom yogaRoom2 = new ImproveYogaRoom();
    yogaRoom2.showInfo();

    // Modificar el salón de yoga usando setters
    yogaRoom2.setNameRoom("Salón B");
    yogaRoom2.setIdRoom(102);
    yogaRoom2.setNameInstructor(instructor1);
    yogaRoom2.setCapacity(30);
    yogaRoom2.setAvailability(true);
    yogaRoom2.setEquipment("Bloques");
    yogaRoom2.setEquipmentQuantity(15);
    yogaRoom2.showInfo();
}
}
