package oneday13.Demo2;

import java.util.ArrayList;

/*
    装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
        构造方法:
            Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值。
            Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
                传递的字符串,必须是基本类型的字符串,否则会抛出异常 "100" 正确  "a" 抛异常
        静态方法:
            static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。
            static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象。
    拆箱:在包装类中取出基本类型的数据(包装类->基本类型的数据)
        成员方法:
            int intValue() 以 int 类型返回该 Integer 的值。
 */
public class Demo2Integer {
    public static void main(String[] args) {
        /*装箱：把基本类型的数据，包装到包装类中（基本类型的数据-> 包装类
        * */
        Integer int_test1 = new Integer(1);
        System.out.println(int_test1);
        Integer int_test2 = new Integer("2");
        System.out.println("整数："+int_test2);

        Integer int_static1 = Integer.valueOf(1);
        System.out.println(int_static1);
        Integer int_static2 = Integer.parseInt("2");
        System.out.println(int_static2);

        int i = int_test1.intValue();
        System.out.println("拆箱："+ i);


    }

    // 自动装箱与自动拆箱:基本类型的数据和包装类之间可以自动的相互转换
    public void Demo02AutoChange(){
            /*
            自动装箱:直接把int类型的整数赋值包装类
            Integer in = 1; 就相当于 Integer in = new Integer(1);
         */
        Integer in = 1;

        /*
            自动拆箱:in是包装类,无法直接参与运算,可以自动转换为基本数据类型,在进行计算
            in+2;就相当于 in.intVale() + 2 = 3
            in = in.intVale() + 2 = 3 又是一个自动装箱
         */
        in = in+2;

        ArrayList<Integer> list = new ArrayList<>();
        /*
            ArrayList集合无法直接存储整数,可以存储Integer包装类
         */
        list.add(1); //-->自动装箱 list.add(new Integer(1));

        int a = list.get(0); //-->自动拆箱  list.get(0).intValue();

    }
}
