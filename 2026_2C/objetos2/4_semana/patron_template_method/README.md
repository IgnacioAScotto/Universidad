# Preparador de infusiones — Patrón Template Method

## Enunciado

Se desea desarrollar un sistema que permita preparar distintos tipos de **infusiones** (bebidas calientes) siguiendo procedimientos similares pero con pasos específicos para cada una.

Todas las infusiones comparten un mismo proceso general:
1. Calentar agua
2. Realizar un paso específico según el tipo de infusión

La diferencia radica en cómo se realiza ese segundo paso, que varía según el tipo de infusión. El sistema debe permitir **definir el esqueleto del algoritmo en una clase base** y delegar los pasos específicos a las subclases.

Inicialmente, el sistema deberá permitir preparar los siguientes tipos de infusiones:

- **Té:** verter agua caliente sobre un saquito de té.
- **Mate:** cargar el mate con yerba y verter agua caliente.

El proceso general de preparación debe estar centralizado en una única ubicación, evitando duplicación de código.

### Ejemplo de uso esperado

Se pueden crear instancias de diferentes tipos de infusiones y preparar cada una:

```java
Infusion te = new Te();
String resultado = te.preparar();
// devuelve: "Calentar agua. \nVerter el agua caliente sobre el saquito."
```

Del mismo modo, se puede preparar un mate:

```java
Infusion mate = new Mate();
String resultado = mate.preparar();
// devuelve: "Calentar agua. \nCargar el mate con yerba y verter el agua caliente."
```

## Requerimientos

1. Crear una clase abstracta `Infusion` que defina el **esqueleto del algoritmo** de preparación.
2. Implementar el paso común de calentar agua en la clase base.
3. Definir un método abstracto protegido que permita a las subclases implementar su paso específico.
4. Implementar una subclase concreta para **Té**.
5. Implementar una subclase concreta para **Mate**.
6. Cada subclase debe poder probarse de manera independiente.
7. Agregar las pruebas necesarias para verificar, como mínimo:
   - que la preparación de té siga el procedimiento correcto;
   - que la preparación de mate siga el procedimiento correcto;
   - que ambas infusiones sigan el mismo patrón base (calentar agua primero).

## Objetivo didáctico

El objetivo de este ejercicio es reconocer y aplicar el patrón de diseño **Template Method**.

En este caso:

- `Infusion` representa la **clase abstracta** que define el template method.
- `preparar()` representa el **template method** (el método que define el esqueleto del algoritmo).
- `doPreparar()` representa el **hook** (el método abstracto que las subclases deben implementar).
- `Te` y `Mate` representan las **subclases concretas** que implementan el paso específico.

La idea central es **definir la estructura de un algoritmo en una clase base**, permitiendo que las subclases **sobrescriban pasos específicos sin alterar la estructura general** del algoritmo.

## Diferencia con Strategy

A diferencia del patrón **Strategy** (que permite intercambiar algoritmos completos en tiempo de ejecución), el patrón **Template Method** define la estructura del algoritmo en tiempo de diseño mediante herencia. La decisión sobre qué implementación usar se toma en tiempo de compilación (al elegir qué subclase instanciar).

## Preguntas para pensar

Antes de implementar, analizar:

1. ¿Qué parte del procedimiento es **igual** para todas las infusiones?
2. ¿Qué parte del procedimiento es **diferente** según el tipo de infusión?
3. ¿Por qué no es una buena idea duplicar el código de "calentar agua" en cada subclase?
4. ¿Cómo se diferencia este enfoque del patrón Strategy que vimos anteriormente?
5. ¿Qué ventaja obtenemos al centralizar el algoritmo en la clase base?
6. ¿Qué sucedería si mañana el procedimiento general cambia (ej: agregar "enfriar un poco" al final)?
7. ¿Por qué usamos un método abstracto (`doPreparar()`) en lugar de un método concreto que la subclase simplemente sobrescribe?

## Extensión opcional

Agregar nuevas infusiones, por ejemplo:

- `Cafe` — verter agua caliente sobre granos de café molido.
- `Chocolate` — mezclar chocolate en polvo con agua caliente.
- `Hierbas` — verter agua caliente sobre una mezcla de hierbas secas.

La incorporación de cada nueva infusión debería requerir crear una nueva subclase concreta, **sin modificar la clase `Infusion`**.


> **Importante:** si para agregar una infusión nueva necesitás modificar la clase `Infusion`, revisá si estás aprovechando correctamente el patrón Template Method.
