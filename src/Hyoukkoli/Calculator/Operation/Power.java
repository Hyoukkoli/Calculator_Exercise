package Hyoukkoli.Calculator.Operation;

public class Power extends Operations{

    private double basis;
    private double exponent;

    public Power(double basis, double exponent){
        this.basis = basis;
        this.exponent = exponent;
    }

    public double getBasis(){
        return this.basis;
    }

    public double getExponent(){
        return this.exponent;
    }

    public double calculatePower(){
        return Math.pow(basis, exponent);
    }

    public String toString(){
        return "power(" + this.basis + ", " + this.exponent + ")";
    }

}
