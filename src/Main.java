import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor de X: ");
        int tempX = teclado.nextInt();
        System.out.print("Valor de Y: ");
        int tempY = teclado.nextInt();
        System.out.print("Valor da Largura: ");
        int tempLargura = teclado.nextInt();
        System.out.print("Valor da Altura: ");
        int tempAltura = teclado.nextInt();


        Retangulo r1 = new Retangulo(tempX, tempY, tempLargura, tempAltura);
        System.out.printf("Informações do retângulo:\n\nAltura: %d\nLargura: %d\nPosição X: %d\nPosição Y: %d\n\n", tempAltura, tempLargura, tempX, tempY);
        r1.desenhar();
        r1.desenharTrue();
        r1.dividir(4);
        r1.desenhar();
    }
}


