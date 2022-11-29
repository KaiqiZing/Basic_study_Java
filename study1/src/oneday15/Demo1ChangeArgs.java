package oneday15;
/*
* 可变参数：当方法的参数列表数据类型已经确定但是个数不确定就可以使用可变参数；
* 原理：底层是一个数组，根据传递的参数个数不同会创建不同的长度数组，来存储这些参数；传递的参数可以是0个也可以是多个；
* 使用格式： 修饰符 返回值类型 方法名（数据类型...变量名）{ }
*注意事项：
* 1.一个方法的参数列表只能有一个可变参数
* 2.如果方法参数有多个，那么可变参数必须写在参数列表的末尾；
*
* */

public class Demo1ChangeArgs {
    public static void main(String[] args) {

        int a = addTest(1,3,4,5,6);
        int b = sumTest(10,20,30,40,50);
        System.out.println("可变参数sum结果："+ b);

    }

    public static int addTest(int...arrTest){
        System.out.println(arrTest);  // 地址值
        System.out.println(arrTest.length);  // 长度
        return 0;

    }

    public static int sumTest(int...arrTest){
        int sum = 0;
        for (int i : arrTest) {
            sum+=i;

        }
        return sum;
    }
}
