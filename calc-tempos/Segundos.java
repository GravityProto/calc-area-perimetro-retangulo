import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            ;
            System.out.println("Fale a quantidade de dias");
            int dias1 = scan.nextInt();
            
           
            System.out.println("Fale a quantidade de horas");
            int horas1 = scan.nextInt();

            
            System.out.println("Fale a quantidade de minutos");
            int minutos1 = scan.nextInt();
            
            
            System.out.println("Fale a quantidade de segundos");
            int segundos1 = scan.nextInt();

            int totalsegundos = dias1 * 24 * 3600 + horas1 * 3600 + minutos1 * 60 + segundos1;
            System.out.println(totalsegundos);
        }
        finally{
            scan.close();
        }
    }
}
