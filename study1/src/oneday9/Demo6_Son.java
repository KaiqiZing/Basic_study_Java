package oneday9;

public class Demo6_Son extends Demo6_Father{
    int num = 20;
    @Override
    public void method(){
        super.method();
        System.out.println("子类方法");
    }
    public void show(){
        int num = 30;
        System.out.println("这是方法内变量"+num);
        System.out.println("这是this" + this.num);
        System.out.println("这是super"+super.num);
    }

}
