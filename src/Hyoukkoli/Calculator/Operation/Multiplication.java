package Hyoukkoli.Calculator.Operation;

public class Multiplication extends Operations{

    private double leftValue;
    private double rightValue;

    public Multiplication(double leftValue, double rightValue){
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public double getLeftValue(){
        return this.leftValue;
    }

    public double getRightValue(){
        return this.rightValue;
    }

    public double calculateMultiplication(){
        return this.leftValue * this.rightValue;
    }

    public String toString(){
        return this.leftValue +" * "+ this.rightValue;
    }

}
