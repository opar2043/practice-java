package src.finance;

public class SalesTax implements Taxable {

    @Override
    public double calculateTax(double amount) {
        return amount * 0.05; // 5% sales tax
    }
}
