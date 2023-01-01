package oneday14.Demo2GenericMethod;
/*
    定义含有泛型的方法:泛型定义在方法的修饰符和返回值类型之间

    格式:
        修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
            方法体;
        }

    含有泛型的方法,在调用方法的时候确定泛型的数据类型
    传递什么类型的参数,泛型就是什么类型
 */
public class GenericMethod {
    public <M> void method1(M m){
        System.out.println("含有泛型的方法："+ m);
    }


    //静态方法,通过类名.方法名(参数)可以直接使用
    public static <S> void method2(S s){
        System.out.println("静态泛型方法："+ s);
    }
}
