package src.Tax;

public class Income implements TaxMethod {
    public double calculateTax(double amount){
        return amount * 0.3;
    }
}
