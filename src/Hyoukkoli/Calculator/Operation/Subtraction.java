package Hyoukkoli.Calculator.Operation;

public class Subtraction extends Operations{

    private double leftValue;
    private double rightValue;

    public Subtraction (double leftValue, double rightValue){
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public double getLeftValue(){
        return this.leftValue;
    }

    public double getRightValue(){
        return this.rightValue;
    }

    public double calculateSubtraction(){
        return this.leftValue - this.rightValue;
    }

    public String toString(){
        return this.leftValue +" - "+ this.rightValue;
    }


}
