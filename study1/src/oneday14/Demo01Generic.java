package oneday14;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 使用泛型和不适用泛型的区别
* 1. 使用泛型
*   避免转换类型不一致的情况，存什么类型取就是什么类型
* 2.不使用泛型
*   集合不使用泛型，默认的类型就是object类型，可以存储任意类型的数据，但是在迭代过程中会因为不同类型导致报错
* */
public class Demo01Generic {
    public static void main(String[] args) {
        show1(); // 非泛型
        show2(); // 泛型

    }

    private static void show2(){
        ArrayList<String> listFX = new ArrayList<>();
        listFX.add("qew");
        Iterator<String> it = listFX.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println("获取长度：" + s.length());
        }

    }


    private static void show1(){
        ArrayList listdemo = new ArrayList();

        listdemo.add("abc");
        listdemo.add(1);

        Iterator it = listdemo.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println("遍历非泛型数据："+ obj);


            //想要使用String类特有的方法,length获取字符串的长度;不能使用  多态 Object obj = "abc";
            //需要向下转型
            //会抛出ClassCastException类型转换异常,不能把Integer类型转换为String类型
//            String s = (String) obj;
//            System.out.println(s.length());

        }

    }
}
