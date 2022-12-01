package oneday16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        Demo1();

    }

    public static void Demo1(){
        HashMap<String, String> map = new HashMap <String, String>();
        map.put("animal", "cat");
        map.put("age","12");
        System.out.println(map);
        System.out.println(map.get("age"));

        //Map集合遍历键找值方式,keyset()
        Set<String> keys = map.keySet();
        for (String key: keys){
            String value = map.get(key);
            System.out.println("遍历mapvalue："+ value);

        }

        // 通过键值对(Entry)对象，获取Entry对象中的键与值。 方法提示: getkey() getValue()
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry:entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("获取map的值，这个是key:"+  key  +"这个是value："+value);
        }
    }

}
