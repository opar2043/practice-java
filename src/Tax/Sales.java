package src.Tax;

public class Sales implements TaxMethod {
    public double calculateTax(double amount){
        return amount * 0.15;
    }
}
