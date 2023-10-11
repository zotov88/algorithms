package greedy.backpack;

import java.util.List;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {

        List<Product> products = ProductCreator.getRandomProducts(10, 20, 10);
        TreeSet<Product> sortSet = new TreeSet<>(new ProductComparator());
        Backpack backpack = new Backpack(20);
        BackpackAlgorithm algorithm = new BackpackAlgorithm(products, sortSet, backpack);

        System.out.println("Товары в магазине:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("----------------------------------------------------");

        algorithm.fillBackpack();

        System.out.println("####################################################");
        System.out.println("В рюкзаке в итоге:");
        backpack.info();
        System.out.println("----------------------------------------------------");
        System.out.println("Осталось в магазине");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
