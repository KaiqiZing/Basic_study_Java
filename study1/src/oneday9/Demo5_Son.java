package oneday9;

public class Demo5_Son extends Demo5_Father{
//    public Demo5_Son(){
//        super();  // 调用父类无参数构造方法
////        super(20);  // 调用父类重载的构造方法；前提是只能调用一个super且是第一个
//        System.out.println("子类构造方法！！！！");
//    }

    /*super关键字的使用
    * 在子类的成员方法中，访问父类的成员变量和成员方法；
    * 在子类的构造方法中，访问父类的构造方法；
    * */

//    int num = 20;
//    public Demo5_Son(){
//        super();
//    }
//    public void method_son(){
//        System.out.println(super.num);
//    }
//
//    public void method(){
//        super.method_father();
//        System.out.println("子类方法");
//    }

    /*this 关键字
    * 本类成员方法中，访问本类成员变量和另一个成员方法；
    * 本类成员方法中，访问本类另一个构造方法*/
    int num = 20;
    public Demo5_Son(){
        this(123);
    }
    public Demo5_Son(int n){
        this(1,2);
    }
    public Demo5_Son(int n , int m){
    }
    public void  shownum(){
        int num = 40;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);

    }

    public void methodA(){
        System.out.println("AAA");

    }

    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }

}
