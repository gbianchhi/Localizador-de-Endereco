import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Digite o CEP:");
        Scanner scanner = new Scanner(System.in);
        String CEP = scanner.nextLine();

        FormatadorDeCEP formatadorDeCEP = new FormatadorDeCEP();

        String CEPfinal = formatadorDeCEP.formatarCEP(CEP);

        BuscaCEPnoVIACEP buscaCEP = new BuscaCEPnoVIACEP();

        if (buscaCEP.buscarCEP(CEPfinal) == null) {
        } else {
            System.out.println(buscaCEP.buscarCEP(CEPfinal));
        }

        scanner.close();

    }
}
