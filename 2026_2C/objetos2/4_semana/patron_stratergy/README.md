# Calculadora de operaciones — Patrón Strategy

## Enunciado

Se desea desarrollar una **calculadora de dos operandos** que permita realizar distintas operaciones matemáticas sobre dos números enteros.

La calculadora debe poder cambiar la operación que utiliza **sin modificar su código interno**. Para ello, cada operación debe encapsular su comportamiento en una estrategia independiente.

Inicialmente, el sistema deberá permitir realizar las siguientes operaciones:

- **Suma:** dados dos números enteros, devuelve su suma.
- **Multiplicación:** dados dos números enteros, devuelve su producto.

La calculadora debe recibir una estrategia de operación y utilizarla para resolver una cuenta. La estrategia podrá cambiarse durante la vida de la calculadora.

### Ejemplo de uso esperado

Una calculadora puede configurarse inicialmente para sumar:

```java
Calculadora calculadora = new Calculadora();
calculadora.setEstrategia(new SumarStrategy());

calculadora.resolver(1, 2); // devuelve 3
```

Luego, la misma calculadora puede configurarse para multiplicar:

```java
calculadora.setEstrategia(new MultiplicarStrategy());

calculadora.resolver(3, 2); // devuelve 6
```

## Requerimientos

1. Crear una abstracción común para las operaciones matemáticas.
2. Implementar una estrategia concreta para la **suma**.
3. Implementar una estrategia concreta para la **multiplicación**.
4. La clase `Calculadora` debe delegar el cálculo en la estrategia configurada.
5. La calculadora debe permitir cambiar la estrategia sin necesidad de modificar su implementación.
6. Cada operación debe poder probarse de manera independiente.
7. Agregar las pruebas necesarias para verificar, como mínimo:
   - que la estrategia de suma calcule correctamente;
   - que la estrategia de multiplicación calcule correctamente;
   - que una misma calculadora pueda cambiar de estrategia y utilizar la nueva operación.

## Objetivo didáctico

El objetivo de este ejercicio es reconocer y aplicar el patrón de diseño **Strategy**.

En este caso:

- `Calculadora` representa el **contexto**.
- `OperacionStrategy` representa la **estrategia**.
- `SumarStrategy` y `MultiplicarStrategy` representan **estrategias concretas**.

La idea central es **encapsular algoritmos que pueden variar detrás de una abstracción común**, permitiendo intercambiarlos sin modificar el objeto que los utiliza.

## Preguntas para pensar

Antes de implementar, analizar:

1. ¿Qué comportamiento de la calculadora puede variar?
2. ¿Qué responsabilidad debería tener `Calculadora` y cuál debería delegar?
3. ¿Qué problema aparecería si todas las operaciones se implementaran mediante un `if` o `switch` dentro de `Calculadora`?
4. ¿Qué beneficio obtenemos al poder agregar una nueva operación sin modificar `Calculadora`?
5. ¿Qué debería ocurrir si mañana necesitamos agregar `RestarStrategy` o `DividirStrategy`?

## Extensión opcional

Agregar nuevas operaciones, por ejemplo:

- `RestarStrategy`
- `DividirStrategy`
- `PotenciarStrategy`

La incorporación de cada nueva operación debería requerir crear una nueva estrategia concreta, **sin modificar la clase `Calculadora`**.

> **Pista:** si para agregar una operación nueva necesitás tocar el código de `Calculadora`, revisá si estás aprovechando correctamente el patrón Strategy.
