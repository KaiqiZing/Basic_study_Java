package oneday14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2Generic {
    public static void main(String[] args) {
//        GenericTest1();  // ClassCastException 会报错，因为没有使用泛型做限定
        GenericTest2();

        MygenericMethod mm = new MygenericMethod();

        //含有泛型的方法
        mm.show("aaa");
        mm.show(123);
        mm.show(12.34);
    }

    private static void GenericTest1(){

        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add(5);  //由于集合没有做任何限定，任何类型都可以给其中存放
        Iterator it = coll.iterator();
        while (it.hasNext()){
            //需要打印每个字符串的长度,就要把迭代出来的对象转成String类型
            String str = (String) it.next();
            System.out.println(str.length());

        }
    }

    private static void GenericTest2(){
        Collection<String> list = new ArrayList<String>();
        list.add("123");
        list.add("ada");
//        list.add(5); // 当集合明确类型后存放类型不一致就会编译报错；
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str1 = it.next();
            System.out.println(str1);
            System.out.println(str1.length());
        }
    }

    // 含有泛型方法：修饰符 <代表泛型的变量> 返回值类型 方法名(参数){  }
    public static class MygenericMethod{
        public <MVP> void show(MVP mvp){
            System.out.println(mvp.getClass());

        }
        public <MVP> void show2(MVP mvp){
            System.out.println(mvp.getClass());
        }
    }

}
