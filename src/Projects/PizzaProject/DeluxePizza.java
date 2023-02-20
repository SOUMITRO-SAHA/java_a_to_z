package Projects.PizzaProject;

public class DeluxePizza extends Pizza {
    private int price;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
