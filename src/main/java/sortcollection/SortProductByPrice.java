package sortcollection;

public class SortProductByPrice extends SortCollection<Product> {

    public int compare(Product t1, Product t2) {
        if(t1.getPrice() == t2.getPrice()) return 0;
        else
        {
            if(t1.getPrice() > t2.getPrice()) return 1;
            else return -1;
        }
    }
}
