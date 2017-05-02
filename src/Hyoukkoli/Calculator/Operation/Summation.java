package Hyoukkoli.Calculator.Operation;

import Hyoukkoli.Calculator.Operations;

public class Summation extends Operations {

    double rightValue = 7f;
    double leftValue = 8f;


    Summation(double leftValue, double rightValue){
        this.leftValue = leftValue;
        this.rightValue = rightValue;

    }

    double calculateSum(){
        return rightValue+leftValue;
    }

}
