package oneday10;

public class Demo2ExtendTest {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.methodtest();
        demo2.methoddefault();

        Demo2InterfaceA.runA();
        Demo2InterfaceA.runtest();

        Demo2InterfaceB.runB();
        Demo2InterfaceB.runtest();

    }
}
