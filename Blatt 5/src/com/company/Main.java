package com.company;

public class Main {

    public static void main(String[] args) {
        NatZahl obj1 = new NatZahl(0);
        NatZahl1 obj2 = new NatZahl1(0);
        Integer obj3 = new Integer(10);

        System.out.println("obj1");
        System.out.println(obj1.toString());
        System.out.println(obj1.eq(obj2));
        System.out.println(obj1.neq(obj2));
        System.out.println(obj1.gt(obj2));
        System.out.println(obj1.lt(obj2));
        System.out.println(obj1.ge(obj2));
        System.out.println(obj1.le(obj2));

        System.out.println("\nobj2");
        System.out.println(obj2.toString());
        System.out.println(obj2.eq(obj1));
        System.out.println(obj2.neq(obj1));
        System.out.println(obj2.gt(obj1));
        System.out.println(obj2.lt(obj1));
        System.out.println(obj2.ge(obj1));
        System.out.println(obj2.le(obj1));

        System.out.println("\nBonusaufgabe");
        System.out.println(obj1.toString());
        System.out.println(obj1.eq(obj3));
        System.out.println(obj1.neq(obj3));
        System.out.println(obj1.gt(obj3));
        System.out.println(obj1.lt(obj3));
        System.out.println(obj1.ge(obj3));
        System.out.println(obj1.le(obj3));
    }
}