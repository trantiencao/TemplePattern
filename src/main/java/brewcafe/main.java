package brewcafe;

class main {
    public static void main(String[] args) {
        CaffeineBeverage brewCafe = new Coffee();
        System.out.println("Công thức pha cafe:");
        brewCafe.prepareRecipe();
        System.out.println(brewCafe.builder.toString());

        CaffeineBeverage brewTea = new Tea();
        System.out.println("Công thức pha trà:");
        brewTea.prepareRecipe();
        System.out.println(brewTea.builder.toString());
    }
}
