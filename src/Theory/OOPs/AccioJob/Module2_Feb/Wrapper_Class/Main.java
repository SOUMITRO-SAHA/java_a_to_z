package Theory.OOPs.AccioJob.Module2_Feb.Wrapper_Class;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Integer a = new Integer(5); // Creating a Wrapper Class. Here a is an object. "Wrapping" or "boxing".
        int unboxing = a.intValue(); // Here, the Object value is coverting into premitive data type. Called "Unboxing".

        Integer autoboxing = 34; // Here, the premitive datay automatically converted into an Object. Called "Autoboxing"

        System.out.println(a+" "+unboxing+" "+autoboxing);
    }
}
