package com.company;

public class Mul extends Bin {
    public Mul(Expr l, Expr r){
        super(l, r);
    }

    protected double combine(double l, double r){
        return 0;
    }

    protected String oper(){
        return "";
    }
}
