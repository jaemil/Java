package com.company;

public class Girokonto extends Konto
{
    static double gebuehr;
    int anzahlBuchung;
    double dispoLimit = 500;

    public Girokonto(String inh)
    {
        super(inh);
    }

    protected double gebuehren()
    {
        anzahlBuchung = 0;

        if(super.kontostand < gebuehr)
        {
            super.kontostand -= gebuehr;
            return -1;
        }

        return gebuehr;
    }

    public void einzahlen(double betrag)
    {
        super.einzahlen(betrag);
        anzahlBuchung++;
        gebuehren();
    }

    public void auszahlen(double betrag)
    {
        super.auszahlen(betrag);
        anzahlBuchung++;
        gebuehren();
    }

    public boolean ueberweisen(double betrag, Konto zielkonto) {
        if(super.ueberweisen(betrag, zielkonto)){
            return true;
        }
        if( (0 - dispoLimit) + betrag < 0){
            double differenzbetrag = betrag - this.kontostand;
            this.kontostand = this.kontostand - (betrag - differenzbetrag);
            dispoLimit -= differenzbetrag;
            zielkonto.einzahlen(betrag);
            this.anzahlBuchung++;
            this.gebuehren();
            System.out.println("Überweisung erfolgreich aber es ist "+ differenzbetrag +"von deine dispolimit abgezogen");
            System.out.println("deine aktuele Dispolimit ist "+ this.dispoLimit);
            return true;
        }
        return false;
    }
}
