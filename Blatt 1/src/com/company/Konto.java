package com.company;

/**
 * Beschreiben Sie hier die Klasse Konto.
 * 
 * @author Emil Hopf 80414
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Konto
{
    static int num = 1000;
    private int kontonummer;
    private String inhaberIn;
    private double kontostand;
    /**
     * Konstruktor für Objekte der Klasse Konto
     */
    public Konto(String inh)
    {
        inhaberIn = inh;
        kontostand = 500;
        kontonummer = num;
        num++;
    }

    /**
     * Methode, um auf dem Konto einen Betrag einzuzahlen
     * 
     * @param  betrag   Der Betrag, der auf das Konto eingezahlt werden soll
     */
    public void einzahlen(double betrag)
    {
        kontostand += betrag;
    }

    /**
     * Methode, um von dem Konto einen Betrag auszuzahlen
     * 
     * @param  betrag   Der Betrag, der von dem Konto ausgezahlt werden soll
     */
    public void auszahlen(double betrag)
    {
        if(betrag >= kontostand)
        {
            kontostand -= betrag;
        }else {
            System.out.println("Fehler beim Auszahlen");
        }
    }
    
    /**
     * Methode, um die Kontodaten am Bildschirm auszugeben
     */
    public void ausgabe()
    {
        System.out.println(inhaberIn + "(" + kontonummer + "): " + kontostand);
    }
    
    /**
     * Methode, um einen Betrag vom aktuellen Konto auf ein anderes zu überweisen
     * 
     * @param  betrag       Der Betrag, der transferiert werden soll
     * @param  zielkonto    Das Konto, auf das der Betrag transferiert werden soll
     * 
     * @return true, wenn Transfervoraussetzungen erfüllt sind (siehe Übungsblatt), andernfalls false
     */
    public boolean ueberweisen(double betrag, Konto zielkonto)
    {
        if(this == zielkonto || zielkonto == null || this.kontostand < betrag)
        {
            System.out.println("Fehler bei der Ueberweisung");
            return false;
        } else {
            zielkonto.kontostand += betrag;
            this.kontostand -= betrag;
            return true;
        }
    }
}