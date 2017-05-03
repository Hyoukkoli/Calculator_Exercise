package Hyoukkoli.Calculator.Operation;

public class Root extends Operations{

    private double basis;
    private double root;

    public Root (double basis, double root){
        if (basis < 0){
            throw new IllegalArgumentException("The value of the basis has to be greater or equal 0.");
        }
        this.basis = basis;
        this.root = root;
    }

    public Root (double basis){
        if (basis < 0){
            throw new IllegalArgumentException("The value of the basis has to be greater than 0.");
        }
        this.basis = basis;
        this.root = 2;
    }

    public double getBasis(){
        return this.basis;
    }

    public double getRoot(){
        return this.root;
    }

    public double calculateRoot(){
        return Math.pow(this.basis, 1/this.root);
    }

    public String toString(){
        return "root(" + this.basis + ", " + this.root + ")";
    }


}
