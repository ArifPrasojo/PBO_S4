package Jobsheet11;
import Jobsheet11.*;
public class interfacemain {

    public static void main(String[] args) {
        Rektor paRektor = new Rektor();

        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana mastercumlaude = new PascaSarjana("Elok");

        paRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        paRektor.beriSertifikatCumlaude(mastercumlaude);

        paRektor.beriSertifikatMawapres(sarjanaCumlaude);
        paRektor.beriSertifikatMawapres(mastercumlaude);
    }
}
