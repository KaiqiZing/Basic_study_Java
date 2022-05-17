package oneday9;

public class Demo2_Son extends Demo2_Father{
    int son_num = 20;
    int num = 200;

    public void methodson(){
        int num = 30;
        System.out.println("这是子类"+num);

    }

    public void  method_son1(){

        int num = 30;
        System.out.println("这是子类"+num);  // 局部变量
        System.out.println("本类的成员变量"+this.num); // 本类的成员变量
        System.out.println("父类的成员变量"+super.num);  // 父类的成员变量

    }

    public void method_son2(){
        System.out.println("子类方法执行！");
    }
    public void  method(){
        System.out.println("子类重名执行");
    }
}
