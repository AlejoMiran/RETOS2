import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = sc.nextInt();

        double[] notas = new double[cantidadNotas];

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double promedio = calcularPromedio(notas);
        System.out.println("El promedio de las notas es: " + promedio);

        if (promedio < 3) {
            System.out.println("Reprobaste");
        } else if (promedio >= 3 && promedio <= 4.0) {
            System.out.println("Pasaste raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.length;
    }
}
   
