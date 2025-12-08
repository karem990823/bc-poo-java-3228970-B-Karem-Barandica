package co.edu.sena.implementaciones;

import co.edu.sena.abstractas.WellnessService;

// Subclase concreta que extiende la clase abstracta ServicioBienestar
public class NutritionalPlan extends WellnessService {
    private String typePlan; // Ejemplo: Plan de pérdida de peso, Plan de aumento muscular, Plan balanceado

    // Constructor que llama al constructor de la clase padre
    public NutritionalPlan(String nombreServicio, int duracionMinutos, double costo, String tipoPlan) {
        super(nombreServicio, duracionMinutos, costo); // Llamada al constructor de la clase padre
        this.typePlan = tipoPlan;
    }


    // Implementación del método abstracto
    @Override
    public void brindarServicio() {
        System.out.println("Ofreciendo plan nutricional de tipo: " + typePlan + "...");
        // Lógica para ofrecer el plan nutricional (puede incluir detalles sobre el plan)
        System.out.println("El plan nutricional está en progreso...");
    }

    // Método para mostrar la información del plan
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método concreto de la clase padre
        System.out.println("Tipo de Plan Nutricional: " + typePlan);
    }
}

