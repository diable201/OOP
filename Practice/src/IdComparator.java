import java.util.Comparator;

public class IdComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.id > o2.id) return 1;
        if (o1.id < o2.id) return -1;
        return 0;
    }

}
