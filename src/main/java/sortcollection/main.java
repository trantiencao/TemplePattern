package sortcollection;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<Product>();
        listProduct.add(new Product("Milk Cafe", 20000, "Good"));
        listProduct.add(new Product("Trà Ice", 10000, "Good"));

        SortCollection<Product> sortProductByPrice = new SortProductByPrice();
        SortCollection<Product> sortProductByName = new SortProductByName();

        System.out.println("Sắp xếp theo giá: ");
        for (byte i = 0; i < listProduct.size(); i++) {
            System.out.println("Tên: " + listProduct.get(i).getName() + "\tGiá: " + listProduct.get(i).getPrice()
                    + "\tChất lượng: " + listProduct.get(i).getQuanlity());
            sortProductByPrice.sort(listProduct);
        }

        System.out.println("\nSắp xếp theo tên: ");
        for (byte i = 0; i < listProduct.size(); i++) {
            System.out.println("Tên: " + listProduct.get(i).getName() + "\tGiá: " + listProduct.get(i).getPrice()
                    + "\tChất lượng: " + listProduct.get(i).getQuanlity());
            sortProductByName.sort(listProduct);
        }


    }
}
