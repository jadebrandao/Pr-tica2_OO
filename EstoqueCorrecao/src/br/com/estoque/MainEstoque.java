package br.com.estoque;

public class MainEstoque {

    public static void main(String[] args) {


        Estoque e1 = new Estoque();
        e1.setNome(("Caneta"));
        e1.setQtaAtual(10);
        e1.setQtaMinima(5);
        System.out.println(e1.mostra());
    }

}
