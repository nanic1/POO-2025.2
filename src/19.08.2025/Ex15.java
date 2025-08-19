import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char c;
        int vogais = 0;
        int digitos = 0;
        int qntChar = 0;

        System.out.print("Digite um caracter (digite . para parar): ");
        c = teclado.next().charAt(0);
        while (c != '.'){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vogais++;
            }
            else if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'){
                digitos++;
            } else {
                qntChar++;
            }
            System.out.print("Digite um caracter (digite . para parar): ");
            c = teclado.next().charAt(0);
        }
        System.out.printf("Quantidade de numeros: %d\nQuantidade de vogais: %d\nQuantidade de caracteres: %d", digitos, vogais, qntChar);
    }
}
