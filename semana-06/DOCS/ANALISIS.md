# Análisis de Diseño - Semana 06: Centro de Yoga "Bienestar y Equilibrio"

## 1. Identificación de Abstracciones

### Clase(s) Abstracta(s)
**Nombre:** WellnessClass

**¿Por qué es abstracta?**
- [Explica por qué elegiste hacer esta clase abstracta]
- [Qué comportamiento común tiene]
- [Qué comportamiento varía en las subclases]

**Jerarquía:**

```

WellnessClass.java
├── YogaClass.java
└── MeditationClass.java

```

---

**Nombre:** WellnessServices

**¿Por qué es abstracta?**
- [Explica por qué elegiste hacer esta clase abstracta]
- [Qué comportamiento común tiene]
- [Qué comportamiento varía en las subclases]

**Jerarquía:**

```

WellnessService.java
├── HolisticTherapy.java
└── NutritionalPlan.java

```

---

## 2. Interfaces Implementadas

### Interface 1: Reservable
**Capacidad que define:** [Descripción]

**Clases que la implementan:**
- [Clase1]: [Por qué tiene sentido que implemente esta interface]
- [Clase2]: [Por qué tiene sentido que implemente esta interface]

### Interface 2: Calificable
**Capacidad que define:** [Descripción]

**Clases que la implementan:**
- [Clase1]: [Por qué tiene sentido que implemente esta interface]
- [Clase2]: [Por qué tiene sentido que implemente esta interface]

### Interface 2: Calificable
**Capacidad que define:** [Descripción]

**Clases que la implementan:**
- [Clase1]: [Por qué tiene sentido que implemente esta interface]
- [Clase2]: [Por qué tiene sentido que implemente esta interface]

---

## 3. Decisiones de Diseño

### ¿Por qué Clase Abstracta vs Interface?

**Elegí clase abstracta para [X] porque:**
- Hay relación "es-un" clara
- Necesitaba compartir estado (atributos)
- Había comportamiento común implementable

**Elegí interface para [Y] porque:**
- Define una capacidad independiente de jerarquía
- Necesitaba múltiple implementación
- Solo define contrato, no implementación

---

## 4. Principios SOLID Aplicados

### Single Responsibility Principle (SRP)
[Explica cómo cada clase tiene una sola responsabilidad]

### Open/Closed Principle (OCP)
[Explica cómo tu diseño está abierto a extensión pero cerrado a modificación]

### Liskov Substitution Principle (LSP)
[Explica cómo las subclases pueden sustituir a la clase abstracta]

### Interface Segregation Principle (ISP)
[Explica cómo tus interfaces son específicas y no obligan a implementar métodos innecesarios]

### Dependency Inversion Principle (DIP)
[Si aplica, explica cómo dependes de abstracciones]

---

## 5. Mejoras Logradas

**Antes (Semana 05):**
- [Describe cómo estaba tu código]
- [Qué problemas tenía]

**Después (Semana 06):**
- [Describe cómo está ahora]
- [Qué mejoras lograste]
- [Qué ventajas tiene el nuevo diseño]

---

## 6. Diagrama de Clases

[Incluye un diagrama simple en texto o imagen]

```
                               <<abstract>>
                            ServicioTuristico
                                    |
                             +------+------+
                             |             |
        Vuelo Hotel | +-- implements Reservable +-- implements Calificable
```

---

## 7. Desafíos y Soluciones

**Desafío 1:** [Describe un problema que enfrentaste]
**Solución:** [Cómo lo resolviste]

**Desafío 2:** [Otro desafío]
**Solución:** [Su solución]

---

## 8. Próximos Pasos

[Qué podrías mejorar o agregar en el futuro]