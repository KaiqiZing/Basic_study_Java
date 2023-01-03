package oneday14.GenericClass;

public class Demo3GenericClassTest {
    public static void main(String[] args) {
      Demo3GenericClass<Integer> gc = new Demo3GenericClass<>();
      gc.setName(1);
      Integer name = gc.getName();
      System.out.println("泛型整数类型："+ name);

      Demo3GenericClass<String> gc1 = new Demo3GenericClass<>();
      gc1.setName("小米");
      String name1 = gc1.getName();
        System.out.println("泛型字符串类型"+ name1);


    }
}
