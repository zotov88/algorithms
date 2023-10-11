package greedy.backpack;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getPrice() > p2.getPrice()) {
            return -1;
        }
        if (p1.getPrice() < p2.getPrice()) {
            return 1;
        }
        if (p1.getPrice() == p2.getPrice()) {
            if (p1.getWeight() < p2.getWeight()) {
                return -1;
            }
            if (p1.getWeight() > p2.getWeight()) {
                return 1;
            }
        }
        if (p1.getPrice() == p2.getPrice() && p1.getWeight() == p2.getWeight()) {
            if (p1.getTitle().compareTo(p2.getTitle()) > 0) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
