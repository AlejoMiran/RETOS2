import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] productos = new String[16];
        double[] precios = new double[16];


        System.out.println("=== Llenar la máquina ===");
        for (int i = 0; i < 16; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i] = sc.nextLine();

            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        System.out.println("\n=== Catálogo de productos ===");
        System.out.println("Código\tNombre\t\tPrecio");
        for (int i = 0; i < 16; i++) {
            System.out.println(i + "\t" + productos[i] + "\t\t$" + precios[i]);
        }
    }
}