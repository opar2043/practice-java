package src.Discount;

public class MemberSale implements Discount {
     @Override
     public double getDiscount(double amount){
        return amount * 0.1;
    }
}
