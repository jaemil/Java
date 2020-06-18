package com.company;

public class Div extends Bin{
    public Div(Expr l, Expr r){
        super(l,r);
    }

    protected double combine(double l, double r){
        return 0;
    }

    protected String oper(){
        return "";
    }
}
