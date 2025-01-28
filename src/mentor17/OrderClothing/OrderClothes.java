package mentor17.OrderClothing;

public class OrderClothes {
    ClothingCategory category;
    ClothingSize size;
    int quantity;
    double totalPrice;

    public OrderClothes(ClothingCategory category, ClothingSize size, int quantity) {
        this.category = category;
        this.size = size;
        if (quantity > 0 && quantity <= 10) {
            this.quantity = quantity;
        } else {
            System.out.println("You can order minimum 1 - maximum 10 clothes..");
        }
        if (category == ClothingCategory.T_SHIRT) {
            this.totalPrice = quantity * 19.99;
        } else if (category == ClothingCategory.JACKET) {
            this.totalPrice = quantity * 49.99;
        } else if (category == ClothingCategory.JEANS) {
            this.totalPrice = quantity * 39.99;
        } else if (category == ClothingCategory.DRESS) {
            this.totalPrice  = quantity * 29.99;
        } else {
            System.out.println("Something wrong..");
        }
    }

    @Override
    public String toString() {
        return "OrderClothes{" +
                "category=" + category +
                ", size=" + size +
                ", quantity=" + quantity +
                ", totalPrice=$" + totalPrice +
                '}';
    }
}
