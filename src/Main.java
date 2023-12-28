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

    // Copy Constructor:
    // Copy Constructor use to clone an object
    Keyboard(Keyboard k){
        this.id = k.id;
        this.colour = k.colour;
        this.connectivityType = k.colour;
        this.keyType = k.keyType;
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

        // Setting the values using setter methods
        k1.setId(1);
        k1.setColour("Black");
        k1.setConnectivityType("Bluetooth");
        k1.setKeyType("Mechanical");

        // Getting the Values:
        System.out.println("My Keyboard 1: color is " + k1.getColour() + " and Type of " + k1.getKeyType()
                + " and It is a " + k1.getConnectivityType() + " keyboard.");


        // Copy Constructor
        Keyboard kCopy = new Keyboard(k1);
        System.out.println("My Keyboard Copy: color is " + kCopy.getColour() + " and Type of " + kCopy.getKeyType()
                + " and It is a " + kCopy.getConnectivityType() + " keyboard.");

        // O/P:
        //OOPs
        //My Keyboard 1: color is Black and Type of Mechanical and It is a Bluetooth keyboard.
        //My Keyboard Copy: color is Black and Type of Mechanical and It is a Black keyboard.
    }
}
