// Explore Concepts through Commits: To delve into a specific topic, navigate to the corresponding commit.

// OLD:
//class Keyboard {
//    int id;
//    String colour;
//    String connectivityType;
//    String keyType;
//
//    // Constructor:
//    // Default Constructor
//    Keyboard() {
//        this.id = 0;
//        this.colour = "Black";
//        this.connectivityType = "Bluetooth";
//        this.keyType = "Mechanical";
//    }
//
//    // Parameterized Constructor:
//    // Customizes the Keyboard attributes based on user input
//    // 2 Parameter
//    public Keyboard(int id, String colour) {
//        this.id = id;
//        this.colour = colour;
//    }
//
//    // 3 Parameter
//    public Keyboard(int id, String colour, String connectivityType) {
//        this.id = id;
//        this.colour = colour;
//        this.connectivityType = connectivityType;
//    }
//
//    // 4 Parameter
//    Keyboard(String colour, String connectivityType, String keyType) {
//        this.colour = colour;
//        this.connectivityType = connectivityType;
//        this.keyType = keyType;
//    }
//
//    // Copy Constructor:
//    // Copy Constructor use to clone an object
//    Keyboard(Keyboard k){
//        this.id = k.id;
//        this.colour = k.colour;
//        this.connectivityType = k.colour;
//        this.keyType = k.keyType;
//    }
//
//    // Getter and Setter methods for encapsulation
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getColour() {
//        return colour;
//    }
//
//    public void setColour(String colour) {
//        this.colour = colour;
//    }
//
//    public String getConnectivityType() {
//        return connectivityType;
//    }
//
//    public void setConnectivityType(String connectivityType) {
//        this.connectivityType = connectivityType;
//    }
//
//    public String getKeyType() {
//        return keyType;
//    }
//
//    public void setKeyType(String keyType) {
//        this.keyType = keyType;
//    }
//}

// New: usage of "this" keyword:
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
    // 2 Parameter
    public Keyboard(int id, String colour) {
        this.id = id;
        this.colour = colour;
    }

    // 3 Parameter
    public Keyboard(int id, String colour, String connectivityType) {
        this(id, colour);
        this.connectivityType = connectivityType;
    }

    // 4 Parameter
    Keyboard(int id, String colour, String connectivityType, String keyType) {
        this(id, colour, connectivityType);
        this.keyType = keyType;
    }

    // Copy Constructor:
    // Copy Constructor use to clone an object
    Keyboard(Keyboard k){
        this(k.id, k.colour, k.connectivityType, k.keyType);
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
    }
}
