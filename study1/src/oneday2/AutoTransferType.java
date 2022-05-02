package oneday2;
/*
数据转换--计算数据时必须要保证数据的一致性，如果数据类型不一致会发生自动类型转换；
Java数据类型转换分为：
自动转换--将小范围的类型，自动提升为大的类型；转换规则：byte,short,char -->int-->long-->float-->double
强制转换--大类型强制转换为小类型；
 */
public class AutoTransferType {
    public static void main(String[] args) {

        // 自动转换
        int i = 1;
        byte b = 2;
        int j = i + b;
        System.out.println(j);

        //强制转换: 数据类型 变量名 = （数据类型）被转数据值
        //short类型变量，内存中2个字节
        short s = 1;
        //出现编译失败 s和1做运算的时候，1是int类型，s会被提升为int类型 s+1后的结果是int类型，将结果在赋值会short类型时发生错误 short内存2个字节，int类型4个字节 必须将int强制转成short才能完成赋值
        //s = s + 1;//编译失败
        s = (short)(s+1);//编译成功
        System.out.println(s);

    }

}
