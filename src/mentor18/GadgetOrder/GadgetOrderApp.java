package mentor18.GadgetOrder;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GadgetOrderApp {
    public static void main(String[] args) {
        Pattern productBrand = Pattern.compile("APPLE|SAMSUNG|SONY|LENOVO");
        Pattern productType = Pattern.compile("LAPTOP|SMARTPHONE|TABLET|HEADPHONES");
        Pattern quantityNum = Pattern.compile("^[1-5]$");

        Scanner scanner = new Scanner(System.in);


        ProductBrand productBrand1 = null;
        while (productBrand1 == null) {
            System.out.println("Please, select brand: APPLE, SAMSUNG, SONY, LENOVO");
            String prodBrand = scanner.nextLine().toUpperCase();
            if (productBrand.matcher(prodBrand).matches()) {
                productBrand1 = ProductBrand.valueOf(prodBrand);
            } else {
                System.out.println("Error");
            }
        }

        ProductType productType1 = null;
        while(productType1 == null) {
            System.out.println("Please, select type: LAPTOP, SMARTPHONE, TABLET, HEADPHONES");
            String prodType = scanner.nextLine().toUpperCase();
            if (productType.matcher(prodType).matches()) {
                productType1 = ProductType.valueOf(prodType);
            } else {
                System.out.println("Error");
            }
        }


        Integer quantity1 = null;
        while (quantity1 == null) {
            System.out.println("Add quantity: ");
            String quantity = scanner.nextLine();
            if (quantityNum.matcher(quantity).matches()) {
                quantity1 = Integer.parseInt(quantity);
            } else {
                System.out.println("Error");
            }
        }

        double totalPrice = quantity1 * productType1.getPrice();
        System.out.println("Total price: " + totalPrice);

    }
}
