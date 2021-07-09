package com.platzi.functional._05_sam;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class Ageutils {
    public static void main(String[] args) {
        Function<Integer,String> addCeros = x -> x<10 ? "0" + x : String.valueOf(x);
        TriFunction<Integer,Integer,Integer, LocalDate> parseDate =
                (day,month,year) -> LocalDate.parse(year + "-" + month +"-" + day);

        TriFunction<Integer,Integer,Integer,Integer> calculateAge =
                (day,month,year) -> Period.between(
                        parseDate.apply(day,month,year),LocalDate.now()
                ).getDays();

        System.out.println(calculateAge.apply(10,10,1992));
    }

    @FunctionalInterface
    interface TriFunction<T,U,V,R>{
        R apply(T t,U u, V v);
    }
}
