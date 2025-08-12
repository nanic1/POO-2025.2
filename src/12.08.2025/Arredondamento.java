import java.util.Scanner;
public class Arredondamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x;

        System.out.print("Digite um número real: ");
        x = teclado.nextFloat();

        int parteInteira = (int) x;
        float parteReal = x - parteInteira;

        if (parteReal >= 0.5f){
            x = parteInteira + 1;
        }
        else {
            x = parteInteira;
        }
        System.out.printf("Número arredondado: %.0f", x);
    }
}
