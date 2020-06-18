package com.company;

import java.util.Objects;

public abstract class Bin extends Expr {
    private Expr left, right;
    protected Bin(Expr l, Expr r){}
    protected double combine(double l, double r){return 0;}
    protected abstract String oper();
    public double compute(){return 0;}

    @Override
    public String toString() {
        return "(" + left + oper() + right + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bin bin = (Bin) o;
        return Objects.equals(left, bin.left) && Objects.equals(right, bin.right);
    }
}
