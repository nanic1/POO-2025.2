import java.util.Scanner;

public class ParEImparIntervalos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        int soma = 0;
        int qnt = 0;

        System.out.print("A = ");
        a = teclado.nextInt();
        System.out.print("B = ");
        b = teclado.nextInt();

        if (a < b) {
            System.out.printf("Números pares entre o intervalo de %d e %d:\n", a, b);
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    soma += i;
                    qnt++;
                }
            }
        } else if (a > b) {
            System.out.printf("Números pares entre o intervalo de %d e %d:\n", a, b);
            for (int i = a; i >= b; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    soma += i;
                    qnt++;
                }
            }
        } else {
            System.out.println("Intervalo inválido: os números são iguais.");
        }

        if (qnt > 0) {
            System.out.printf("\nSoma dos números pares: %d\n", soma);
            double media = (double) soma / qnt;
            System.out.printf("Média dos números pares: %.2f\n", media);
        } else if (a != b) {
            System.out.println("Não há números pares no intervalo.");
        }
    }
}
