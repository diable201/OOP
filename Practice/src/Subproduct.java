public class Subproduct extends Product {
    
    int count;
    
    public Subproduct() {
        super();
    }

    public Subproduct(String name, int id, double price, int count) {
        super(name, id, price);
        this.count = count;
    }
    
    @Override
    public int compareTo(Product o) {
        Subproduct sp = (Subproduct)o;
        if (this.count > sp.count) return 1;
        if (this.count < sp.count) return -1;
        return super.compareTo(sp);
    }

    @Override
    public String toString() {
        return super.toString() + " [count=" + count + "]";
    }
}
