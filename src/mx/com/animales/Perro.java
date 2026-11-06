package mx.com.animales;

public class Perro extends Animal implements Movible{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("No ves que soy muy poco artístico muy listo muy gracioso soy payaso de rodeo, ho");

    }

    @Override
    public void moverse() {
        System.out.println("El perro comienza a moverse");
        System.out.println("Mueve la cola");

    }
}
