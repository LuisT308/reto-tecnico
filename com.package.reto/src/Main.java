import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList<>();
        Animal animal;
        String nombre = "";
        String especie = "";
        String onomatopeya = "";

        for(int i=0;;) {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            System.out.print("Especie: ");
            especie = scanner.nextLine();
            System.out.print("Onomatopeya: ");
            onomatopeya = scanner.nextLine();
            animal = new Animal(nombre, especie, onomatopeya);

            System.out.println("Nombre " + animal.getNombre());
            animales.add(animal);
            System.out.println("¿Desea ingresar más animales? S/N:");
            if(scanner.nextLine().equals("S"))
                continue;
            else
                break;
        }

        while (!animales.isEmpty()) {
            String aux = animales.get(0).getEspecie();
            System.out.println("Los animales de la especie " + aux + " son:");
            System.out.println(animales.get(0).getNombre());
            for (int i = 1; i < animales.size(); i++) {
                if (aux.equals(animales.get(i).getEspecie())) {
                    System.out.println(animales.get(i).getNombre());
                    animales.remove(i);
                }
            }
            animales.remove(0);
        }
    }
}