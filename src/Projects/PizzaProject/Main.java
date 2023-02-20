package Projects.PizzaProject;

public class Main {
    public static void main(String[] args) {
//        Pizza pz = new Pizza(false);
//        pz.addExtraCheese();
//        pz.addExtraToppings();
//        pz.addTakeaway();
//        System.out.println(pz.getBill());

        DeluxePizza dp = new DeluxePizza(true);
        dp.addTakeaway();
        System.out.println(dp.getPrice());
        System.out.println(dp.getBill());
    }
}
