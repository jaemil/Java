package com.company;

public class NatZahl1 extends AbstractOrdered {
    private int i;

    public NatZahl1(int i) {
        if(i < 1)
        {
            this.i = 1;
        }
        else {
            this.i = i;
        }
    }

    @Override
    public boolean eq(Object o) {

        if(o instanceof NatZahl1)
        {
            NatZahl1 z = (NatZahl1) o;
            return this.i == z.i;
        }

        return false;
    }

    @Override
    public boolean gt(Object o) {

        if(o instanceof NatZahl1)
        {
            NatZahl1 z = (NatZahl1) o;
            return this.i > z.i;
        }

        return false;
    }

    @Override
    public String toString() {
        return "" + i + "";
    }
}
