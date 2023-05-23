package com.javalambdaexpressions.Task3;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;


class Main {
    public static void main(String[] args) {

        Predicate<String> isLong = (str) -> str.length() > 10;
        System.out.println(isLong.test("Darranda!"));

        Function<Integer, String> convertToString = num -> String.valueOf(num);

        String str = convertToString.apply(123);
        System.out.println(str);


        Supplier<Double> getRandomNumber = () -> Math.random();

        double number = getRandomNumber.get();
        System.out.println(number);

        
    }
}