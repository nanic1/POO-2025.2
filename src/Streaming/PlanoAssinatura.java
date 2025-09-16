package Streaming;

public class PlanoAssinatura {
    private String nome;
    private int limiteQtdAssinantes;
    private int qtdTotalAssinantes;
    private float valorAssinatura;

    public PlanoAssinatura(String nome, int limiteQtdAssinantes, float valorAssinatura) {
        this.nome = nome;
        this.limiteQtdAssinantes = limiteQtdAssinantes;
        this.qtdTotalAssinantes = 0;
        this.valorAssinatura = valorAssinatura;
    }

    public void adicionarAssinante(){
        if (qtdTotalAssinantes < limiteQtdAssinantes) {
            qtdTotalAssinantes++;
        }

    }

    public void ofertarDesconto(float desconto){
        if (desconto < 0.5*valorAssinatura){
            valorAssinatura -= desconto;
        }
    }

    public void exibirInformações(){
        System.out.printf("Nome: ", nome);
        System.out.printf("Quantidade de assinantes: ", qtdTotalAssinantes);
        System.out.printf("Valor do plano: ", valorAssinatura);
    }
}
