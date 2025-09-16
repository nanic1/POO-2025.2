package Funcionalidades;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean ehBissexto() {
        if ((ano % 4 == 0 && ano % 100 == 0) || (ano % 400 == 0)){
            return true;
        } else return false;
    }

    public boolean ehValida() {
        if (ano < 0) {
            return false;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia > 0 && dia < 32) {
                return true;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia > 0 && dia < 31) {
                    return true;
                } else {
                    if ((ehBissexto()) && dia < 30 || (!ehBissexto()))
                }
            }
        }
    }

}
