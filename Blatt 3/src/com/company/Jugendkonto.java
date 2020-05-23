package com.company;

import java.util.EmptyStackException;

public class Jugendkonto extends Konto
{
    int alter = 0;
    public Jugendkonto(String inh)
    {
        super(inh);
    }

    protected double neuesAlter(double alter)
    {
        if(alter < 21)
        {
            if(alter <= this.alter)
            {
//                throw new RuntimeException("ERROR");
                System.out.println("ERROR");
            }
            else
            {
                this.alter = (int)alter;
                super.einzahlen(100);
            }
        }

        return super.kontostand;
    }


}
