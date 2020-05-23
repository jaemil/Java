package com.company;

public class Girokonto extends Konto
{
    static double gebuehr;
    int anzahlBuchung;
    double dispoLimit;

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
        gebuehren();
        anzahlBuchung++;
    }

    public void auszahlen(double betrag)
    {
        super.auszahlen(betrag);
        gebuehren();
        anzahlBuchung++;
    }

    public boolean ueberweisen(double betrag, Konto zielKonto)
    {
        boolean temp = super.ueberweisen(betrag, zielKonto);
        gebuehren();
        anzahlBuchung++;
        return temp;
    }
}
