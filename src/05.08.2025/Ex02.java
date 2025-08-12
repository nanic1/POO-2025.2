import java.util.Scanner;
public class Ex02 {
    public static void main(String [] args) {
        float x;
        float y;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da varíavel X: ");
        x = teclado.nextFloat();

        System.out.println("Digite o valor da variavel Y: ");
        y = teclado.nextFloat();

        float soma = x+y;
        float sub = x-y;
        float mult = x*y;
        float div = x/y;

        System.out.printf("%.1f + %.1f = %.1f\n%.1f - %.1f = %.1f\n%.1f * %.1f = %.1f\n%.1f / %.1f = %.1f", x, y, soma, x, y, sub, x, y, mult, x, y, div);
    }
}