import java.util.Scanner;

public abstract class Konto {
    private String kontonummer;
    private double kontostand;

    public Konto(String kontonummer, double kontostand) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public int einzahlen(double v) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie hoch wollen sie Konto erhöhen: ");
        int input = scanner.nextInt();

        kontostand += input;
        return input;
    }

    public void abheben() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viel vom Konto möchten sie weg: ");
        int input = scanner.nextInt();

        kontostand -= input;

        if (kontostand <= 0) {
            System.out.println("Sie haben kein Geld mehr! ");
            System.exit(0); // Exit the program with a status code of 0;
        }

        else if ((kontostand -= input) < 0) {
            System.out.println("Sie haben kein Geld mehr! ");
            System.exit(0);
        }

        else {
            System.out.println("Sie haben noch " + kontostand + "CHF");
        }
    }


    // Abheben-Methode überschreiben
    public abstract boolean abheben(double betrag);
}
