package Hyoukkoli.Calculator.Operation;

public class Logarithm {

    private double number;
    private double base;

    public Logarithm(double number, double base){
        this.number = number;
        this.base = base;
    }

    public double getNumber(){
        return this.number;
    }

    public double getBase(){
        return this.base;
    }

    public double calculateLogarithm(){
        return (Math.log10(number))/(Math.log10(base));
    }

    public String toString(){
        return "log" + this.base + "(" + this.number + ")";
    }

}
