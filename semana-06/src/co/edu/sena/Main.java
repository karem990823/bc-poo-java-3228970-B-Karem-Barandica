package co.edu.sena;

import co.edu.sena.abstractas.WellnessClass;
import co.edu.sena.abstractas.WellnessService;
import co.edu.sena.implementaciones.YogaClass;
import co.edu.sena.implementaciones.MeditationClass;
import co.edu.sena.implementaciones.NutritionalPlan;
import co.edu.sena.implementaciones.HolisticTherapy;
import co.edu.sena.interfaces.Calificable;
import co.edu.sena.interfaces.Pagable;
import co.edu.sena.interfaces.Reservable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de servicios de bienestar (tipo polimórfico)
        System.out.println("=== SISTEMA DE CENTRO DE YOGA ===\n");

        // 1. Polimorfismo con clase abstracta
        System.out.println("--- Clases Disponibles ---");
        WellnessClass[] classes = new WellnessClass[4];

        YogaClass yogaClass = new YogaClass("Yoga para principiantes", 20, "Clases de yoga orientadas a iniciantes", "Vinyasa", 30.0);
        MeditationClass meditationClass = new MeditationClass("Meditación para la calma", 15, "Meditación guiada para reducir el estrés", "Mindfulness");
        YogaClass yogaClass1 = new YogaClass("Yoga avanzado", 15, "Clases de yoga orientadas a personas con nivel avanzado", "Vinyasa",25.0);
        MeditationClass meditationClass1 = new MeditationClass("Meditación para el presente", 15, "Meditación guiada para permanecer en el presente", "Mindfulness");

        // Llenar el array de clases con las instancias creadas
        classes[0] = yogaClass;
        classes[1] = meditationClass;
        classes[2] = yogaClass1;
        classes[3] = meditationClass1;


        // Recorrer la lista y ejecutar los servicios usando polimorfismo
        for (WellnessClass clase : classes) {
            clase.mostrarInformacion();  // Método común (concreto)
            clase.realizarClase();       // Método polimórfico (abstracto)
            System.out.println();        // Separador entre clases
        }
        // 2. Polimorfismo con clase abstracta
        System.out.println("--- Servicios Disponibles ---");
        WellnessService[] services = new WellnessService[3];

        // Agregar instancias de TerapiaHolistica y PlanNutricional a la lista
        HolisticTherapy terapia = new HolisticTherapy("Terapia Holística Integral", 60, 150.0, "Reiki");
        NutritionalPlan plan = new NutritionalPlan("Plan Nutricional Personalizado", 30, 100.0, "Pérdida de peso");
        NutritionalPlan plan1 = new NutritionalPlan("Plan Nutricional Personalizado", 30, 100.0, "Dieta Ketox");

        // Llenar el array de clases con las instancias creadas
        services[0] = terapia;
        services[1] = plan;
        services[2] = plan1;


        // Recorrer la lista y ejecutar los servicios usando polimorfismo
        for (WellnessService service : services) {
            service.mostrarInformacion();  // Este es un método concreto de la clase padre
            service.brindarServicio();     // Este es un método abstracto que se resuelve en tiempo de ejecución
            System.out.println();  // Separador de cada servicio
        }
        // Reservas
        yogaClass.realizarReserva("Juan Pérez", "2025-12-10 09:00 AM");
        terapia.realizarReserva("Carlos López", "2025-12-10 02:00 PM");

        // Verificar disponibilidad
        System.out.println("¿Clase de Yoga disponible? " + yogaClass.verificarDisponibilidad("2025-12-10 09:00 AM"));
        System.out.println("¿Terapia Holística disponible? " + terapia.verificarDisponibilidad("2025-12-10 02:00 PM"));

        // Cancelar reservas
        yogaClass.cancelarReserva("Juan Pérez");


        // Verificar si se puede realizar una nueva reserva
        yogaClass.realizarReserva("Juan Pérez", "2025-12-10 09:00 AM");


        // Calificaciones
        yogaClass.calificar(5);
        yogaClass.calificar(4);
        terapia.calificar(4);


        // Mostrar calificaciones promedio
        System.out.println("Calificación Promedio de la clase de Yoga: " + yogaClass.obtenerCalificacionPromedio());
        System.out.println("Calificación Promedio de la terapia Holística: " + terapia.obtenerCalificacionPromedio());


        // Procesar pagos
        yogaClass.procesarPago(30.0);
        terapia.procesarPago(50.0);


        // Verificar pagos
        System.out.println("¿Pago realizado para la clase de Yoga? " + yogaClass.verificarPago("Juan Pérez"));
        System.out.println("¿Pago realizado para la terapia Holística? " + terapia.verificarPago("Carlos López"));

    }
}


