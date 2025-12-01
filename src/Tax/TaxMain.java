package src.Tax;

import java.util.ArrayList;

public class TaxMain {
    public static void main(String[] args) {
        ArrayList <TaxMethod> tax = new ArrayList<>();

        tax.add(new Income());
        tax.add(new Sales());

        double amount = 50000;

        for(TaxMethod t : tax){
            double finalTax = t.calculateTax(amount);

            System.out.println(
                t.getClass().getSimpleName() + 
                " on " + amount + " taka " + finalTax + " taka "
            );
        }
    }
}
