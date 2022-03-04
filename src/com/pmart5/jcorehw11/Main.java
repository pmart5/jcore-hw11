package com.pmart5.jcorehw11;

import com.pmart5.jcorehw11.myclass.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        calc.printlnInteger.accept(a);
        int b = calc.minus.apply(1,1);
        calc.printlnInteger.accept(b);
        int c = calc.multiply.apply(3,4);
        calc.printlnInteger.accept(c);
        int d = calc.divide.apply(8, 2);
        calc.printlnInteger.accept(d);
        int e = calc.pow.apply(5);
        calc.printlnInteger.accept(e);
        int f = calc.abs.apply(-7);
        calc.printlnInteger.accept(f);
        boolean g = calc.isPositive.test(-10);
        calc.printlnBoolean.accept(g);
    }
}
