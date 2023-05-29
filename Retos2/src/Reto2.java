import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese la cantidad de competidores:");
        int cantidadCompetidores = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[cantidadCompetidores];
        double[] tiempos = new double[cantidadCompetidores];

        for (int i = 0; i < cantidadCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

        System.out.print("Ingrese el tiempo del competidor " + (i + 1) + ": ");
            tiempos[i] = sc.nextDouble();
            sc.nextLine();

        }

        System.out.println("\nResultados de la competencia:");
        for (int i = 0; i < cantidadCompetidores; i++) {
            System.out.println(nombres[i] + ": " + tiempos[i] + " segundos");
        }

        int indiceGanador = 0;
        for (int i = 1; i < cantidadCompetidores; i++) {
            if (tiempos[i] < tiempos[indiceGanador]) {
                indiceGanador = i;
            }
        }
        
        System.out.println("\nEl ganador es: " + nombres[indiceGanador] + " con un tiempo de " + tiempos[indiceGanador] + " segundos.");
    }
}
