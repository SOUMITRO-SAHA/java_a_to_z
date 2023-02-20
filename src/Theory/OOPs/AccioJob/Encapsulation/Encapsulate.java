package Theory.OOPs.AccioJob.Encapsulation;

public class Encapsulate {
    public static void main(String[] args) {
        // ================= [Private Class] ================= //
        // 1. [Private Class] Calling in same package non-subclass:

        private_class pv = new private_class();
//        pv.sayHiInPrivate(); // We can not call a private method. Outside the class;


        // ================= [Public Class] ================= //
        // 1. [Public Class] Calling in same package non-subclass:
        public_class p = new public_class();
        p.sayHi();

        // ================= [Protected Class] ================= //


        // ================= [Default Class] ================= //


    }
}
