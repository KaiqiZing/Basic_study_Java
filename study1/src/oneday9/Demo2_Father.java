package oneday9;

public class Demo2_Father {
    int numfa = 10;
    int num = 100;
    public void methodfather(){
        System.out.println("father"+num);
    }


    public void method_father2(){
        System.out.println("父类方法执行！");
    }
    public void  method(){
        System.out.println("父类重名执行");
    }
}
