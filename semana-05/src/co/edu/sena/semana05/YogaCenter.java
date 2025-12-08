package co.edu.sena.semana05;
import java.util.ArrayList;

public class YogaCenter {
    private String nombre;
    private ArrayList<YogaRoom> YogaRooms;

    // Constructor
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

    // Buscar por ID (primer versión del método)
    public YogaRoom buscarYogaRoom(int idRoom) {
        for (YogaRoom room : YogaRooms) {
            if (room.getIdRoom() == idRoom) {
                return room; // Encontrada
            }
        }
        System.out.println("Error: No se encontró la sala con ID " + idRoom);
        return null; // No encontrada
    }

    // Buscar por nombre (segunda versión del método)
    public YogaRoom buscarYogaRoom(String name) {
        for (YogaRoom room : YogaRooms) {
            if (room.getNameRoom().equalsIgnoreCase(name)) {
                return room; // Encontrada
            }
        }
        System.out.println("Error: No se encontró la sala con nombre " + name);
        return null; // No encontrada
    }

    // Buscar por capacidad mínima (tercer versión del método)
    public void buscarYogaRoom(int minCapacity, boolean byMin) {
        boolean found = false;
        for (YogaRoom room : YogaRooms) {
            if (byMin && room.getCapacity() >= minCapacity) {
                System.out.println("Sala encontrada: ");
                room.showInfo();
                found = true;
            } else if (!byMin && room.getCapacity() <= minCapacity) {
                System.out.println("Sala encontrada: ");
                room.showInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se encontraron salas que cumplan el criterio de capacidad.");
        }
    }

    // Buscar por capacidad exacta (alternativa a la búsqueda por rango de capacidad)
    public void buscarYogaRoomExacta(int exactCapacity) {
        boolean found = false;
        for (YogaRoom room : YogaRooms) {
            if (room.getCapacity() == exactCapacity) {
                System.out.println("Sala encontrada con capacidad exacta " + exactCapacity + ":");
                room.showInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se encontraron salas con capacidad exacta de " + exactCapacity);
        }
    }
}
