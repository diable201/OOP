public class Product implements Comparable<Product> {
    
    String name;
    int id;
    double price;
    
    public Product() {}

    public Product(String name, int id, double price) {
        super();
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", id=" + id + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.price) return 1;
        if (this.price < o.price) return -1;
        return 0;
    }
    
}
