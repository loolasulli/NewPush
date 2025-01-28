package mentor14.FoodDelivery;

public class FlatRateDiscount implements Discount {
    double discountFlat;


    public FlatRateDiscount(double discountFlat) {
        this.discountFlat = 10;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discountFlat;
    }
}
