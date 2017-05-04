package Hyoukkoli.Calculator;

import Hyoukkoli.Calculator.Operation.*;

public class Main {

    public static void main(String[] args){

        Summation sum = new Summation(15f, 482f);
        System.out.println(sum + " = " + sum.calculateSum());

        Subtraction sub = new Subtraction(480f, 5f);
        System.out.println(sub + " = " + sub.calculateSubtraction());

        Multiplication mul = new Multiplication(48f, 5f);
        System.out.println(mul + " = " + mul.calculateMultiplication());

        Division div = new Division(480, 0f);
        System.out.println(div + " = " + div.calculateDivision());

        Power pow = new Power(4f, 5f);
        System.out.println(pow + " = " + pow.calculatePower());

        Root root = new Root(5f);
        System.out.println(root + " = " + root.calculateRoot());

        Logarithm log = new Logarithm(25f, 10f);
        System.out.println(log + " = " + log.calculateLogarithm());

        Base2Logarithm log2 = new Base2Logarithm(25f);
        System.out.println(log2 + " = " + log2.calculateBase2Logarithm());


    }

    
}
