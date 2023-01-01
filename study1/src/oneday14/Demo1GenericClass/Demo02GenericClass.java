package oneday14.Demo1GenericClass;

public class Demo02GenericClass {

    public static void main(String[] args) {


        //创建GenericClass对象,泛型使用Integer类型
        GenericClass<Integer> gc = new GenericClass<>();
        gc.setName(1);
        Integer name = gc.getName();
        System.out.println(name);

        //创建GenericClass对象,泛型使用String类型
        GenericClass<String> gc2 = new GenericClass<>();
        gc2.setName("xiaom");
        String name1 = gc2.getName();
        System.out.println(name1);
    }
}
