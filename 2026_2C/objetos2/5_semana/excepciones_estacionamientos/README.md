# Sistema de estacionamiento (manejo de excepciones)

Se quiere desarrollar un pequeño sistema para registrar vehículos en un estacionamiento.

Cada Vehiculo tiene:

- un String con la patente;
- un Integer con las horasEstacionadas.

El costo del estacionamiento es de $5000 por cada hora.

Se pide:

1) Crear una excepción HorasInvalidasException que herede de RuntimeException.
2) Crear la clase Vehiculo.
3) El método setHorasEstacionadas(Integer horas) debe lanzar HorasInvalidasException si las horas son menores o iguales a 0.
4) En main, permitir ingresar hasta 3 vehículos por consola. Para cada uno se solicita:
    - patente;
    - cantidad de horas.
    - Si el usuario presiona Enter sin ingresar la patente, se debe finalizar el ingreso.
5) La carga de los datos debe realizarse dentro de un try.
6) Si se produce una HorasInvalidasException, capturarla con catch y mostrar su mensaje.
7) Al finalizar, mostrar los vehículos que pudieron registrarse correctamente junto con su costo.
8) Crear algunos tests para verificar el cálculo del costo y el lanzamiento de la excepción.