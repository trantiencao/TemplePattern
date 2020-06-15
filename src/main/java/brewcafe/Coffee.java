package brewcafe;

public class Coffee extends CaffeineBeverage{
    public void brew() {
//        System.out.println("Cho bột cafe vào ly");
        builder.append("Cho bột cafe vào ly");
    }

    public void addCondiments() {
//        System.out.println("Thêm đường và sữa cho vừa miệng");
        builder.append("Thêm đường và sữa cho vừa miệng");
    }
}
