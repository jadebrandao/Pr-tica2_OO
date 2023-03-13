import java.util.Scanner;
import br.com.newton.Rendimento;
public class Main {
    public static void main(String[] args) {

        Rendimento rendimento = new Rendimento();
        Scanner  ler = new Scanner(System.in);

        double taxaDeInvestimento  = 1;

        System.out.print("Digite o valor de investimento: ");
        double investimentoInicial = ler.nextDouble();

        System.out.print("Digite o tempo: ");
        double numeroDeMeses = ler.nextDouble();

        double investimento = (investimentoInicial+(investimentoInicial*(numeroDeMeses/100)*taxaDeInvestimento));
        System.out.println("Total do rendimento: " + investimento + "R$");
    }
}


