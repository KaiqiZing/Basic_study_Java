package oneday2;

/*
运算符：
+ 加法运算，字符串连接运算
- 减法运算
* 乘法运算
/ 除法运算
% 取模运算，两个数字相除取余数
 ++ 、 -- 自增自减运算，++ 运算，变量自己增长1。反之， -- 运算，变量自己减少1，用法与 ++ 一致。

 */

public class Operator {
    public static void main(String[] args) {
        //算术运算符
        int i = 123;
        System.out.println(i*100/2);;

        //混合运算，前++/-- 和 后++/--区别
        int a = 1;
        int b = ++a;
        System.out.println(b);  // 2

        int c = 1;
        int d = c++;
        System.out.println(d);  // 1

        // 赋值运算符
        int test1 = 5;
        test1 += 5;
        System.out.println(test1);

        //比较运算符
        System.out.println(1==1);//true
        System.out.println(1<2);//true
        System.out.println(3>4);//false
        System.out.println(3<=4);//true
        System.out.println(3>=4);//false
        System.out.println(3!=4);//true

        // 逻辑运算符
        //and
        System.out.println(true && true);
        System.out.println(true && false);//false
        System.out.println(false && true);//false，右边不计算
        //or
        System.out.println(false || false);//falase
        System.out.println(false || true);//true
        System.out.println(true || false);//true，右边不计算
        //not
        System.out.println(!false);//true

        // 三元运算符： 数据类型 变量名 = 布尔类型表达式 结果1：结果2
        // 布尔类型表达式结果为TRUE，三元运算符结果为2，赋值为变量；反之结果为1，赋值给变量
        int j = (1==2 ? 100 : 200);
        System.out.println(j);
        int k = (3<=4 ? 500 : 600);
        System.out.println(k);

    }

}
