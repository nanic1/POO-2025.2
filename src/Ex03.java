import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario;
        double aumento = 0.1; // 10% aumento

        System.out.println("Digite seu salário em R$");
        salario = teclado.nextDouble();
        double newSalario = salario  + (salario * aumento);

        System.out.printf("Parabéns! Você recebeu um aumento de 10%%! Seu salário passou de R$%.2f, para R$%.2f", salario, newSalario);
    }
}
