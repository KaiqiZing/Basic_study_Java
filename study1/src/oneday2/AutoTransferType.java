package oneday2;
/*
数据转换--计算数据时必须要保证数据的一致性，如果数据类型不一致会发生自动类型转换；
Java数据类型转换分为：
自动转换--将小范围的类型，自动提升为大的类型；转换规则：byte,short,char -->int-->long-->float-->double
强制转换--大类型强制转换为小类型；
注意：
浮点转成整数，直接取消小数点，可能造成数据损失精度。
int 强制转成 short 砍掉2个字节，可能造成数据丢失。
 */
public class AutoTransferType {
    public static void main(String[] args) {

        // 自动转换
        int i = 1;
        byte b = 2;
        int j = i + b;
        System.out.println("int, byte转换为int类型："+j);

        double d = 2.5;
        double e = d +i;
        System.out.println("double + int transfer to double:"+ e);

        //强制转换: 数据类型 变量名 = （数据类型）被转数据值
        //short类型变量，内存中2个字节
        short s = 1;
        //出现编译失败 s和1做运算的时候，1是int类型，s会被提升为int类型 s+1后的结果是int类型，将结果在赋值会short类型时发生错误 short内存2个字节，int类型4个字节 必须将int强制转成short才能完成赋值
        //s = s + 1;//编译失败
        s = (short)(s+1);//编译成功
        System.out.println(s);
        short s1 = 1234;
        s1 = (short)(s1 + 10);
        System.out.println(s1);

        /*
              1.如果没有超过左侧的范围，编译器补上强制转换
              2.如果右侧超过了左侧的范围，那么编译器会报错；
        */
        byte num1 = 30; //取值范围没有超过byte的-128到128
        //byte num2 = 128; //取值范围超过 byte的-128到128
        System.out.println(num1);
        // System.out.println(num2);


        /*
        * 常量和变量的运算：
        * */

        short result = 5+8;
        System.out.println("常量的计算："+ result);

        short num10 = 1;
        short num11 = 2;
        // short num13 = num10 + num11;


    }

}
