package oneday7.Demo4;

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(4454);
        System.out.println("自动装箱："+list1);

        int num = list1.get(1);
        System.out.println("自动拆箱："+ num);
    }
}
