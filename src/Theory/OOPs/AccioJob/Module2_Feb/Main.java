package Theory.OOPs.AccioJob.Module2_Feb;

public class Main {
    public static void main(String[] args) {
        ComplexNumber cn = new ComplexNumber(5,2);
        cn.display();
        cn.add("2+3i");
        cn.display();

        /*ComplexNumber cn2 = ComplexNumber.copy(cn);
        cn2.display();*/
        ComplexNumber cn2 = new ComplexNumber(cn);
        cn2.display();
        cn2.add(3, 4);
        cn2.display();

    }
}
