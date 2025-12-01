package src.finance;

public class IncomeTax implements Taxable {

   
    public double calculateTax(double amount) {
        return amount * 0.15; // 15% income tax
    }
}
