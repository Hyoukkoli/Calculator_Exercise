package Hyoukkoli.Calculator;

import Hyoukkoli.Calculator.Operation.Summation;

public class Main {

    public static void main(String[] args){

        Summation test = new Summation(32f, 16f);
        Summation test1 = new Summation(15f, 482f);
        System.out.println(test + " = " + test.calculateSum());
        System.out.println(test1 + " = " + test1.calculateSum());

    }

    
}
