# Mundo-Animal

- Descripción

Proyecto desarrollado en Java como parte del bootcamp de Generation México, con el objetivo de aplicar los fundamentos de la Programación Orientada a Objetos (POO).

El programa representa diferentes animales, mostrando su información, sonidos y movimientos mediante el uso de herencia, polimorfismo, clases abstractas e interfaces.


- Funcionamiento

Se crean objetos de tipo Perro, Gato y Vaca.

Los objetos se almacenan en un arreglo Animal[].

Se recorre el arreglo utilizando un ciclo for.

Cada animal muestra su nombre, edad y sonido.

Mediante la interfaz Movible, cada animal muestra su movimiento.

- Cómo ejecutar el proyecto

Clonar el repositorio:

git clone https://github.com/AlexW13Rift/Mundo-Animal.git

Abrir el proyecto en IntelliJ IDEA.

Verificar que esté configurado el JDK de Java.

Abrir el archivo Main.java.

Ejecutar el método main().

💻 Ejemplo de salida

Nombre: Max
Edad: 3
Guau, guau!
El perro corre
--------------------
Nombre: Luna
Edad: 2
Miau!
El gato mueve la cola
--------------------
Nombre: Lola
Edad: 5
La vaca canta
La vaca comienza a bailar Payaso de Rodeo
--------------------

La salida puede variar según los sonidos y movimientos definidos en cada clase.

- Preguntas de reflexión

1. ¿Qué se reutiliza al heredar de Animal?

Se reutilizan los atributos nombre y edad, así como el método mostrarInformacion().

2. ¿Qué hace super(nombre, edad)?

Llama al constructor de la clase padre Animal para inicializar los atributos nombre y edad del objeto.

3. ¿Para qué sirve @Override?

Sirve para indicar que estamos sobrescribiendo un método heredado de una clase padre.

4. ¿Por qué el mismo método hacerSonido() produce resultados distintos?

Porque con el polimorfismo cada clase implementa su propia versión del método hacerSonido(), por lo que Java ejecuta el comportamiento correspondiente al objeto.

5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?

Una clase abstracta puede contener atributos, constructores y métodos implementados o abstractos. Una interfaz define un contrato de comportamiento que las clases implementan.

En este proyecto, Animal representa las características comunes de los animales, mientras que Movible establece que deben implementar el método moverse().

