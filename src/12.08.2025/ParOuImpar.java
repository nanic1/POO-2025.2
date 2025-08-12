import java.util.Scanner;
public class ParOuImpar {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Digite um número inteiro: ");
        n = teclado.nextInt();

        String resultado = (n % 2 == 0) ? "par" : "ímpar";
        System.out.printf("O número %d é %s", n, resultado);
    }
}
