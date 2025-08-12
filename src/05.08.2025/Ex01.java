import java.util.Scanner;
public class Ex01 {
    public static void main(String [] args) {
        int x;
        int y;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da varíavel X: ");
        x = teclado.nextInt();

        System.out.println("Digite o valor da variavel Y: ");
        y = teclado.nextInt();

        int soma = x+y;
        int sub = x-y;
        int mult = x*y;
        int div = x/y;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", x, y, soma, x, y, sub, x, y, mult, x, y, div);
    }
}