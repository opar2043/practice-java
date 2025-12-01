package src.Discount;

public class FestivalSale implements Discount {
     @Override
    public double getDiscount(double amount){
        return amount * 0.2;
    }
}
