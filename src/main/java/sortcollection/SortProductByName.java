package sortcollection;

public class SortProductByName  extends SortCollection<Product> {
    public int compare(Product t1, Product t2) {
        return t1.getName().compareTo(t2.getName());
    }   
}
