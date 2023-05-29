import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = "verde";
        char[] palabraOculta = new char[palabra.length()];
        boolean[] letrasEncontradas = new boolean[26];

        int intentos = 3;
        int letrasEncontradasCount = 0;

        while (true) {
            System.out.println("Adivina la palabra: ");
            for (int i = 0; i < palabra.length(); i++) {
                if (letrasEncontradas[palabra.charAt(i) - 'a']) {
                    palabraOculta[i] = palabra.charAt(i);
                } else {
                    palabraOculta[i] = '_';
                }
            }
            System.out.println(palabraOculta);

            System.out.println("Intentos restantes: " + intentos);

            if (letrasEncontradasCount == palabra.length()) {
                System.out.println("¡Has ganado!");
                break;
            }

            if (intentos == 0) {
                System.out.println("¡Has perdido! La palabra era: " + palabra);
                break;
            }

            System.out.println("Ingresa una letra: ");
            String input = sc.nextLine();

            if (input.length() != 1) {
                System.out.println("Ingresa solo una letra.");
                continue;
            }

            char letra = input.charAt(0);

            if (letrasEncontradas[letra - 'a']) {
                System.out.println("La letra ya ha sido ingresada.");
                continue;
            }

            letrasEncontradas[letra - 'a'] = true;

            boolean letraEncontrada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    letrasEncontradasCount++;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                intentos--;
                System.out.println("La letra no se encuentra en la palabra.");
            } else {
                System.out.println("¡Letra encontrada!");
            }
        }

        sc.close();
    }
}
