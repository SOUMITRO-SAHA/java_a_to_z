class Keyboard {
    int id;
    String colour;
    String connectivityType;
    String keyType;

    // Constructor:
    // Default Constructor
    Keyboard() {
        this.id = 0;
        this.colour = "Black";
        this.connectivityType = "Bluetooth";
        this.keyType = "Mechanical";
    }

    // Parameterized Constructor:
    // Customizes the Keyboard attributes based on user input
    Keyboard(String colour, String connectivityType, String keyType) {
        this.colour = colour;
        this.connectivityType = connectivityType;
        this.keyType = keyType;
    }

    // Getter and Setter methods for encapsulation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getConnectivityType() {
        return connectivityType;
    }

    public void setConnectivityType(String connectivityType) {
        this.connectivityType = connectivityType;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("OOPs");

        // Creating a new Keyboard object using the default constructor
        Keyboard k1 = new Keyboard();

       // Avoiding direct attribute access and using setters for a safer code
//        k1.colour = "Black"; // Not recommended due to potential mistakes
//        k1.connectivityType = "Bluetooth";
//        k1.keyType = "Mechanical";
//        System.out.println("My Keyboard color is " + k1.colour + " and Type of " + k1.keyType + " and It is a " + k1.connectivityType + " keyboard.");

        // Setting the values using setter methods
        k1.setId(1);
        k1.setColour("Black");
        k1.setConnectivityType("Bluetooth");
        k1.setKeyType("Mechanical");

        // Getting the Values:
        System.out.println("My Keyboard color is " + k1.getColour() + " and Type of " + k1.getKeyType()
                + " and It is a " + k1.getConnectivityType() + " keyboard.");
        // But again this is not the ultimate solution from preventing some to access the attributes directly, to achive that we are goint to study
        // access modifier in later.
    }
}
