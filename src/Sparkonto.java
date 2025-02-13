public class Sparkonto extends Konto {

    double zinssaatz;

    public Sparkonto(String kontonummer, double kontostand) {
        super(kontonummer, kontostand);
        this.zinssaatz = kontostand;
    }

    @Override
    public boolean abheben(double betrag) {
        return false;
    }

    public void zinsenAnrechnung() {
        //kontostand * zinssatz durch 100
        double zinsen = getKontostand() * zinssaatz / 100;
        einzahlen(zinsen);

    }

}
