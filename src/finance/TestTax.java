package src.finance;

import src.finance.Taxable;
import src.finance.IncomeTax;
import src.finance.SalesTax;

import java.util.ArrayList;
import java.util.List;

public class TestTax {
    public static void main(String[] args) {

        List<Taxable> taxList = new ArrayList<>();
        // IncomeTax income = new IncomeTax();
        // IncomeTax sales = new SalesTax();
        taxList.add(new IncomeTax());
        taxList.add(new SalesTax());

        double amount = 50000.00;

        for (Taxable t : taxList) {
            double tax = t.calculateTax(amount);

            System.out.println(
                t.getClass().getSimpleName() +
                " on " + amount + " Tk = " + tax + " Tk"
            );
        }
    }
}
