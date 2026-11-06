package mx.com.animales;

public class Main {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Lola", 4);
        Perro perro = new Perro("Máx", 3);
        Gato gato = new Gato("Whiskas", 2);
        Caballo caballo = new Caballo("Burro", 5);

        Animal[] animales = {vaca, perro, gato, caballo};

        for (Animal animal : animales) {

            animal.mostrarInformacion();
            animal.hacerSonido();

            Movible movimiento = (Movible) animal;
            movimiento.moverse();

            System.out.println("--------------------");
        }
    }
}