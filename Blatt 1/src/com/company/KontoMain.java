package com.company;

/**
 * Vorlage für Übung 1 OOP WS 2017
 * 
 * @author 
 * @version 
 */
public class KontoMain
{
    /**
     * Hauptfunktion / Hauptmethode / Programmeinstieg
     * 
     * @param  args Die Kommandozeilen-Argumente
     */
    public static void main(String[] args)
    {
        Konto konto1 = new Konto("Hugo");
        Konto konto2 = new Konto("Hugeline");
        konto1.einzahlen(1000.0);
        konto2.einzahlen(2000.0);
        konto2.ueberweisen(1000.0, konto1);
        konto2.ueberweisen(2000.0, konto1);
        konto2.ueberweisen(2000.0, konto2);
    
        konto1.ausgabe();
        konto2.ausgabe();
    }
}
