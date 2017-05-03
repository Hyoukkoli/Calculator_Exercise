package Hyoukkoli.Calculator.Operation;

public class NaturalLogarithm {

    private double number;

    public NaturalLogarithm(double number){
        if (number <= 0){
            throw new IllegalArgumentException("The number used has to be greater than 0.");
        }
        this.number = number;
    }

    public double getNumber(){
        return this.number;
    }

    public double calculateNaturalLogarithm(){
        return Math.log(this.number);
    }

    public String toString(){
        return "ln(" + this.number + ")";
    }

}
