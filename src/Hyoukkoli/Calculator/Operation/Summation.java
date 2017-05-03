package Hyoukkoli.Calculator.Operation;

public class Summation extends Operations {

    private double rightValue;
    private double leftValue;

    public Summation(double leftValue, double rightValue)
    {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public double getLeftValue()
    {
        return this.leftValue;
    }

    public double getRightValue()
    {
        return this.rightValue;
    }

    public double calculateSum()
    {
        return this.rightValue + this.leftValue;
    }

    public String toString()
    {
        return this.leftValue + " + " + this.rightValue;
    }
}
