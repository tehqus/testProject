package main.java;

import java.util.Optional;
import java.util.function.Function;

public class TestClassTwo {
    Character c;
    A a=new A();


    private static Optional<Character> opC = Optional.ofNullable('d');

    public static void main (String[] args) {

        //opC.ifPresent(this::c);

        A a = new A();
        TestClassTwo two =new TestClassTwo();


        Function<Integer, Double> addTwo = a::addTwo;
        //Double x = 4+A::a(2);

        Double x = addTwo.apply(2);

    }





}

class A {
    Character c;

    public  Double addTwo(Integer input) {
        return input+2.0;
    }

}
