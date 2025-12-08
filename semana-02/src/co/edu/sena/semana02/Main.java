package co.edu.sena.semana02;

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Instructor Inst1 = new Instructor("Daniela Ardila", 1_020_450_033, "cr 3 56 20", 3208504, "Meditacion", 9, 13, 3);


        // Crear relación
        YogaRoom room1 = new YogaRoom("Playa", 01, Inst1, 15, true, "colchonetas", 16);

        System.out.println("--- INSTRUCTORES ---");
        Inst1.showInfo();
        System.out.println("\nTotal Horas: " + Inst1.calcularHorastrabajadas());


        System.out.println("--- SALONES DE YOGA ---");
        room1.showInfo();
        System.out.println("Informacion:" + room1.obtenerInformacion());

        room1.setNameInstructor(Inst1);


        // Usar ArrayList
        YogaCenter center = new YogaCenter("Equilibrio y Bienestar");
        center.agregarYogaRoom(room1);


        System.out.println("--- EQUILIBRIO Y BIENESTAR ---");
        center.mostrarYogaRooms();
        System.out.println("Informacion:" + room1.obtenerInformacion());
    }
}
