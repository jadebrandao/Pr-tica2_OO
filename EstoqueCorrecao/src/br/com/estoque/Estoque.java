package br.com.estoque;

public class Estoque {

    private int codProduto;
    private String nome;
    private int qtaAtual;
    private int qtaMinima;

    public Estoque() {
    }

    public Estoque(int codProduto, String nome, int qtaAtual, int qtaMinima) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.qtaAtual = qtaAtual;
        this.qtaMinima = qtaMinima;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtaAtual(int qtaAtual) {
        this.qtaAtual = qtaAtual;
    }

    public void setQtaMinima(int qtaMinima) {
        this.qtaMinima = qtaMinima;
    }

    public Estoque(int cod, String produto) {
        this.codProduto = cod;
        this.nome = produto;


    }

    public int getCodProduto() {
        return codProduto;
    }

    public String getNome() {
        return nome;
    }

    public int getQtaAtual() {
        return qtaAtual;
    }

    public int getQtaMinima() {
        return qtaMinima;
    }

    public void darbaixa(int qta) {
        if (qta <= qtaAtual)
            qtaAtual = qtaAtual - qta;

        else
            System.out.println("Estoque insufiente para baixa! ");
    }

    public String mostra() {
        return "produto " +"\nqtde Atual " + this.qtaMinima + "\nqtde atual " + this.qtaAtual;

    }
    public boolean precisaRepor(){
        if (getQtaAtual()<=getQtaMinima())
            return true;
        else
            return false;
    }

}

