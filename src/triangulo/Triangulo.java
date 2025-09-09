public class Triangulo {
    private int l1;
    private int l2;
    private int l3;

    public Triangulo(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public int getl1() {
        return l1;
    }
    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getl2() {
        return  l2;
    }
    public void setl2(int l2) {
        this.l2 = l2;
    }

    public int getl3() {
        return  l3;
    }
    public void setl3(int l3) {
        this.l3 = l3;
    }

    public void TrianguloValid() {
        if (l1 + l2 > l3 && l1 + l3 > l2 && l3 + l2 > l1) {
            System.out.println("É um triângulo.");;
        } else {
            System.out.println("Não é um triângulo.");;
        }
    }

    public void desenhar() {
        System.out.printf("Lado 1: %d\n",l1);
        System.out.printf("Lado 2: %d\n",l2);
        System.out.printf("Lado 3: %d\n",l3);
    }
}
