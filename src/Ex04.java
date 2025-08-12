import java.util.Scanner;
public class Ex04 {
    public static void main(String [] args)
    {
        Scanner teclado = new Scanner(System.in);

        double raio;
        double pi = 3.14159;
        System.out.println("App para calcular perimetro e área de um circulo.\nDigite o valor do raio do circulo que deseja calcular: ");
        raio = teclado.nextDouble();
        double area = pi * (raio * raio);
        double perimetro = 2 * pi * raio;

        System.out.printf("Valores do círculo calculados\nRaio = %.2f\nPerímetro = %.2f\nÁrea = %.2f", raio, perimetro, area);
    }
}
