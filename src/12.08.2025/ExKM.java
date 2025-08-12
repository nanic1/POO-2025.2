import java.util.Scanner;

public class ExKM {
    public static void main(String [] arg){
        Scanner teclado = new Scanner(System.in);
        int distancia;
        int hora;
        int gasolina;

        System.out.print("Digite a distancia percorrida pelo carro em KM: ");
        distancia = teclado.nextInt();
        System.out.print("Digite o tempo gasto para chegar em seu destino em horas: ");
        hora = teclado.nextInt();
        System.out.print("Digite o quanto de gasolina foi consumido em litros: ");
        gasolina = teclado.nextInt();

        int velocidade = distancia / hora;
        int consumo = distancia / gasolina;

        System.out.printf("Velocidade média: %d\nConsumo de combustível: %d", velocidade, consumo);

    }
}
