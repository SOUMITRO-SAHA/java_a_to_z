class Keyboard {
    int id;
    String colour;
    String connectivityType;
    String keyType;

}
class Main{
    public static void main(String[] args) {
        System.out.println("OOPs");
        Keyboard k1 = new Keyboard();
        k1.colour = "Black";
        k1.connectivityType = "Bluetooth";
        k1.keyType = "Mechanical";
        System.out.println("My Keyboard color is " + k1.colour + " and Type of " + k1.keyType + " and It is a " + k1.connectivityType + " keyboard.");

    }
}
