package greedy.backpack;

public class Product {

    private final String title;

    private final int price;

    private final int weight;

    public Product(String title, int price, int weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", weight=" + weight +
                ", title='" + title + '\'' +
                '}';
    }
}
