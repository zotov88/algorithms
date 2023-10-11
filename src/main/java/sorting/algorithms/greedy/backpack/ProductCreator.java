package sorting.algorithms.greedy.backpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductCreator {

    private ProductCreator() {}

    public static Product getProduct(String title, int price, int weight) {
        return new Product(title, price, weight);
    }

    public static Product getRandomProduct(String title, int maxPrice, int maxWeight) {
        Random random = new Random();
        return new Product(title, random.nextInt(maxPrice) + 1, random.nextInt(maxWeight) + 1);
    }

    public static List<Product> getRandomProducts(int count, int maxPrice, int maxWeight) {
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(getRandomProduct(Integer.toString(i), maxPrice, maxWeight));
        }
        return list;
    }
}
