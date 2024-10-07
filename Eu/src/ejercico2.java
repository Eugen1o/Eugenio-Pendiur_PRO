import java.util.Scanner;

public class ejercico2 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int a = lectorTeclado.nextInt();

        if (a%2==0){
            a += 1;
        } else if (a%2!=0 & a<10) {
            a -= 1;
        } else if (a%2!=0 | a<10 & a<100) {
            a = (a*2)+1;
        } else if (a%2!=0 & a>=10 & a >=100) {
            a = 0;

        }
    }
}
