package oneday14;

public class DemoGenericInterface {
    public static void main(String[] args) {
        GenericInerfaceDemo1 g1 = new GenericInerfaceDemo1();
        g1.method("字符串操作 ");

        GenericInerfaceDemo1<Integer> int1 = new GenericInerfaceDemo1<>();
        int1.method( 123);

        GenericInerfaceDemo1<Double> Dub1 = new GenericInerfaceDemo1<>();
        Dub1.method(2.3);

    }
}
