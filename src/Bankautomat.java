public class Bankautomat {
    Konto aktuellesKonto; // Das Konto, mit dem aktuell gearbeitet wird

    // Karte einlegen
    public void karteEinführen(Konto konto) {
        if (aktuellesKonto != null) {
            System.out.println("Ein Konto ist bereits eingelegt! Bitte erst die Karte auswerfen.");
            return;
        }
        aktuellesKonto = konto;
        System.out.println("Karte für Konto " + konto.getKontonummer() + " eingelegt.");
    }

    // Geld abheben
    public void geldAbheben(double betrag) {
        if (aktuellesKonto == null) {
            System.out.println("Kein Konto eingelegt! Bitte eine Karte einführen.");
            return;
        }
        try {
            aktuellesKonto.abheben(betrag);
            System.out.println("Betrag von " + betrag + " Euro abgehoben.");
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

    // Geld einzahlen
    public void geldEinzahlen(double betrag) {
        if (aktuellesKonto == null) {
            System.out.println("Kein Konto eingelegt! Bitte eine Karte einführen.");
            return;
        }
        try {
            aktuellesKonto.einzahlen(betrag);
            System.out.println("Betrag von " + betrag + " Euro eingezahlt.");
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

    // Kontostand anzeigen
    public void kontostandAnzeigen() {
        if (aktuellesKonto == null) {
            System.out.println("Kein Konto eingelegt! Bitte eine Karte einführen.");
            return;
        }
        System.out.println("Aktueller Kontostand: " + aktuellesKonto.getKontostand() + " Euro");
    }

    // Karte auswerfen
    public void karteAuswerfen() {
        if (aktuellesKonto == null) {
            System.out.println("Kein Konto eingelegt! Bitte eine Karte einführen.");
            return;
        }
        System.out.println("Karte für Konto " + aktuellesKonto.getKontonummer() + " wurde ausgeworfen.");
        aktuellesKonto = null; // Konto entfernen
    }
}
