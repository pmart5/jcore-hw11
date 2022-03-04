package com.pmart5.jcorehw11.myclass;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> divide = (x, y) -> {      // Приведенный в задании код будет работать до тех пор,
        if (y == 0) {                     // пока не будет ввдено y=0. При y=0 возникнет исключение ArithmeticException.
            System.out.print("Операция прервана! Нельзя делить на ");
            return y;
        } else {
            return x / y;
        }
    };
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    public Predicate<Integer> isPositive = x -> x > 0;
    public Consumer<Integer> printlnInteger = System.out::println;
    public Consumer<Boolean> printlnBoolean = System.out::println;
}
