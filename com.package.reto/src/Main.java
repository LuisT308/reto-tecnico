import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList<>();
        Animal animal;
        String nombre = "";
        String tipo = "";
        String onomatopeya = "";

        for(int i=0;;) {
            System.out.print("Ingrese el animal: ");
            nombre = scanner.nextLine();
            System.out.print("Ingrese tipo (terrestre/volador/acuatico): ");
            tipo = scanner.nextLine();
            System.out.print("Ingrese la onomatopeya del animal: ");
            onomatopeya = scanner.nextLine();
            animal = new Animal(nombre, tipo, onomatopeya);

            animales.add(animal);
            System.out.println("¿Desea ingresar más animales? s/n: ");
            if(scanner.nextLine().equals("s"))
                continue;
            else
                break;
        }

        while (!animales.isEmpty()) {
            String aux = animales.get(0).getTipo();
            System.out.println("Los animales de la especie " + aux + " son:");
            System.out.println(animales.get(0).getNombre());
            for (int i = 1; i < animales.size(); i++) {
                if (aux.equals(animales.get(i).getTipo())) {
                    System.out.println(animales.get(i).getNombre());
                    animales.remove(i);
                }
            }
            animales.remove(0);
        }
    }
}