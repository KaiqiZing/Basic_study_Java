package oneday21.Demo3;

import java.util.Arrays;
import java.util.Comparator;

/*
    例如java.lang.Runnable接口就是一个函数式接口，
    假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行传参。
    这种情况其实和Thread类的构造方法参数为Runnable没有本质区别。
 */
public class Demo02Comparator {
    public static void main(String[] args) {
        String[] ArrayComparatorTest = {"aaa", "bbbb", "adadadad"};
        System.out.println(Arrays.toString(ArrayComparatorTest));
        Arrays.sort(ArrayComparatorTest,getComparator());
        System.out.println(Arrays.toString(ArrayComparatorTest));
    }
    public static Comparator<String> getComparator(){
        // 方法的返回值类型是一个接口，name我们可以返回这个接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()- o1.length();
//            }
//        };
//        // 方法的返回值是一个函数式接口时，可以返回一个lambda表达式
//
//        return (String o1, String o2)->{
//            return o2.length() -o1.length();
//        };

        // 优化lambda表达式
        return((o1, o2) -> o2.length()-o1.length());
    }
}


