package oneday14.Demo1GenericClass;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 泛型
* 使用泛型：
*   避免类型转换的麻烦，存储什么类型取出来就是什么类型；
* 不使用泛型：
*   不用泛型，默认类型就是Object类型，可以存储 任意类型的数据，但是不安全会引发异常
* */
public class Demo01Generic {
    public static void main(String[] args) {
        show1();

        show2();

    }

    private static void show1(){
        ArrayList demo1a = new ArrayList();
        demo1a.add("abc");
        demo1a.add(1);

        Iterator it = demo1a.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类特有的方法,length获取字符串的长度;不能使用  多态 Object obj = "abc";
            //需要向下转型
            //会抛出ClassCastException类型转换异常,不能把Integer类型转换为String类型
//            String s = (String)obj;
//            System.out.println(s.length());

        }
    }


    private static void show2(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abc");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println("泛型:"+s);
            System.out.println(s.length());
        }
    }
}
