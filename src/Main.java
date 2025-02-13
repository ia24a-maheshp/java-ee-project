import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        Girokonto girokonto = new Girokonto("DE123", 500.0, 1000.0);
        Sparkonto sparkonto = new Sparkonto("DE456", 1000.0);
        bank.kontoErstellen(girokonto);
        bank.kontoErstellen(sparkonto);

        Bankautomat automat = new Bankautomat();

        while (true) {
            System.out.println("\n--- Bankautomat ---");
            System.out.println("1. Girokonto einlegen");
            System.out.println("2. Sparkonto einlegen");
            System.out.println("3. Geld abheben");
            System.out.println("4. Geld einzahlen");
            System.out.println("5. Kontostand anzeigen");
            System.out.println("6. Karte auswerfen");
            System.out.println("7. Beenden");
            System.out.print("Option wählen: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    automat.karteEinführen(girokonto);
                    break;
                case 2:
                    automat.karteEinführen(sparkonto);
                    break;
                case 3:
                    System.out.print("Betrag abheben: ");
                    double abhebenBetrag = scanner.nextDouble();
                    automat.geldAbheben(abhebenBetrag);
                    break;
                case 4:
                    System.out.print("Betrag einzahlen: ");
                    double einzahlenBetrag = scanner.nextDouble();
                    automat.geldEinzahlen(einzahlenBetrag);
                    break;
                case 5:
                    automat.kontostandAnzeigen();
                    break;
                case 6:
                    automat.karteAuswerfen();
                    break;
                case 7:
                    System.out.println("Programm beendet.");
                    return;
                default:
                    System.out.println("Ungültige Option.");
            }
        }
    }
}
