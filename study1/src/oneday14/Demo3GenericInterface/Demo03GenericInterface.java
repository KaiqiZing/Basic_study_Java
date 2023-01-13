package oneday14.Demo3GenericInterface;
/*
    测试含有泛型的接口
 */
public class Demo03GenericInterface {

    public static void main(String[] args) {
        GenericInterfaceImp1 gi1 = new GenericInterfaceImp1();
        gi1.method("字符串");
        gi1.method(String.valueOf(12));

        GenericInterfaceImp2<Integer> gi2 = new GenericInterfaceImp2<>();
        gi2.method(10);
        GenericInterfaceImp2<String> gi3 = new GenericInterfaceImp2<>();
        gi3.method("你好");
    }
}
