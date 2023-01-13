package oneday14.Demo4GenericTPF;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 泛型通配符
*  ？：代表任意数据类型
*  使用方法：不能创建对象使用；只能作为方法的参数使用；
* */
public class Demo4Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String>  list2 = new ArrayList<>();

        list1.add(11);
        list1.add(22);
        list2.add("a");
        list2.add("b");

        printArray(list1);
        printArray(list2);



    }


    /*
        定义一个方法,能遍历所有类型的ArrayList集合
        这时候我们不知道ArrayList集合使用什么数据类型,可以泛型的通配符?来接收数据类型
        注意:泛型没有继承概念的
     */
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object result  = it.next();
            System.out.println(result);

        }



    }
}
