import java.util.Scanner;
public class Intervalos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Número 1: ");
        n1 = teclado.nextInt();
        System.out.print("Número 2: ");
        n2 = teclado.nextInt();
        System.out.print("Número 3: ");
        n3 = teclado.nextInt();

        if (n1 > n2 && n1 < n3){
            System.out.printf("Número %d está entre o número %d e o número %d.", n1, n2, n3);
        } else if (n1 > n2 && n1 > n3){
            System.out.printf("Número %d é maior que o número %d e maior que o número %d.", n1, n2, n3);
        } else if (n1 < n2 && n1 < n3){
            System.out.printf("Número %d é menor que o número %d e menor que o número %d.", n1, n2, n3);
        } else if (n1 == n2 || n1 == n3){
            System.out.println("Erro, tem valores iguais. Tente novamente.");
        } else {
            System.out.println("Erro, não foi possível completar a operação.");
        }
    }
}
