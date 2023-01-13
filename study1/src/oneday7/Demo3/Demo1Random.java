package oneday7.Demo3;

/*
Random类用来生成随机数字。使用起来也是三个步骤：

1. 导包
import java.util.Random;

2. 创建
Random r = new Random(); // 小括号当中留空即可

3. 使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
实际上代表的含义是：[0,3)，也就是0~2
 */


import java.util.Random;

public class Demo1Random {

    public static void main(String[] args) {
        RandomTest1();
        RandowTest2();

    }

    public static void RandomTest1(){
        Random rm = new Random();
        int num = rm.nextInt(300);
        System.out.println("随机数基本操作："+ num);
    }

    public static void RandowTest2(){
        Random rm2 = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rm2.nextInt(10);
            System.out.println(num);

        }
    }
}
