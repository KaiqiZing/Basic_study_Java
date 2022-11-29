package oneday15;

import java.util.HashSet;

public class CustomHashSetDemo {
    public static void main(String[] args) {
        HashSet<CustomHashSetStudent> customhashset = new HashSet<CustomHashSetStudent>();
        CustomHashSetStudent p1 = new CustomHashSetStudent("测试1", 22);
        CustomHashSetStudent p2 = new CustomHashSetStudent("测试1", 22);
        CustomHashSetStudent p3 = new CustomHashSetStudent("测试2", 22);

        customhashset.add(p1);
        customhashset.add(p2);
        customhashset.add(p3);
        System.out.println(customhashset);


    }
}
