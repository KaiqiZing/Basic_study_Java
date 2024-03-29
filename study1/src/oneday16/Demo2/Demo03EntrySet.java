package oneday16.Demo2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合遍历的第二种方式:使用Entry对象遍历

    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。

    实现步骤:
        1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("测试1",168);
        map.put("测试2",165);
        map.put("测试3",178);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
                Map.Entry<String, Integer> entry = it.next();
                String key = entry.getKey();
                Integer value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }

    }
}
