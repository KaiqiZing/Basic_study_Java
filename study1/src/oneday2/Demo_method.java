package oneday2;
/*
方法：就是将一个功能抽取出来，把代码单独定义在一个大括号内，形成一个单独的功能；
方法必须定义在一个类中方法外，不能定义在另一个方法里面；
代码格式：
修饰符 返回值类型 方法名 (参数列表){
        代码...
        return ;
}
 */
public class Demo_method {

    public static void main(String[] args) {
        method();
        operator();
    }

    //定义方法，并调用
    public static void method(){
        System.out.println("自己定义的方法，需要被main调用执行");
    }

    //定义运算符
    public static void operator(){
        int i = 0;
        i = (1==2 ? 100: 200);
        System.out.println(i);
        int j = 0;
        j = (3<=4 ? 500:600);
        System.out.println(j);
    }
}

