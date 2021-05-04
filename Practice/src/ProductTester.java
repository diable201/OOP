import java.util.Collections;
import java.util.Vector;

public class ProductTester {
    public static void main(String[] args) {
        Vector<Product> products = new Vector<Product>();
        
        Product p1 = new Product("a", 1, 1000.0);
        Product p2 = new Product("c", 3, 3000.0);
        Product p3 = new Product("b", 2, 2000.0);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        
        System.out.println("Before sorting: " + products);
        // Collections.sort(products);
        Collections.sort(products, new IdComparator());
        System.out.println("After sorting: " + products);
        
        System.out.println();
        
        Vector<Subproduct> subproducts = new Vector<Subproduct>();
        Subproduct sp1 = new Subproduct("a", 1, 1000.0, 5);
        Subproduct sp2 = new Subproduct("b", 2, 2000.0, 10);
        Subproduct sp3 = new Subproduct("c", 3, 3000.0, 3);
        subproducts.add(sp1);
        subproducts.add(sp2);
        subproducts.add(sp3);
        
        System.out.println("Before sorting: " + subproducts);
        Collections.sort(subproducts);
        System.out.println("After sorting: " + subproducts);
    }
}
