import java.util.Scanner;
public class KiloWats {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float consumo, valor;

        System.out.print("Consumo em kWh: ");
        consumo = teclado.nextFloat();
        System.out.print("Valor do kWh: R$");
        valor = teclado.nextFloat();

        float pay = consumo * valor;
        float condicao = (consumo < 150) ? pay - (pay * 0.1f) : pay;
        System.out.printf("Valor a ser pago: R$%.2f", pay);
    }
}
