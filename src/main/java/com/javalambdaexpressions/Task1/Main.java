package com.javalambdaexpressions.Task1;

public class Main {
    public static void main(String[] args) {
        Math add =  (a, b) ->( a + b);
        Math subtract = (a, b) ->( a - b);
        Math multiply = (a,b) -> (a * b);
        Math divide = (a,b) -> (a / b);
        System.out.println ("addition = " + add.operations(2,3));
        System.out.println ("subtraction = " + subtract.operations(10,5));
        System.out.println ("multiplication = " + multiply.operations(2,4));
        System.out.println ("division = " + divide.operations(18,9));
    }
}


