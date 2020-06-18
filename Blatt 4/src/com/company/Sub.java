package com.company;

public class Sub extends Bin {
    public Sub(Expr l, Expr r){
        super(l,r);
    }

    protected double combine(double l, double r){
        return 0;
    }

    protected String oper(){
        return "";
    }
}
