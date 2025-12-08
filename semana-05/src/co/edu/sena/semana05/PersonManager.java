package co.edu.sena.semana05;

import java.util.ArrayList;

class PersonManager {
    private ArrayList<Person> people;

    public PersonManager() {
        this.people = new ArrayList<>();
    }

    // Agregar persona (Instructor o Student) - El parámetro es de tipo Person (clase padre)
    public void addPerson(Person person) {
        people.add(person);
    }

    // Listar todas las personas - Usando polimorfismo
    public void listPeople() {
        for (Person person : people) {
            // El método 'toString()' se invoca dinámicamente dependiendo de si es un Instructor o Student
            System.out.println(person);
        }
    }

    // Listar solo instructores - Usando instanceof para verificar el tipo
    public void listInstructors() {
        for (Person person : people) {
            if (person instanceof Instructor) {
                // Usando polimorfismo para llamar al método específico de la subclase Instructor
                person.mostrarInformacion(); // Enlace dinámico: se invoca el método sobrescrito de Instructor
            }
        }
    }

    // Listar solo estudiantes - Usando instanceof para verificar el tipo
    public void listStudents() {
        for (Person person : people) {
            if (person instanceof Student) {
                // Usando polimorfismo para llamar al método específico de la subclase Student
                person.mostrarInformacion(); // Enlace dinámico: se invoca el método sobrescrito de Student
            }
        }
    }

    // Buscar por nombre - Aquí usamos polimorfismo para retornar cualquier tipo de Persona
    public Person findByName(String name) {
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person; // Retorna una instancia de Person, Instructor o Student
            }
        }
        return null; // Si no se encuentra la persona
    }

    // Método para inscribir en actividad - Usamos polimorfismo, y se ejecuta el comportamiento según el tipo real del objeto
    public void inscribirPersonaEnActividad(String name, String actividad) {
        Person person = findByName(name);
        if (person != null) {
            // Llamamos al método inscribirEnActividad según el tipo de la persona
            person.inscribirEnActividad(actividad); // Enlace dinámico
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
}

