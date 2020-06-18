package com.company;

public class Main {

    public static void main(String[] args) {
	    Expr x = new Add(new Mul(new Const(2), new Const(3)), new Const(4));
        System.out.println(x + " = " + x.compute());

        Expr x = new Add(new Mul(new Const(2), new Const(3)), new Const(4));
        System.out.println(x + " = " + x.compute());

        Expr x = new Add(new Mul(new Const(2), new Const(3)), new Const(4));
        System.out.println(x + " = " + x.compute());

        System.out.println(x.equals((x.toString)));
    }
}
