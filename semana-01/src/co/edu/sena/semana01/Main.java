package co.edu.sena.semana01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Juan Pérez", "CL 70 31 60 ", "juan@email.com", 1_010_450_320, 22,6, true);
        Student student2 = new Student("Pedro Castro", "cl 80 45 23", "pcastro@gmail.com", 1_033_256_400, 35, 0, false);
        YogaClass class1 = new YogaClass("Pilates", "Jorge Veloza", 30, 2, true);
        YogaClass class2 = new YogaClass("Meditacion", "Daniela Ardila", 15, 2, true);


        System.out.println("--- ESTUDIANTES ---");
        student1.mostrarInformacion();
        System.out.println();
        student2.mostrarInformacion();

        System.out.println("\n--- CURSOS ---");
        class1.showInfo();
        System.out.println("\nCosto total: $" + class1.calcularCostoTotal());

        System.out.println();
        class2.showInfo();
        class2.setActivo(false);
        System.out.println("\n--- Después de desactivar ---");
        class2.showInfo();

        // calcular mensualidad
        student1.calcularCostoMensualidad(6);
        System.out.println("\nCosto total: $" + student1.calcularCostoMensualidad(6));
    }
}