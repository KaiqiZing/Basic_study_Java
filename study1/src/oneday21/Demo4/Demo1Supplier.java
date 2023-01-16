package oneday21.Demo4;

import java.util.function.Supplier;

/*
* 常用函数式接口：
* Supplier<T> 接口被称之为生产型接口，指定接口式什么类型，那么接口中的get方法就会产生什么类型的数据*/
public class Demo1Supplier {
    public static void main(String[] args) {
        String s = getString(()->{
            return "nihao";
        });
        System.out.println(s);
        String s2 = getString(()->"nihaoyouhua");
        System.out.println(s2);


        // get max value
        int[] arr = {12,33,22,11,55,666};
        int maxvalue = getMaxValue(()->{
            int max = arr[0];
            for (int i:arr){
                if (i >max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println("max value is:"+ maxvalue);
    }

    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static int getMaxValue(Supplier<Integer> MaxValue){
        return MaxValue.get();
    }

}
