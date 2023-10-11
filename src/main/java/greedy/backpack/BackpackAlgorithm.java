package greedy.backpack;

import java.util.List;
import java.util.TreeSet;

public class BackpackAlgorithm {

    private final List<Product> products;

    private final TreeSet<Product> sortSet;

    private final Backpack backpack;

    public BackpackAlgorithm(List<Product> products,
                             TreeSet<Product> sortSet,
                             Backpack backpack) {
        this.products = products;
        this.sortSet = sortSet;
        this.backpack = backpack;
    }

    public void fillBackpack() {
        while (backpack.getCompatibility() != 0) {
            backpack.info();
            for (Product product : products) {
                if (product.getWeight() <= backpack.getCompatibility()) {
                    sortSet.add(product);
                }
            }
            if (!sortSet.isEmpty()) {
                Product firstProduct = sortSet.first();
                backpack.setCompatibility(backpack.getCompatibility() - firstProduct.getWeight());
                backpack.getProducts().add(firstProduct);
                products.remove(firstProduct);
                sortSet.clear();
            } else {
                break;
            }
        }
    }
}
