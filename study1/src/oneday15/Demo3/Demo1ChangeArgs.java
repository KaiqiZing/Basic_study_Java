package oneday15.Demo3;
/*
    1.可变参数:是JDK1.5之后出现的新特性
    使用前提:
        当方法的参数列表数据类型已经确定,但是参数的个数不确定,就可以使用可变参数.
    使用格式:定义方法时使用
        修饰符 返回值类型 方法名(数据类型...变量名){}
    可变参数的原理:
        可变参数底层就是一个数组,根据传递参数个数不同,会创建不同长度的数组,来存储这些参数
        传递的参数个数,可以是0个(不传递),1,2...多个

    2. 可变参数的注意事项
        1.一个方法的参数列表,只能有一个可变参数
        2.如果方法的参数有多个,那么可变参数必须写在参数列表的末尾
 */

    /*public static void method(String b,double c,int d,int...a){
    }*/

import javafx.beans.binding.ObjectExpression;

public class Demo1ChangeArgs {
    public static void main(String[] args) {

//        int a = addTest(1,3,4,5,6);
//        int b = sumTest(10,20,30,40,50);
//        System.out.println("可变参数sum结果："+ b);
        method("abc",5.5,10,1,2,3,4);
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

    public static void method(Object...obj){
        System.out.println(obj);

    }
}
