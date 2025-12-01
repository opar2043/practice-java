package src.Discount;

import java.util.ArrayList;
import java.util.List;

public class MainDiscount {
    public static void main(String[] args) {
       List <Discount> discount = new ArrayList<>();
       discount.add(new FestivalSale());
       discount.add(new MemberSale());
    
       System.out.println();
       System.out.println(discount + "heee");

       double amount = 10000;

        for (Discount d : discount) {
            double finalAmount = d.getDiscount(amount);
            System.out.println(finalAmount + "final amount");
            System.out.println(
                d.getClass().getSimpleName() + 
                " on " + amount + " taka = " + finalAmount + " taka"
            );
    }
}
}
