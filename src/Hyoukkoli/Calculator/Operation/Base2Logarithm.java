package Hyoukkoli.Calculator.Operation;

public class Base2Logarithm {

    private double number;

    public Base2Logarithm(double number){
        if (number <= 0){
            throw new IllegalArgumentException("The number used has to be greater than 0.");
        }
        this.number = number;
    }

    public double getNumber(){
        return this.number;
    }

    public double calculateBase2Logarithm(){
        return (Math.log10(number))/(Math.log10(2));
    }

    public String toString(){
        return "log2(" + this.number + ")";
    }
}
