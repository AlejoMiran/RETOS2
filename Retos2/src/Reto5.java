import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        String[] cartas = {"A", "B", "C", "D", "E", "F", "G", "H"};
        List<String> listaCartas = Arrays.asList(cartas);
        Collections.shuffle(listaCartas);

        String[] tablero = new String[8];
        boolean[] cartasEncontradas = new boolean[8];
        int paresEncontrados = 0;

        Scanner scanner = new Scanner(System.in);

        while (paresEncontrados < 4) {
            System.out.println("=== Juego de Concentración ===");
            System.out.println("Encuentra los pares de cartas.");

            // Mostrar el tablero actual
            for (int i = 0; i < 8; i++) {
                if (cartasEncontradas[i]) {
                    System.out.print("[" + tablero[i] + "] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();

            // Solicitar al jugador que elija dos cartas
            System.out.print("Ingrese la posición de la primera carta: ");
            int pos1 = scanner.nextInt();

            System.out.print("Ingrese la posición de la segunda carta: ");
            int pos2 = scanner.nextInt();

            if (pos1 < 0 || pos1 >= 8 || pos2 < 0 || pos2 >= 8 || cartasEncontradas[pos1] || cartasEncontradas[pos2]) {
                System.out.println("¡Posición inválida o carta ya encontrada! Intente nuevamente.");
                continue;
            }

            // Mostrar las cartas seleccionadas
            System.out.println("Carta 1: " + listaCartas.get(pos1));
            System.out.println("Carta 2: " + listaCartas.get(pos2));

            // Verificar si las cartas forman un par
            if (listaCartas.get(pos1).equals(listaCartas.get(pos2))) {
                System.out.println("¡Encontraste un par!");
                cartasEncontradas[pos1] = true;
                cartasEncontradas[pos2] = true;
                paresEncontrados++;
            } else {
                System.out.println("No forman un par. Sigue intentando.");
            }

            System.out.println();
        }

        System.out.println("¡Felicitaciones! ¡Has encontrado todos los pares!");
    }
}
