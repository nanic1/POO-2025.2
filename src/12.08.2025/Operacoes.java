import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a, b, resultado;
        char op;

        System.out.print("Valor 1: ");
        a = teclado.nextInt();
        System.out.print("Valor 2: ");
        b = teclado.nextInt();
        System.out.print("Digite um simbolo operacional aritimético (+, -, * ou /): ");
        op = teclado.next().charAt(0);

        switch (op){
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", a, b, a + b);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", a, b, a - b);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", a, b, a * b);
                break;
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", a, b, a / b);
                break;
            default:
                System.out.println("ERRO. Expressão aritimética não reconhecida, tente novamente.");
        }
    }
}
