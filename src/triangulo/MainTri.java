import java.util.Scanner;

public class MainTri {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor do lado 1: ");
        int templ1 = teclado.nextInt();
        System.out.print("Valor do lado 2: ");
        int templ2 = teclado.nextInt();
        System.out.print("Valor do lado 3: ");
        int templ3 = teclado.nextInt();

        Triangulo t1 = new Triangulo(templ1, templ2, templ3);
        t1.desenhar();
        t1.TrianguloValid();
    }
}
