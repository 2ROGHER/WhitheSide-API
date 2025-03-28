package com.example.products_ms.utils;

import jdk.dynalink.Operation;

import java.util.Map;
import java.util.function.Function;


public class Functions {
    //Lambdas are functions without any [name]. That we can uso to pass other functions as parameters or assignment to
    // any variables.
    // (parameters) -> {//body}
    IOperation sum = (a, b) -> a + b;

    private static Function<Integer, Integer> duplicate= (a) -> a*2;
    private static Function<Integer, Integer> increment = (b) -> b + 1;
    private static Function<Integer, Integer> s = (x) ->x*x;


    public static int operate(int a, int b, Function<Integer, Integer> f) {
        return f.apply(a) + f.apply(b);
    }

    public static String fun(String a, int b, StringCombiner c) {
        return c.combine(a, String.valueOf(b));
    }

    public static void processNumber(int n, Function<Integer, Integer> f) {
        int res = f.apply(n);
        System.out.println("The result is :" + res);
    }

    // Returns [function] by other functions [Factory Functions]
    public  static Function<Integer, Integer> f(int i) {
        return n -> n * i; // returns a [Function] that receives as parameter an [Integer] and returns a [Integer] value.
    }


    public void main(String[] args) {
        int res = operate(5, 3, x -> x*2);
        System.out.println("Final result: " + res);

        // Combinator

        String c = fun("hello", 34, (x,y) -> x + "" + y);

        // composed functions
        Function<Integer, Integer> combine = duplicate.andThen(increment);

        System.out.println("Operation combined: " + combine.apply(5));

        processNumber(4, s);

        // Returns functions as [values] by other functions
        Function<Integer, Integer> doubleIt = f(2);
        Function<Integer, Integer> tenTimes = f(10);

        System.out.println("Double it: " + doubleIt);
        System.out.println("Ten times: " + tenTimes);

        // Compose functions
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> increment = x -> x + 1;

        Function<Integer, Integer> squareThenIncrement = square.andThen(increment);
        Function<Integer, Integer> incrementThenSquare = square.compose(increment);

        System.out.println(squareThenIncrement.apply(3)); // (3 * 3) + 1 = 10
        System.out.println(incrementThenSquare.apply(3)); // (3 + 1)^2 = 16

    }
}
