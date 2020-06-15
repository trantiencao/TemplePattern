package sortcollection;

public class Product {
    String name;
    int Price;
    String Quanlity;

    public Product(String name, int Price, String Quanlity) {
        this.name = name;
        this.Price = Price;
        this.Quanlity = Quanlity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return Price;
    }

    public String getQuanlity() {
        return Quanlity;
    }
}
