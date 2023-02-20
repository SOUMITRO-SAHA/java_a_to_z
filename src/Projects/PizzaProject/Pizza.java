package Projects.PizzaProject;

public class Pizza {
    // Price is the total price that will be printed in bill
    private int price;
    private Boolean isVeg;
    private String bill;

    // ======================================
    private final int basePrice;
    private final int extraCheesePrice;
    private final int extraToppingsPrice;
    private final int paperBagPrice;

    private  boolean isChessAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayAdded;

    // =====================================

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        isChessAdded = false;
        isToppingsAdded = false;
        isTakeAwayAdded = false;

        if(isVeg){
            this.basePrice = 300;
            this.extraToppingsPrice = 70;
        }
        else{
            this.basePrice = 400;
            this.extraToppingsPrice = 120;
        }

        // Initialize the base price:
        this.price = this.basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isChessAdded){
            this.price += this.extraCheesePrice;
            isChessAdded = true;
        }
    }

    public void addExtraToppings(){
        if (!isToppingsAdded) {
            this.price += this.extraToppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if (!isTakeAwayAdded){
            this.price += this.paperBagPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // If the Bill is initially Empty:
        if (this.bill == null || isTakeAwayAdded || isChessAdded || isToppingsAdded) {
            StringBuilder sb = new StringBuilder();

            // Creating the Base Price:
            sb.append("Base Price Of The Pizza: ").append(this.basePrice).append("\n");

            // Conditions:
            if (isChessAdded) {
                sb.append("Extra Cheese Added: ").append(this.extraCheesePrice).append("\n");
            }
            if (isToppingsAdded) {
                sb.append("Extra Toppings Added: ").append(this.extraToppingsPrice).append("\n");
            }
            if (isTakeAwayAdded) {
                sb.append("Paper-bag Added: ").append(this.paperBagPrice).append("\n");
            }

            // Total Price:
            sb.append("Total Price: ").append(this.getPrice());

            // Setting the Bill:
            this.bill = sb.toString();
        }
        return this.bill;
    }
}
