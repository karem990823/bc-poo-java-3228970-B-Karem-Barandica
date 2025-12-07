# Análisis del Dominio: Centro de Yoga "Equilibrio y Bienestar"

## 1. Identificación de Objetos

### Objeto Principal: YogaClass
- **Justificación:** Es un centro de Yoga, asi que imparte diferentes clases o cursos, por esta razon YogaClass es la clase principal.
- **Atributos identificados:** Nombre de la clase, instructor, capacidad, duracion en horas y si la clase está activa.
- **Comportamientos:** Los comportamientos iniciales seran calcular el costo de las clases y mostrar la información.

### Objeto Secundario: Student
- **Justificación:** La clase Student es secundaria, ya que cada curso impartido en el centro de yoga necesita un receptor final.
- **Relación con objeto principal:** Como se explicó anteriormente se necesitan los estudiantes que recibiran las clases

## 2. Diagrama de Clases (opcional)
![Diagrama de clases semana01.png](Diagrama%20de%20clases%20semana01.png)

## 3. Decisiones de Diseño
- **¿Por qué elegí estos atributos?**

    - Por qué son fundamentales para la identificación y visualización de estas clases

- **¿Qué validaciones implementé?**

  - Valide las clases, creando objetos en la clase Main.java.
  
- **¿Qué relaciones identifiqué?**
    - Los estudiantes tienen clase de yoga.
    - Los estudiantes se inscriben a clases de yoga.
    - Las clases de yoga son pagadas por los estudiantes.