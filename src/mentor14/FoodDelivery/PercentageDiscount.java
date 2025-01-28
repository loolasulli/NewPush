package mentor14.FoodDelivery;

public class PercentageDiscount implements Discount {
    double percentage;

    public PercentageDiscount(double discountPercentage) {
        this.percentage = 10;
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * (percentage / 100));
    }
}
