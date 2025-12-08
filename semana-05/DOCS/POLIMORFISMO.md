### 1. Sobrecarga (Overloading)
- **Métodos**: 
    - Buscar salones por ID
    - Buscar salones por nombre
    - Buscar salones por capacidad

- **Justificación**: Por qué se tiene una mayor organización de la cantidad de salones disponibles dependiendo de diferentes factores.

### 2. Sobrescritura (Overriding)
- **Métodos**: Lista de métodos sobrescritos con `@Override`
    - Metodo toString para mostrar la información de cada persona
    - Inscribir en actividad: permite al administrador inscribir tanto a instructores como a estudiantes en las diferentes clases o actividades impartidas por el centro de yoga.
- **Tabla comparativa**:

| Método      | Clase Padre        | Subclase 1                                                                       | Subclase 2          |
|-------------|--------------------|----------------------------------------------------------------------------------|---------------------|
| `toString()` | return informacion | return informacion + ", Especialidad: " + especialidad + ", Horario: " + horario | return informacion + ", Clases activas: " + clasesActivas + ", Estado: " + (activo ? "ACTIVO" : "INACTIVO") |
| `inscribirEnActividad(String actividad)`          | return name + " ha sido inscrito en la actividad: " + actividad | return name + " ha sido inscrito en la actividad académica: " + actividad |

### 3. Polimorfismo Dinámico
- **Ejemplo**: Código que demuestra dynamic binding


