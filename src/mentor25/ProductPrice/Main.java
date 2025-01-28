package mentor25.ProductPrice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("parmesan", "cheeses", 12.6),
                new Product("popcorn", "snacks", 3.5),
                new Product("pinaColada", "drinks", 11));
        Collections.sort(products);

        List<Product> products2 = Arrays.asList(new Product("parmesan", "cheeses", 12.6),
                new Product("popcorn", "snacks", 3.5),
                new Product("pinaColada", "drinks", 11));
        products2.sort(new ProductComparator());

        System.out.println("\n~   ~   ~   ~   ~   ~   ~\n Sorted by name: ");

        for (Product product: products) {
            System.out.println(product);
        }

        System.out.println("\n~   ~   ~   ~   ~   ~   ~\n Sorted by price: ");

        for (Product product2: products2) {
            System.out.println(product2);
        }

        System.out.println("\n~   ~   ~   ~   ~   ~   ~\n Sorted by name: ");

        products.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n~   ~   ~   ~   ~   ~   ~\n Sorted by price: ");

        products.stream()
                .sorted(new ProductComparator())
                .forEach(System.out::println);

        System.out.println("\n~   ~   ~   ~   ~   ~   ~\n After discount: ");

        Calculator discount = price -> price * 0.50;
        products.stream()
                .map(l -> new Product(l.getName(), l.getCategory(), discount.discount(l.getPrice())))
                .forEach(System.out::println);

        System.out.println("\n~   ~   ~   ~   ~   ~   ~\n Mix processes: ");

        products.stream()
                .filter(l -> l.getCategory().equals("drinks") && l.getPrice() == 11)
                .map(l -> new Product(l.getName(), l.getCategory(), discount.discount(l.getPrice())))
                .sorted(new ProductComparator())
                .forEach(System.out::println);
    }
}
