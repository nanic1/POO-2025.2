public class Circulo {
    private double PI = 3.14159;
    private int centro;
    private float raio;

    public Circulo(float raio, int centro) {
        this.raio = raio;
        this.centro = centro;
    }

    public int getCentro() {
        return centro;
    }
    public void setCentro(int centro) {
        this.centro = centro;
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public double area(){
        return PI * (raio * raio);
    }
    public double perimetro(){
        return 2 * PI * raio;
    }

    public void desenhar() {
        System.out.printf("Centro: %d", centro);
        System.out.printf("Raio: %f", raio);
        System.out.printf("Área: %f", area());
        System.out.printf("Perímetro: %f", perimetro());
    }
}
