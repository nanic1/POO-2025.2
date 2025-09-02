public class Retangulo {
    private int pontoX;
    private int pontoY;
    private int largura;
    private int altura;

    public Retangulo(int pontoX, int pontoY, int largura, int altura) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
        this.largura = largura;
        this.altura = altura;
    }

    public void desenhar(){
        System.out.printf("Retangulo(%d, %d, %d, %d)\n", this.pontoX, this.pontoY, this.largura, this.altura);
    }

    public void desenharTrue() {
        // Altura e Largura minima
        if (largura < 2 || altura < 2) {
            System.out.println("Largura e altura devem ser pelo menos 2 para desenhar o retângulo.");
            return;
        }

        // Largura Cima
        System.out.print("+");
        for (int i = 0; i < largura - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        // Altura
        for (int j = 0; j < altura - 2; j++) {
            System.out.print("|");
            for (int i = 0; i < largura - 2; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        // Largura Baixo,
        System.out.print("+");
        for (int i = 0; i < largura - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public void dividir(int divisor){
        this.largura = largura / divisor;
        this.altura = altura / divisor;
    }
}




