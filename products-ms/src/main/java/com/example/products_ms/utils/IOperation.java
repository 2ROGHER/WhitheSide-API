package com.example.products_ms.utils;

public interface IOperation {
    int calc(int a, int b);
}


@FunctionalInterface
interface StringCombiner {
    String combine(String a, String b);
}