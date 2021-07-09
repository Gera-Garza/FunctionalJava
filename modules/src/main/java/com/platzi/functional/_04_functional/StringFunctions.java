package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String>  addMark = text -> text + "!0.0";
        System.out.println(quote.apply("Hola esto es un ejemplo"));
        System.out.println(addMark.apply("Esto es el segundo ejemplo "));


        BiFunction<Integer, Integer, Integer> multiplicacion =
                (x,y) -> x * y;
        BinaryOperator<Integer> multi =
                (x,y) -> x * y;

        BiFunction<String, Integer, String> leftPad =
                (text,number) -> String.format("%" + number + "s",text);

        System.out.println(leftPad.apply("java",10));
    }
}
