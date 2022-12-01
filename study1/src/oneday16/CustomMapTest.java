package oneday16;

import java.util.HashMap;
import java.util.Set;

public class CustomMapTest {

    public static void main(String[] args) {
        HashMap<CustomMapDemo, String> map = new HashMap<CustomMapDemo, String>();

        map.put(new CustomMapDemo("lishi", 24), "上海");
        map.put(new CustomMapDemo("zhangsansan", 22), "北京");


        Set<CustomMapDemo> keyset = map.keySet();
        for (CustomMapDemo key:keyset){
            String value = map.get(key);
            System.out.println(key.toString()+"======"+ value);
        }



    }
}
