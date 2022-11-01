package oneday4;

import org.omg.CosNaming.BindingIterator;

/*
* 有返回值和无返回值的对比*/
public class Method_Demo2 {
    public static void main(String[] args) {
        int num = getsum(10, 20);
        System.out.println("返回值是："+num);
        System.out.println("==========");
        printsum(100,202);


        //有返回值的方法可以单独调用，打印调用，或者赋值调用
        //无返回值的方法，只能使用单独调用不能使用打印或赋值调用
//        System.out.println(printsum(););
//        int num1 = printsum(100,200);
//        System.out.println(num1);


    }

    // 有返回值
    public static int getsum(int a, int b){
        int result = a + b;
        return result;
    }
    // 无返回值,其中void代表返回值类型为空。
    public static void printsum(int a, int b){
        int result = a + b;
        System.out.println("无返回值的结果是："+ result);
    }
}
