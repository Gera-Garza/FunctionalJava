package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;
import org.graalvm.compiler.replacements.IntrinsicGraphBuilder;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java","Functional");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(()->2);

        usarPredicado(text -> text.isEmpty());

        usarBiFunction((x,y)->{
            System.out.println("x: "+ x + ", Y : " +y);
            return x-y;
        });

        usarNada(()->{
            System.out.println("hola alumno");
        });

    }

    static void usarPredicado(Predicate<String> predicado) {
    }

    static void usarZero(ZeroArgumentos zeroArgumentos){
    }

    static void usarBiFunction(BiFunction<Integer,Integer,Integer> operacion){
    }

    static void usarNada(OpperarNada opperarNada){
    }

    @FunctionalInterface
    interface ZeroArgumentos{
        int get();
    }
    @FunctionalInterface
    interface OpperarNada{
        void nada();
    }
}
