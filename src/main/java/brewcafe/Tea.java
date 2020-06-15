package brewcafe;

public class Tea extends CaffeineBeverage{
    public void brew() {
//        System.out.println("Bỏ túi trà vào!");
        builder.append("Bỏ túi trà vào!");
    }

    public void addCondiments() {
//        System.out.println("Thêm đường và thêm chanh");
        builder.append("Thêm đường và thêm chanh");
    }
}
