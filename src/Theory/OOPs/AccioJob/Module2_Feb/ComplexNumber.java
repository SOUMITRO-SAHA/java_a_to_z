package Theory.OOPs.AccioJob.Module2_Feb;

public class ComplexNumber {
    // Variables:
    private int real;
    private int imaginary;

    // Non-Parameterised Constructor:
    ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }
    // Parameterised Constructor
    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy Constructor:
    public ComplexNumber(ComplexNumber c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    /*
    // Copying the Complex Number to create new CN:
    static ComplexNumber copy(ComplexNumber c) {
        ComplexNumber cn = new ComplexNumber(c.real, c.imaginary);
        return cn;
    }
    */
    // Methods:
    // Method Overloading: Compile time Polymorphism.
    void add(int real, int imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    void add(String s) {
        char r = s.charAt(0);
        char i = s.charAt(2);
        this.real += r - '0';
        this.imaginary += i - '0';
    }

    void display(){
        System.out.print("The Complex Number is : ");
        System.out.println(real + "+" + imaginary + "i");
    }

}
