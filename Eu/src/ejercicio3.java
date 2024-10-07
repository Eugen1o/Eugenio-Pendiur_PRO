import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int a = lectorTeclado.nextInt();
        String s = "negaivo";

        if (a<0) {
            System.out.println("negativo");
        } else if (a<10) {
            System.out.println("un dígito");
        } else if (a<99) {
            System.out.println("dos digito");
        } else if (a<99) {
            System.out.println("tres dígitos");
        }
    }
}
