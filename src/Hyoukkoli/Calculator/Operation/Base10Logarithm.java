package Hyoukkoli.Calculator.Operation;

public class Base10Logarithm extends Operations{

    private double number;

    public Base10Logarithm (double number){
        if (number <= 0){
            throw new IllegalArgumentException("The number used has to be greater than 0.");
        }
        this.number = number;
    }

    public double getNumber(){
        return this.number;
    }

    public double calculateBase10Logarithm(){
        return Math.log10(this.number);
    }

    public String toString(){
        return "log10(" + this.number + ")";
    }


}
