import java.util.Scanner;
public class ExHoras {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int t;
        System.out.print("Conversor de tempo, digite segundos e converteremos em horas e minutos: ");
        t = teclado.nextInt();
        int horas = t/3600;
        int minutos = (t % 3600)/ 60;
        int segundos = (t % 60);

        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);



    }
}
