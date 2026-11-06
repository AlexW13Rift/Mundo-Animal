package mx.com.animales;

public class Gato extends Animal{
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Así llevamos largo tiempo luego se marchó dejándome un mensaje que recuerdo hoy");

    }
}
