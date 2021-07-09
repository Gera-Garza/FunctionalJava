package com.platzi.functional._04_functional;

import com.sun.org.apache.xml.internal.utils.QName;

import java.util.function.Function;
import java.util.function.Predicate;


public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer,Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };
        System.out.println(square.apply(5));

        Function<Integer,Boolean> isOdd = x -> x % 2 ==1;

        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(4); //true

        Predicate<Student> isApproved = student -> student.getCalif() >= 6.0;

        Student sinhue = new Student(5.9);
        System.out.println(isApproved.test(sinhue));
    }


    static class Student{
        private double calif;

        public Student(double calif) {
            this.calif = calif;
        }

        public double getCalif() {
            return calif;
        }
    }
}