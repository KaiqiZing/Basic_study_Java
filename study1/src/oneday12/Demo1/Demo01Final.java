package oneday12.Demo1;

/*
final： 不可改变。可以用于修饰类、方法和变量。
    类：被修饰的类，不能被继承。
    方法：被修饰的方法，不能被重写。
    变量：被修饰的变量，不能被重新赋值。
当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写。
    格式：
    修饰符 final 返回值类型 方法名称(参数列表) {
        // 方法体
    }

注意事项：
    1.对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾。
    2.不能使用final类作为父类；
    3.final类中的所有成员方法都无法进行重写且不能有任何子类

 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 =10;
        System.out.println("未使用final关键字："+num1);
        num1 = 20;
        System.out.println("未使用final关键字："+num1);
        final  int num2 = 200;
        System.out.println("使用final关键字："+num2);
        //  num2 = 30; 错误写法，无法改变
        System.out.println("=============");

        /*对于基本类型来说，不可变说的是变量当中的数据不可改变；
        * 对于引用类型来说，不可变说的是变量当中的地址值不可改变*/
        FinalStudent stu1 = new FinalStudent("final关键字");
        System.out.println(stu1.getName());
        stu1 = new FinalStudent("地址可变更");
        System.out.println(stu1.getName());

        final FinalStudent stu2 = new FinalStudent("final关键字对象");
        System.out.println(stu2.getName());
//        stu2 = new FinalStudent("不可变更");




    }
}
