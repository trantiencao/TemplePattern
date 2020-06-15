package brewcafe;

public abstract class CaffeineBeverage {
    StringBuilder builder = new StringBuilder();
    public void prepareRecipe(){
        boidWater();
        pourInCup();
        brew();
        addCondiments();
    }
    public void boidWater(){
//        System.out.println("Đun sôi 100ml nước!");
        builder.append("Đun sôi 100ml nước!");
    }
    
    public void pourInCup(){
//        System.out.println("Đổ vô ly");
        builder.append("Đổ vô ly");
    }
    
    abstract void brew();
    
    abstract void addCondiments();
}

