package oneday14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1Collection {
    public static void main(String[] args) {
        collection_basic();
        collection_Iterator();
        collection_Iterator_For();
    }
    private static void collection_basic(){
        Collection<String> coll = new ArrayList<>();
        coll.add("测试1");
        coll.add("测试2");
        coll.add("测试3");
        System.out.println(coll);
        System.out.println("集合中有多少元素："+coll.size());


        System.out.println("判断是否在集合当中存在："+ coll.contains("测试1"));

        System.out.println("删除操作："+coll.remove("测试1"));

        System.out.println("集合中有多少元素："+coll.size());

        Object[]  objects = coll.toArray();
        for (int i = 0; i <objects.length ; i++) {
            System.out.println("遍历数组的结果："+ i);
        }

        System.out.println("判断集合是否为空:"+coll.isEmpty());
        coll.clear();
        System.out.println("判断集合是否为空:"+coll.isEmpty());

    }

    private static void collection_Iterator(){
        Collection<String> coll = new ArrayList<String>();
        coll.add("1");
        coll.add("2");
        coll.add("3");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

    }



    private static void collection_Iterator_For(){

        Collection<String> coll = new ArrayList<String>();
        coll.add("11");
        coll.add("22");
        coll.add("33");

        // 增强for
        for (String s:coll){
            System.out.println("增强for：" + s);
        }
    }
}
