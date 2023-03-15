package br.com.estoque;

public class MainEstoque {

    public static void main(String[] args) {


        Estoque e1 = new Estoque();
        e1.setNome(("Caneta"));
        e1.setQtaAtual(10);
        e1.setQtaMinima(5);
        System.out.println(e1.mostra());
        
         Estoque E2 = new Estoque(1,"Caderno",20,1);
        E2.darBaixa(10);
        System.out.println("Estoque Atual: "+ E2.getQtaAtual());
        E2.darBaixa(100);
        System.out.println(E2.precisaRepor());
    }

}
