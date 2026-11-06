
# 🐾 Mundo Animal 

## 📖 Descripción

**Mundo Animal** es un proyecto desarrollado en Java como parte del bootcamp de **Generation México**.

Su objetivo es aplicar los fundamentos de la Programación Orientada a Objetos (POO) mediante la representación de distintos animales, sus características, sonidos y movimientos.

Cada animal tiene comportamientos propios, implementados mediante herencia, sobrescritura de métodos e interfaces.


## 📂 Estructura del proyecto

```text
MundoAnimal/
├── src/
│   └── mx/com/animales/
│       ├── Animal.java
│       ├── Perro.java
│       ├── Gato.java
│       ├── Vaca.java
│       ├── Movible.java
│       └── Main.java
└── README.md
```



## 🚀 Cómo ejecutar el proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/AlexW13Rift/Mundo-Animal.git
```

### 2. Abrir el proyecto

Abre la carpeta del proyecto en **IntelliJ IDEA**.

### 3. Configurar Java

Verifica que tengas instalado y configurado un JDK compatible.

### 4. Ejecutar

Abre `Main.java` y ejecuta el método `main()`.

##  Ejemplo de salida

```text
Nombre: Max
Edad: 3
Guau, guau!
El perro corre
----------------------------

Nombre: Luna
Edad: 2
Miau!
El gato mueve la cola
----------------------------

Nombre: Lola
Edad: 5
La vaca canta
La vaca comienza a bailar Payaso de Rodeo
----------------------------
```

> **Nota:** Los sonidos y movimientos pueden variar según la implementación de cada clase.

## 🧠 Preguntas de reflexión

### 1. ¿Qué se reutiliza al heredar de Animal?

Se reutilizan los atributos `nombre` y `edad`, así como el método `mostrarInformacion()`.

### 2. ¿Qué hace super(nombre, edad)?

Llama al constructor de la clase padre `Animal` para inicializar los atributos `nombre` y `edad`.

### 3. ¿Para qué sirve @Override?

Indica que estamos sobrescribiendo un método heredado o implementando un método declarado en una interfaz.

### 4. ¿Por qué el mismo método hacerSonido() produce resultados distintos?

Porque utilizamos **polimorfismo**. Cada clase implementa su propia versión de `hacerSonido()` y Java ejecuta el comportamiento correspondiente al objeto real.

### 5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?

Una **clase abstracta** puede contener atributos, constructores y métodos concretos o abstractos.

Una **interfaz** define un contrato de comportamiento que las clases deben cumplir al implementarla.

En este proyecto, `Animal` representa las características comunes de los animales, mientras que `Movible` define su capacidad de movimiento.
