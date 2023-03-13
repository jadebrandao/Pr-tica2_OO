package br.com.newton;

public class Rendimento {
    private double investimentoInicial;
    private double taxaDeInvestimento;
    private int numeroDeMeses;

    public Rendimento(double investimentoInicial, double taxaDeInvestiento, int numeroDeMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaDeInvestimento = taxaDeInvestiento;
        this.numeroDeMeses = numeroDeMeses;
    }

    public Rendimento() {

    }


    public double getInvestimentoInicial() {

        return investimentoInicial;
    }

    public void setInvestimentoInicial(double investimentoInicial) {

        this.investimentoInicial = investimentoInicial;
    }

    public double getTaxaDeInvestiento() {

        return taxaDeInvestimento;
    }

    public void setTaxaDeInvestiento(double taxaDeInvestiento) {

        this.taxaDeInvestimento = taxaDeInvestiento;
    }

    public int getNumeroDeMeses() {

        return numeroDeMeses;
    }

    public void setNumeroDeMeses(int numeroDeMeses) {

        this.numeroDeMeses = numeroDeMeses;
    }

}