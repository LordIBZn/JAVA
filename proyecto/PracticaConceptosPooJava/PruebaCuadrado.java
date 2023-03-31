import java.util.Scanner;

public class PruebaCuadrado {
    public static void main(String[] args) {
        String color;
        double ladoDelcuadrado;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el color del cuadrado: ");
        color = scanner.nextLine();

        System.out.print("Introduzca el lado del cuadrado: ");
        ladoDelcuadrado = scanner.nextDouble();

        Cuadrado cuadrado1 = new Cuadrado(color, ladoDelcuadrado);

        System.out.printf("El área del cuadrado %s es: %f", cuadrado1.getColor(), cuadrado1.calularArea());

    }
}
