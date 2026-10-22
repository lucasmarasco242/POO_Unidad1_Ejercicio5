# Ejercicio 5 - Control de Límites Internos (Contador)

## Explicación del programa

En este ejercicio se creó una clase llamada `Contador` que contiene un atributo entero llamado `valor`.

Para la inicialización del objeto, se declararon dos constructores:
* Un constructor por defecto que inicializa el atributo `valor` en `0`.
* Un constructor parametrizado que recibe un valor inicial por parámetro y lo asigna mediante la referencia `this`.

Además, la clase cuenta con los siguientes métodos de instancia:
* `incrementar()`: Suma `1` al atributo `valor`.
* `decrementar()`: Resta `1` al atributo `valor`, protegiendo la coherencia de los datos mediante una estructura condicional `if/else` para garantizar que el valor nunca sea menor a cero (si llega a cero o es menor, permanece en cero).
* `resetear()`: Restablece el atributo `valor` dejándolo nuevamente en `0`.
* `getValor()`: Retorna el valor entero actual almacenado en el contador.

Luego, dentro del método `main`, se instanció un objeto de tipo `Contador` utilizando el constructor parametrizado:
`Contador miContador = new Contador(5);`

Finalmente, se invocaron secuencialmente los métodos para incrementar, decrementar y resetear el contador, imprimiendo por pantalla los resultados obtenidos con `System.out.println()`.

## Lógica utilizada

La lógica del programa consiste en:
* Crear la clase `Contador` con su atributo `valor`.
* Implementar la sobrecarga de constructores (por defecto y parametrizado) para flexibilidad en la instanciación.
* Definir el método `incrementar()` para sumar unidades.
* Implementar una regla de negocio en el método `decrementar()` utilizando un condicional `if/else` que evite valores negativos, manteniendo el límite en cero.
* Definir el método `resetear()` para limpiar o reiniciar el estado interno.
* Crear el método `getValor()` como un método de consulta (getter) para acceder de forma segura al estado actual del atributo.
* Simular en el `Main` el comportamiento del contador mediante llamadas a sus métodos y visualización del estado a través de la consola.

De esta manera se protegen los datos internos asegurando que cumplan con las reglas de negocio establecidas.

## Resultado de la ejecución

La ejecución del programa muestra en la consola los siguientes valores:
* Valor actual: 7
* Valor tras decrementar: 6
* Valor tras resetear: 0

## Captura de pantalla

<img width="1241" height="233" alt="image" src="https://github.com/user-attachments/assets/4812fa2d-16d5-4b7e-9ba1-740322438dfa" />
