package com.javalambdaexpressions.Task2;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
@FunctionalInterface
interface Greeting {
    void greet(String name);
}
public class Main {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;

        int result = addition.calculate(2, 3);
        System.out.println(result);

        // Greeting - Hello
        Greeting hello = name -> System.out.println("Hello, " + name + "!");
        hello.greet("Jessie");

        // Greeting - Goodbye
        Greeting goodbye = name -> System.out.println("Goodbye, " + name + "!");
        goodbye.greet("Alex");

    }
    }
