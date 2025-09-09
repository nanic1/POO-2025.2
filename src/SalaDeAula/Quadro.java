package SalaDeAula;

public class Quadro {
    private float percentualPreenchido;

    public float getPercentualPreenchido() {
        return percentualPreenchido;
    }

    public void setPercentualPreenchido(float preenchimento) {
        if (preenchimento > 0 && preenchimento
                <= 100) percentualPreenchido = preenchimento;
    }

    public boolean sePreencher(float qtdCarga) {
        if (qtdCarga <= 0 || percentualPreenchido >= 100) {
            return false;
        }

        float espacoDisponivel = 100 - percentualPreenchido;
        if (qtdCarga <= espacoDisponivel) {
            percentualPreenchido += qtdCarga;
            return true;
        }
    }
}
