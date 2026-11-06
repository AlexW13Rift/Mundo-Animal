package mx.com.animales;

public class Caballo extends Animal implements Movible{
    public Caballo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Troto, troto, troto, relincho");

    }

    @Override
    public void moverse() {
        System.out.println("El caballo comienza a mover sus patas");
        System.out.println("Da la vuelta y termina relinchando");

    }
}
