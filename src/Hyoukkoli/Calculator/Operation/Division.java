package Hyoukkoli.Calculator.Operation;

public class Division extends Operations{

    private double leftValue;
    private double rightValue;

    public Division(double leftValue, double rightValue){
        if (rightValue == 0){
                throw new IllegalArgumentException("The value on the right side of the division must not be 0.");
            }
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public double getLeftValue(){
        return this.leftValue;
    }

    public double getRightValue(){
        return this.rightValue;
    }

    public double calculateDivision(){
        return this.leftValue / this.rightValue;
    }

    public String toString(){
        return this.leftValue +" / "+ rightValue;
    }
}
