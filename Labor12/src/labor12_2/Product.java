package labor12_2;
public class Product implements Comparable<Product> {
    private final int identifier;
    private int amount;
    private int price;
    private String name;

    public Product(int id, String name, int amount, int price)
    {
        this.identifier=id;
        this.amount=amount;
        this.price=price;
        this.name=name;
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    void increaseAmount(int newAmount)
    {
        this.amount=newAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "identifier=" + identifier +
                ", amount=" + amount +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return this.identifier-o.identifier;
    }
}
