public class FormatadorDeCEP {

    public String formatarCEP(String CEP) {
        String CEP2 = CEP.replace("-", "");
        String CEPfinal = CEP2.replace(".", "");
        return CEPfinal;
    }
}
