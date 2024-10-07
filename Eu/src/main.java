public class main {

    public static void main(String[] args) {

        int nota =6;
        // if -> 0-10 nota corecta
        if(nota>=0 && nota<=10) {


            String mensaje = "Nota perfecta";
            System.out.println("la nota es corecta");
            // decido que tipo de nota es
            // ss -> 0-4.99
            // ap -> 5-6.99
            // nt -> 7-8.99
            // sb -> 9-9.99
            // mt -> 10

            if (nota<5){
                System.out.println("55");
            } else if (nota<7) {
                System.out.println("AP");
            } else if (nota<9) {
                System.out.println("N1");
            } else if (nota<10) {
                System.out.println("SB");
            } else {
                System.out.println("MH");
            }


        }else {
            System.out.println("La nota no es corecta");
        }

        System.out.println("Terminado la ejucucion");




    }






}
