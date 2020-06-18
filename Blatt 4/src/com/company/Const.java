package com.company;

import java.util.Objects;

public class Const {
    private double value;

    public Const(double v){
            value = v;
    }

    public double compute(){return 1;}

    @Override
    public String toString() {
        return " " + value + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bin bin = (Bin)o;
        return Objects.equals(bin.left, bin.left) &&
                Objects.equals(bin.right, bin.right);
    }
}