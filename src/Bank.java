import java.util.ArrayList;

public class Bank {
    private ArrayList<Konto> kontenListe; // Liste aller Konten

    // Konstruktor
    public Bank() {
        kontenListe = new ArrayList<>();
    }

    // Konto erstellen und zur Liste hinzufügen
    public void kontoErstellen(Konto konto) {

        kontenListe.add(konto);
        System.out.println("Konto mit Kontonummer " + konto.getKontonummer() + " wurde erstellt.");
    }

    // Konto anhand der Kontonummer suchen
    public Konto kontoSuchen(String kontonummer) {

        for (Konto konto : kontenListe) {
            if (konto.getKontonummer().equals(kontonummer)) {
                return konto;
            }
        }

        throw new IllegalArgumentException("Konto mit Kontonummer " + kontonummer + " nicht gefunden!");
    }
}
