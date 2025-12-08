package co.edu.sena.abstractas;

public abstract class WellnessClass {// Clase abstracta

        protected String nameClass;
        protected int maxCapacity;
        protected String description;

        // Constructor que inicializa los atributos
        public WellnessClass(String nameClass, int maxCapacity, String description) {
            this.nameClass = nameClass;
            this.maxCapacity = maxCapacity;
            this.description = description;
        }

        // Método abstracto (sin implementación), debe ser implementado por las subclases
        public abstract void realizarClase();

        // Método concreto (con implementación)
        public void mostrarInformacion() {
            System.out.println("Clase: " + nameClass);
            System.out.println("Capacidad máxima: " + maxCapacity);
            System.out.println("Descripción: " + description);
        }
    }

