package mx.com.animales;

public class Vaca extends Animal implements Movible{
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Les digo ven, ven, ven, animalito ven,ven y sígueme y verás lo que vas a aprender");

    }

    @Override
    public void moverse() {

    }
}
