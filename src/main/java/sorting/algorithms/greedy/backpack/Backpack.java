package sorting.algorithms.greedy.backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private int compatibility;

    private final List<Product> products;

    public Backpack(int compatibility) {
        this.compatibility = compatibility;
        this.products = new ArrayList<>();
    }

    public int getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(int compatibility) {
        this.compatibility = compatibility;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void info() {
        System.out.println("----------------------------------------------------");
        System.out.println("Осталось места: " + compatibility);
        System.out.println("Содержимое:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("----------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "compatibility=" + compatibility +
                ", products=" + products +
                '}';
    }
}
