
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qué tipo de café quieres?\nEspresso\nLatte\nCappuccino");
        String tipoCafe = scanner.next();

        System.out.println("¿Cuántas cucharaditas de azúcar quieres? ");
        int cantidadAzucar = scanner.nextInt();

        System.out.println("¿Qué tamaño de café quieres?\nPequeño\nMediano\nGrande");
        String tamanoCafe = scanner.next();

        System.out.printf("Preparando un %s de tamaño %s con %d cucharaditas de azúcar", tipoCafe, tamanoCafe, cantidadAzucar);
    }
}

