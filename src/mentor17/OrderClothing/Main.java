package mentor17.OrderClothing;

public class Main {
    public static void main(String[] args) {
        OrderClothes cloth1 = new OrderClothes(ClothingCategory.DRESS, ClothingSize.SMALL, 3);
        OrderClothes cloth2 = new OrderClothes(ClothingCategory.JEANS, ClothingSize.MEDIUM, 2);
        OrderClothes cloth3 = new OrderClothes(ClothingCategory.JACKET, ClothingSize.LARGE, 2);
        OrderClothes cloth4 = new OrderClothes(ClothingCategory.T_SHIRT, ClothingSize.EXTRA_LARGE, 4);
        OrderClothes[] clothes = {cloth1, cloth2, cloth3, cloth4};

        for (OrderClothes cloth: clothes) {
            System.out.println(cloth);
        }
    }
}
