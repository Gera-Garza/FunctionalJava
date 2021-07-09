package com.platzi.functional._11_composition;

import java.util.function.Function;

public class Mathoperations2 {
    public static void main(String[] args) {
        Function<Integer,Integer> multiplyBy3 = x -> {
            System.out.println("Multiplicacndo x: "+x+ " por 3");
            return x*3;
        };

    Function<Integer,Integer> add1MultiplyBy3 =
            multiplyBy3.compose(y -> {
                System.out.println("Le agregare 1 a: "+ y);
                return y +1;
            });

        System.out.println(
                add1MultiplyBy3.apply(5)
        );
   }
}

