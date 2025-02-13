public class Girokonto extends Konto {
    private double dispoLimit;

    public Girokonto(String kontonummer, double startKontostand, double dispoLimit) {
        super(kontonummer, startKontostand);
        this.dispoLimit = dispoLimit;
    }

    @Override

    public boolean abheben(double betrag) {
        if (betrag <= 0) {
            throw new IllegalArgumentException("Betrag muss positiv sein!");
        }
        if (getKontostand() - betrag >= -dispoLimit) {
            super.einzahlen(-betrag);
        } else {
            throw new IllegalStateException("Dispo-Limit überschritten!");
        }
        return false;
    }


}