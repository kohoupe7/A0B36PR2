package calc;
 
public abstract class Expr {
 
    public abstract double evaluate(double x);
    
    public abstract boolean hasVar(char name);
 
}
