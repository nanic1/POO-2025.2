package SalaDeAula;

public class CanetaPiloto {
    private float carga;
    public void escrever(float cargaASerGasta, Quadro quadro){
        float cargaAEscrever = 0;
        if (this.carga >= cargaASerGasta) cargaAEscrever = cargaASerGasta;
        else cargaAEscrever = this.carga;
        this.carga -= cargaASerGasta;
        quadro.setPercentualPreenchido(quadro.getPercentualPreenchido() + cargaAEscrever);
    }
}
