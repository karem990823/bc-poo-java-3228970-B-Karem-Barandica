package co.edu.sena.semana02;

import java.util.ArrayList;

public class YogaCenter {
    private String nombre;
    private ArrayList<YogaRoom> YogaRooms;


    public YogaCenter(String nombre) {
        this.nombre = nombre;
        this.YogaRooms = new ArrayList<>();

    }
    // Agregar una sala de yoga
    public void agregarYogaRoom(YogaRoom yogaRoom) {
        // Validación de ID duplicado
        for (YogaRoom room : YogaRooms) {
            if (room.getIdRoom() == yogaRoom.getIdRoom()) {
                System.out.println("Error: Ya existe una sala con la misma ID.");
                return;
            }
        }
        YogaRooms.add(yogaRoom);
        System.out.println("Sala de yoga agregada con éxito.");
    }

    // Mostrar información de todas las salas
    public void mostrarYogaRooms() {
        if (YogaRooms.isEmpty()) {
            System.out.println("No hay salas de yoga registradas.");
        } else {
            for (YogaRoom yogaRoom : YogaRooms) {
                yogaRoom.showInfo();
            }
        }
    }

}
