package oneday22.Demo6;
/*
    通过类名引用静态成员方法
    类已经存在,静态成员方法也已经存在
    就可以通过类名直接引用静态成员方法
 */
public class Demo01StaticMethodReference {
    public static void main(String[] args) {
        int number = method(-10,(n)->{
            return Math.abs(n);
        });
        System.out.println(number);
        //使用方法引用优化lambda表达式，math类式存在的，

        int number2 = method(-10, Math::abs);
        System.out.println(number2);
    }

    public static int method(int number, Calcable calcable){
        return calcable.calsAbs(number);

    }
}
